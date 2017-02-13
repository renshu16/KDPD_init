package com.aiyacloud.common.utils;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class DecimalUtil {

 /**
  * 格式化百分数
  * @param x
  * @param y
  * @return
  */
 public static String getPercent(int x, int y) {
  double percentX = x * 1.0;
  double percentY = y * 1.0;
  double percent = percentX / percentY;
  DecimalFormat df = new DecimalFormat("##.00%");
  return df.format(percent);
 }
 
 /**
  * 格式化两位小数
  * @param x
  * @param y
  * @return
  */
 public static String getDecimalForTwo(int x, int y) {
  double decimalX = x * 1.0;
  double decimalY = y * 1.0;
  double decimal = decimalX / decimalY;
  NumberFormat df = new DecimalFormat("#.00");
  return df.format(decimal);
 }
}
