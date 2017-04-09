package com.file.util;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class FileUtil {
	static{
		System.loadLibrary("fileTime");
	}
   public native static String getFileCreateTime(String filePath);
   
   public static void main(String[] args) {
	 
  	  try {
  		 File file = new File("F:\\work\\studay\\C");
  		 long folderSize = 0;
  		 if(file.isDirectory()){
  			 File files [] = file.listFiles();
  			 for (File file2 : files) {
				if(file2.isDirectory()){
					
				}else{
					folderSize += file2.length();
				}
			}
  		 }
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
