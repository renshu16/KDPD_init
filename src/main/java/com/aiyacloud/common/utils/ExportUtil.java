
/**
                   _ooOoo_
                  o8888888o
                  88" . "88
                  (| -_- |)
                  O\  =  /O
               ____/`---'\____
             .'  \\|     |//  `.
            /  \\|||  :  |||//  \
           /  _||||| -:- |||||-  \
           |   | \\\  -  /// |   |
           | \_|  ''\---/''  |   |
           \  .-\__  `-`  ___/-. /
         ___`. .'  /--.--\  `. . __
      ."" '<  `.___\_<|>_/___.'  >'"".
     | | :  `- \`.;`\ _ /`;.`/ - ` : | |
     \  \ `-.   \_ __\ /__ _/   .-` /  /
======`-.____`-.___\_____/___.-`____.-'======
                   `=---='
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
            佛祖保佑       永无BUG

 */

package com.aiyacloud.common.utils;

import net.sf.jxls.exception.ParsePropertyException;
import net.sf.jxls.transformer.XLSTransformer;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.springframework.util.ResourceUtils;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;






public class ExportUtil {
    /**
     *  导出数据到excel
     * @param fileName 导出的文件名
     * @param templateName 模版文件名,默认放在classpath:template/下
     * @param response
     * @param values 参数
     * @throws Exception
     */
    public static void export(String fileName, String templateName, HttpServletResponse response, Map values) throws Exception{
        export(fileName,templateName,response,values,null);
    }

    public static void export(String fileName, String templateName, HttpServletResponse response, Map values,List<CellRangeAddress> ranges) throws Exception {
        InputStream in = null;
        OutputStream out = null;
        try {
            File templateFile = ResourceUtils.getFile("classpath:template/" + templateName);
            XLSTransformer transformer = new XLSTransformer();
            response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(fileName, "UTF-8"));
            response.setContentType("application/vnd.ms-excel");
            in = new BufferedInputStream(new FileInputStream(templateFile));
            out = response.getOutputStream();
            Workbook workbook = null;
            try {
                workbook = transformer.transformXLS(in, values);
            } catch (ParsePropertyException e) {
                System.out.print("ParsePropertyException");
                e.printStackTrace();
            } catch (org.apache.poi.openxml4j.exceptions.InvalidFormatException e) {
                System.out.print("InvalidFormatException");
                e.printStackTrace();
            }

            if(ranges!=null && ranges.size()>0){
                HSSFSheet sheet = (HSSFSheet) workbook.getSheetAt(0);
                for(CellRangeAddress range:ranges){
                    sheet.addMergedRegion(range);
                }
            }

            //将内容写入输出流并把缓存的内容全部发出去
            workbook.write(out);
            out.flush();
        } catch (FileNotFoundException e) {
            throw new Exception("template not found , fileName :" + fileName + " . please put your template in  resource/template ");
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                }
            }
        }
    }

}
