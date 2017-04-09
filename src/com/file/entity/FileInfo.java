package com.file.entity;

import java.util.Date;
import java.util.List;

public class FileInfo {
	
	private String fileName; //�ļ�������
    private Date createTime;//����ʱ��
    private Integer size;//�ļ��д�С 
    private Date updateTime;//�޸�ʱ��
    private String location;//λ��
    private Integer type;//����
    private List<FileInfo> fileInfo;
    private Integer folderCount; //�ļ�������
    private Integer fileCount; //�ļ�����
    
    
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public List<FileInfo> getFileInfo() {
		return fileInfo;
	}
	public void setFileInfo(List<FileInfo> fileInfo) {
		this.fileInfo = fileInfo;
	}
	public Integer getFolderCount() {
		return folderCount;
	}
	public void setFolderCount(Integer folderCount) {
		this.folderCount = folderCount;
	}
	public Integer getFileCount() {
		return fileCount;
	}
	public void setFileCount(Integer fileCount) {
		this.fileCount = fileCount;
	}
    
}
