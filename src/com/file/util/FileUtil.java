package com.file.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class FileUtil {
	static{
		System.loadLibrary("fileTime");
	}
   public native String getFileCreateTime(String filePath);
   
   public static void main(String[] args) {
	  FileUtil fileUtil = new FileUtil();
	  System.out.println(fileUtil.getFileCreateTime("F:\\work\\studay\\C"));
	  String dateStr ="Fri Apr 07 16:36:16 2017";
	  SimpleDateFormat pSdf=new SimpleDateFormat("EEE MMM DD HH:mm:ss yyyy",Locale.ENGLISH);
  	  SimpleDateFormat fSdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
  	  try {
  		 System.out.println(pSdf.parse(dateStr));
	     System.out.println(fSdf.format(pSdf.parse(dateStr)));
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
