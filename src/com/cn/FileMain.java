package com.cn;

import com.cn.util.ExcelUtil;


public class FileMain {
	
    public static void main(String[] args)throws Exception{  
    	/*String filePath = "C:\\Users\\TonyJ\\Desktop\\010��Ч�Ŷ�\\";
    	FileUtil.readAllFile(filePath);  
    	List<FileBean> fbList = FileUtil.getFileList(filePath);
    	for (FileBean fileBean : fbList) {
			System.out.println(fileBean);
		}*/
        //System.out.println(FileUtil.listname.size());
    	String readPath = "C:\\Users\\TonyJ\\Desktop\\010��Ч�Ŷ�\\";
    	String writePath = "C:\\Users\\TonyJ\\Desktop\\010��Ч�Ŷ�\\";
    	ExcelUtil.testHead(readPath,writePath);
    }  
    
    
}
