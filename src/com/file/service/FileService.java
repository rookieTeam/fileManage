package com.file.service;

import java.io.File;
import java.util.Date;

import com.file.entity.FileInfo;
import com.file.util.DateUtil;
import com.file.util.FileUtil;

public class FileService {
	public static void main(String[] args) {
		String filePath ="F:\\work\\studay\\C";
		FileService fs = new FileService();
		try {
			fs.calculateFile(filePath);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
     public void calculateFile(String filePath) throws Exception{
    	 File file = new File(filePath);
    	 FileInfo fi = getFile(file);
    	// System.out.println(fi.toString());
    	  
     }
     
     private FileInfo getFile(File file) throws Exception{
    	 FileInfo fileInfo = new FileInfo();
		 initFileInfo(fileInfo, file);
		 long folderSize =0;
    	 if(file.isDirectory()){
    		 File files [] = file.listFiles(); //获取文件夹下的所有文件
    		 for (File file2 : files) {
    			 
				if(file2.isDirectory()){
					getFile(file2);
				}else{
					 FileInfo fileChild = new FileInfo();
					 initFileInfo(fileChild, file2);
					 fileInfo.setSize(file2.length());
					folderSize += file2.length();
				}
			}
    		 fileInfo.setSize(folderSize); 
    	 }else{
    		 fileInfo.setSize(file.length());
    		 folderSize+=file.length();
    	 }
    	 System.out.println(fileInfo.toString());
    	 return fileInfo;
     }
     
     private void initFileInfo(FileInfo fileInfo,File file) throws Exception{
    	 fileInfo.setCreateTime(getFileCreateTime(file.getAbsolutePath()));
		 fileInfo.setFileName(file.getName());
		 fileInfo.setUpdateTime(new Date(file.lastModified()));
		 fileInfo.setLocation(file.getAbsolutePath());
     }
     
     private Date getFileCreateTime(String filePath) throws Exception{
    	 String eNcreateTimeStr = FileUtil.getFileCreateTime(filePath);
    	 String createTimeStr =DateUtil.enDateConvertZh(eNcreateTimeStr);
    	 return DateUtil.strForamatDate(createTimeStr);
    	 
     }
}
