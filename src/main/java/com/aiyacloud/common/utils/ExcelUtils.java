package com.aiyacloud.common.utils;

import org.apache.commons.lang.StringUtils;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by iMac27 on 16/3/15.
 */
public class ExcelUtils {
    private static final Logger log = LoggerFactory.getLogger(ExcelUtils.class);

    /**
     * 导出excle
     *
     * @param dataList
     * @return
     */
    @SuppressWarnings("resource")
    public static byte[] exportXls(List<List<String>> dataList) {
        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            HSSFWorkbook wb = new HSSFWorkbook();
            HSSFSheet sheet1 = wb.createSheet("sheet1");

            for (int i = 0; i < dataList.size(); i++) {
                List<String> rowData = dataList.get(i);
                HSSFRow row = sheet1.createRow((short) i);
                for (int j = 0; j < rowData.size(); j++) {
                    String valueStr = rowData.get(j);
                    row.createCell(j).setCellValue(valueStr);
                }
            }
            wb.write(out);
            return out.toByteArray();
        } catch (Exception e) {
            log.error("exprotXls exception.", e);
        }
        return null;
    }

    /**
     * 导入excel
     *
     * @param xlsFilePath
     * @return
     */
    public static List<List<String>> importXls(String xlsFilePath) {
        File file = new File(xlsFilePath);
        if (file == null || !file.exists())
            return new ArrayList<>();
        try {
            InputStream in = new FileInputStream(file);
            return ExcelUtils.importXls(in);
        } catch (Exception e) {
            log.error("importXls exception.", e);
        }
        return new ArrayList<>();
    }

    @SuppressWarnings("resource")
    public static List<List<String>> importXls(InputStream inputStream) {
        List<List<String>> resultList = null;
        Workbook hssfWorkbook = null;
        if (inputStream == null)
            return null;
        try {
            hssfWorkbook = WorkbookFactory.create(inputStream);
            resultList = new ArrayList<List<String>>();
            // 循环工作表Sheet,默认只有1个sheet
            // for (int numSheet = 0; numSheet <
            // hssfWorkbook.getNumberOfSheets(); numSheet++) {
            for (int numSheet = 0; numSheet < 1; numSheet++) {
                Sheet hssfSheet = hssfWorkbook.getSheetAt(numSheet);
                if (hssfSheet == null) {
                    continue;
                }
                // 循环行Row
                for (int rowNum = 0; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
                    List<String> rowValues = new ArrayList<>();
                    Row hssfRow = hssfSheet.getRow(rowNum);
                    if (hssfRow == null) {
                        continue;
                    }
                    String blank = "";
                    for (int i = 0; i < hssfRow.getLastCellNum(); i++) {
                        Cell brandIdHSSFCell = hssfRow.getCell(i);
                        String tmpValue = getCellData(brandIdHSSFCell);
                        rowValues.add(tmpValue);
                        blank += tmpValue;
                    }
                    if (StringUtils.isNotBlank(blank)) {
                        resultList.add(rowValues);
                    }
                }
            }
            return resultList;
        } catch (Exception e) {
            log.error("importXls exception.", e);
        } finally {
            if (hssfWorkbook != null) {
                try {
                    hssfWorkbook.close();
                } catch (IOException e) {
                    log.error("workbook close exception.", e);
                }
            }
        }
        return null;
    }

    private static String getCellData(Cell cell) {
        if (cell == null) {
            return "";
        }

        switch (cell.getCellType()) {
            case HSSFCell.CELL_TYPE_STRING:
                return cell.getStringCellValue();
            case HSSFCell.CELL_TYPE_NUMERIC: {
                if (HSSFDateUtil.isCellDateFormatted(cell)) {
                    cell.getDateCellValue();
                    // 把Date转换成本地格式的字符串
                    String cellvalue = cell.getDateCellValue().toString();
                    return cellvalue;
                }
                // 如果是纯数字
                else {
                    String cellValue = "";
                    double cellNum = cell.getNumericCellValue();
                    if ((cellNum - (int) cellNum) > 0) {
                        cellValue = cellNum + "";
                    } else {
                        cellValue = (int) cellNum + "";
                    }
                    return cellValue;
                }
            }
            case HSSFCell.CELL_TYPE_BOOLEAN:
                return cell.getBooleanCellValue() ? "1" : "0";
            case HSSFCell.CELL_TYPE_FORMULA:
                return cell.getCellFormula();
            default:
                return "";
        }
    }

    public static String safeGetValueFromCell(List<String> valueCell, int index) {
        if (valueCell.size() > index) {
            return valueCell.get(index);
        }
        return "";
    }

    public static String safeGetValue(String value) {
        if (value == null)
            return "";
        return value;
    }
}
