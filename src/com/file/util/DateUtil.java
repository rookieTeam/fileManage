package com.file.util;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class DateUtil {
   private static String defaultDateTime ="yyyy-MM-dd HH:mm:ss";
   private static String defaultDate ="yyyy-MM-dd";
   
   /**
    * 英文时间格式转中文yyyy-MM-dd HH:mm:ss
    * @param dateTimeStr
    * @return
    * @throws Exception
    */
   public static String enDateConvertZh(String dateTimeStr) throws Exception{
	   SimpleDateFormat pSdf=new SimpleDateFormat("EEE MMM DD HH:mm:ss yyyy",Locale.ENGLISH);
	   SimpleDateFormat fSdf=new SimpleDateFormat(defaultDateTime);
	   return fSdf.format(pSdf.parse(dateTimeStr));
   }
}
