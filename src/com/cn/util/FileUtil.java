package com.cn.util;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cn.bean.FileBean;

public class FileUtil {

	public static ArrayList<String> listname = new ArrayList<String>();

	/**
	 * 根据文件路径 读取目录下面所有文件
	 * @param filepath
	 */
	public static void readAllFile(String filepath) {
		File file = new File(filepath);
		java.text.SimpleDateFormat df = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		if (!file.isDirectory()) {
			listname.add(file.getAbsolutePath()+File.separator+df.format(new Date(file.lastModified()))+File.separator+"1");//1表示文件 2表示目录
		} else if (file.isDirectory()) {
			String[] filelist = file.list();
			if(filelist.length > 0){
				for (int i = 0; i < filelist.length; i++) {
					File readfile = new File(filepath);
					if (!readfile.isDirectory()) {
						listname.add(file.getAbsolutePath());
					} else if (readfile.isDirectory()) {
						readAllFile(filepath + "\\" + filelist[i]);// 递归
					}
				}
			}else{
				listname.add(file.getAbsolutePath()+File.separator+df.format(new Date(file.lastModified()))+File.separator+"2");//1表示文件 2表示目录
			}
			
		}
	}
	
	public static List<FileBean> getFileList(String filepath){
		ArrayList<FileBean> fbList = new ArrayList<FileBean>();
		FileBean fb = null;
		for (String absfilePath : listname) {
			fb = new FileBean();
			//1、首先替换前缀
			String filepathStr = absfilePath.replace(filepath, "");
			if(!filepathStr.startsWith("01") && !filepathStr.startsWith("02")){//只统计01省市区目录 和02院内目录的文件
				continue;
			}
			//System.out.println(filepathStr);
			//2、最多只能生成5级目录,多于5级的 显示为“调研原材料\总体指标方针\指标全集.xlsx”
			String[] files = filepathStr.split("\\\\");
			int len = files.length;
			//1表示文件 2表示目录
			if("1".equals(files[len-1])){
				if(len == 3){
					fb.setFileName(files[0]);
					fb.setModifyTime(files[1]);
				}else if(len == 4){
					fb.setDire01(files[0]);
					fb.setMergeCol(files[0]);
					fb.setFileName(files[1]);
					fb.setModifyTime(files[2]);
				}else if(len == 5){
					fb.setDire01(files[0]);
					fb.setDire02(files[1]);
					fb.setMergeCol(files[0]+File.separator+files[1]);
					fb.setFileName(files[2]);
					fb.setModifyTime(files[3]);
				}else if(len == 6){
					fb.setDire01(files[0]);
					fb.setDire02(files[1]);
					fb.setDire03(files[2]);
					fb.setMergeCol(files[0]+File.separator+files[1]+File.separator+files[2]);
					fb.setFileName(files[3]);
					fb.setModifyTime(files[4]);
				}else if(len == 7){
					fb.setDire01(files[0]);
					fb.setDire02(files[1]);
					fb.setDire03(files[2]);
					fb.setDire04(files[3]);
					fb.setMergeCol(files[0]+File.separator+files[1]+File.separator+files[2]+File.separator+files[3]);
					fb.setFileName(files[4]);
					fb.setModifyTime(files[5]);
				}else if(len == 8){
					fb.setDire01(files[0]);
					fb.setDire02(files[1]);
					fb.setDire03(files[2]);
					fb.setDire04(files[3]);
					fb.setDire05(files[4]);
					fb.setMergeCol(files[0]+File.separator+files[1]+File.separator+files[2]+File.separator+files[3]+
								   File.separator+files[4]);
					fb.setFileName(files[5]);
					fb.setModifyTime(files[6]);
				}else if(len > 8){
					fb.setDire01(files[0]);
					fb.setDire02(files[1]);
					fb.setDire03(files[2]);
					fb.setDire04(files[3]);
					fb.setDire05(files[4]);
					fb.setMergeCol(files[0]+File.separator+files[1]+File.separator+files[2]+File.separator+files[3]+
							   File.separator+files[4]);
					String fileName="" ;
					for(int i =5;i < len-2 ;i++){
						fileName= fileName+File.separator+ files[i];
					}
					fb.setFileName(fileName);
					fb.setModifyTime(files[len-2]);
				}
			}else{
				if(len == 3){
					fb.setDire01(files[0]);
					fb.setMergeCol(files[0]);
					fb.setModifyTime(files[1]);
				}else if(len == 4){
					fb.setDire01(files[0]);
					fb.setDire02(files[1]);
					fb.setMergeCol(files[0]+File.separator+files[1]);
					fb.setModifyTime(files[2]);
				}else if(len == 5){
					fb.setDire01(files[0]);
					fb.setDire02(files[1]);
					fb.setDire03(files[2]);
					fb.setMergeCol(files[0]+File.separator+files[1]+File.separator+files[2]);
					fb.setModifyTime(files[3]);
				}else if(len == 6){
					fb.setDire01(files[0]);
					fb.setDire02(files[1]);
					fb.setDire03(files[2]);
					fb.setDire04(files[3]);
					fb.setMergeCol(files[0]+File.separator+files[1]+File.separator+files[2]+File.separator+files[3]);
					fb.setModifyTime(files[4]);
				}else if(len == 7){
					fb.setDire01(files[0]);
					fb.setDire02(files[1]);
					fb.setDire03(files[2]);
					fb.setDire04(files[3]);
					fb.setDire05(files[4]);
					fb.setMergeCol(files[0]+File.separator+files[1]+File.separator+files[2]+File.separator+files[3]+
								   File.separator+files[4]);
					fb.setModifyTime(files[5]);
				}else if(len == 8){
					fb.setDire01(files[0]);
					fb.setDire02(files[1]);
					fb.setDire03(files[2]);
					fb.setDire04(files[3]);
					fb.setDire05(files[4]);
					fb.setMergeCol(files[0]+File.separator+files[1]+File.separator+files[2]+File.separator+files[3]+
							   File.separator+files[4]);
					fb.setFileName(files[5]);
					fb.setModifyTime(files[6]);
				}else if(len > 8){
					fb.setDire01(files[0]);
					fb.setDire02(files[1]);
					fb.setDire03(files[2]);
					fb.setDire04(files[3]);
					fb.setDire05(files[4]);
					fb.setMergeCol(files[0]+File.separator+files[1]+File.separator+files[2]+File.separator+files[3]+
							   File.separator+files[4]);
					String fileName="" ;
					for(int i =5;i < len-2 ;i++){
						fileName= fileName+File.separator+ files[i];
					}
					fb.setFileName(fileName);
					fb.setModifyTime(files[len-2]);
				}
			}
			
			fbList.add(fb);
			
		}
		return fbList;
	}
	
	public static List<List<String>> convertDataList(List<FileBean> fbList,String type){
		 List<List<String>> dataList = new ArrayList<List<String>>();
		 List<String> strList = null;
		 for(FileBean fb : fbList){
			 if(type.equals(fb.getDire01())){
				 strList = new ArrayList<String>();
				 strList.add(fb.getDire01());
				 strList.add(fb.getDire02());
				 strList.add(fb.getDire03());
				 strList.add(fb.getDire04());
				 strList.add(fb.getDire05());
				 strList.add(fb.getFileName());
				 strList.add(fb.getModifyTime());
				 //strList.add(fb.getMergeCol());
				 //strList.add(fb.toString());
				 dataList.add(strList);
			 }
		 }
		 return dataList;
	}
 }
