package com.aiyacloud.service.impl;

import com.aiyacloud.common.utils.ExcelUtils;
import com.aiyacloud.common.utils.FileUploadHelper;
import com.aiyacloud.dao.domain.entity.StocktakeGoods;
import com.aiyacloud.dao.domain.entity.StocktakeMain;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by hx on 2016-12-09.
 */
@Service
public class StocktakeService {

    /**
     * 新增一个盘点
     *
     * @param goodsExcel 盘点excel
     * @param priceExcel 价格excel
     * @param name       盘点名称
     */
    public void newStocktake(MultipartFile goodsExcel, MultipartFile priceExcel, String name) {
        String goodsExcelPath = "c:" + FileUploadHelper.uploadFile(goodsExcel);
        String priceExcelPath = "c:" + FileUploadHelper.uploadFile(priceExcel);

        List<StocktakeGoods> goodsList = excelToGoodses(goodsExcelPath, priceExcelPath);


        StocktakeMain main = new StocktakeMain();
        main.setGoodsExcelPath(goodsExcelPath);
        main.setPriceExcelPath(priceExcelPath);
        main.setGoodsExcelName(goodsExcel.getOriginalFilename());
        main.setPriceExcelName(priceExcel.getOriginalFilename());
        main.setCreateAt(new Date());
        main.setName(name);
//        main.setUserId();
        main.setBookNum(0);
        main.setBookAmount(BigDecimal.ZERO);

        goodsList.forEach(goods -> {
            if (goods.getGoodsPrice() == null) {
                //TODO 无法获得价格警告
                goods.setGoodsPrice(BigDecimal.ZERO);

            }
            main.setBookNum(main.getBookNum() + goods.getBasicUnitBookNum());
            main.setBookAmount(main.getBookAmount().add(goods.getGoodsPrice().multiply(new BigDecimal(goods.getBasicUnitBookNum()))));
        });

        System.out.println("");
    }

    /**
     * 从excel中导入物料信息
     *
     * @param goodsExcelPath 盘点excel路径
     * @param priceExcelPath 价格excel路径
     * @return 物料列表
     */
    private List<StocktakeGoods> excelToGoodses(String goodsExcelPath, String priceExcelPath) {
        List<List<String>> lists = ExcelUtils.importXls(goodsExcelPath);
        Map<String, List<StocktakeGoods>> goodsMap = new HashMap<>();
        lists.remove(0);//取掉表头
        lists.forEach(list -> {
            StocktakeGoods goods = new StocktakeGoods();
            goods.setWarehouseCode(list.get(0));
            goods.setWarehouse(list.get(1));
            goods.setPositionCode(list.get(2));
            goods.setPosition(list.get(3));
            goods.setGoodsCode(list.get(4));
            goods.setGoodsName(list.get(5));
            goods.setGoodsSpec(list.get(6));
            goods.setBatch(list.get(9));
            goods.setPurchaseDate(list.get(10));
            if (StringUtils.isNotEmpty(list.get(11)))
                goods.setQualityGuaranteePeriod(Integer.parseInt(list.get(11)));
            goods.setBasicUnitCode(list.get(12));
            goods.setBasicUnit(list.get(13));
            if (StringUtils.isNotEmpty(list.get(14)))
                goods.setBasicUnitBookNum(Integer.parseInt(list.get(14)));
            goods.setBasicUnitStocktakeNum(0);
            goods.setUnitCode(list.get(17));
            goods.setUnit(list.get(18));
            goods.setBrand(list.get(19));
            goods.setBarCode(list.get(20));
            if (StringUtils.isNotEmpty(list.get(22)))
                goods.setBookNum(Integer.parseInt(list.get(22)));
            goods.setStocktakeNum(0);
            goods.setDiffNum(0);
            List<StocktakeGoods> goodsList = goodsMap.get(goods.getGoodsCode());
            if (goodsList == null) {
                goodsList = new ArrayList<>();
                goodsMap.put(goods.getGoodsCode(), goodsList);
            }
            goodsList.add(goods);
        });

        List<List<String>> prices = ExcelUtils.importXls(priceExcelPath);
        prices.remove(0);
        prices.forEach(price -> {
            List<StocktakeGoods> goodsList = null;
            if (price.size() > 4)
                goodsList = goodsMap.get(price.get(4));

            if (goodsList == null)
                return;
            BigDecimal amount = null;
            if (price.size() > 18 && StringUtils.isNotEmpty(price.get(18))) {
                amount = new BigDecimal(price.get(18));
            } else if (price.size() > 12 && StringUtils.isNotEmpty(price.get(12))) {
                amount = new BigDecimal(price.get(12));
            } else if (price.size() > 15 && StringUtils.isNotEmpty(price.get(15))) {
                amount = new BigDecimal(price.get(15));
            }
            for (StocktakeGoods goods : goodsList) {
                goods.setGoodsPrice(amount);
            }
        });
        List<StocktakeGoods> goodsList = new ArrayList<>();
        for (List<StocktakeGoods> value : goodsMap.values()) {
            goodsList.addAll(value);
        }
        return goodsList;
    }
}
