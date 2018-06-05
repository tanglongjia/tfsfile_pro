package com.cn.bean;

import java.io.File;

public class FileBean {

	private String fileName;

	private String dire01;

	private String dire02;

	private String dire03;

	private String dire04;

	private String dire05;
	
	private String modifyTime;
	
	private String mergeCol;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getDire01() {
		return dire01;
	}

	public void setDire01(String dire01) {
		this.dire01 = dire01;
	}

	public String getDire02() {
		return dire02;
	}

	public void setDire02(String dire02) {
		this.dire02 = dire02;
	}

	public String getDire03() {
		return dire03;
	}

	public void setDire03(String dire03) {
		this.dire03 = dire03;
	}

	public String getDire04() {
		return dire04;
	}

	public void setDire04(String dire04) {
		this.dire04 = dire04;
	}

	public String getDire05() {
		return dire05;
	}

	public void setDire05(String dire05) {
		this.dire05 = dire05;
	}
	
	@Override
	public String toString() {
		String str = dire01+File.separator+dire02+File.separator+dire03+File.separator+dire04+File.separator+dire05+fileName;
		str = str.replaceAll("null", "");
		return str;
		
	}

	public String getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getMergeCol() {
		return mergeCol;
	}

	public void setMergeCol(String mergeCol) {
		this.mergeCol = mergeCol;
	}
	

}
