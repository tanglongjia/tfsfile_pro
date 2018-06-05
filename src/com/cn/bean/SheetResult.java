package com.cn.bean;

import java.util.List;  
import java.util.Map;  
  
/** 
 * Sheet页处理封装结果 
 * @author 游盼盼 
 * @since Excel Study 1.0 
 */  
public class SheetResult {  
      
    /** 
     * 记录列名与数据索引 
     */  
    private Map<String, Integer> colNameMap;  
      
    /** 
     * 头部信息的行数 
     */  
    private int headRowNum;  
      
    /** 
     * 数据集合 
     */  
    private List<List<String>> dataList;  
    
    private List<List<String>> dataList1;
  
    public Map<String, Integer> getColNameMap() {  
        return colNameMap;  
    }  
  
    public void setColNameMap(Map<String, Integer> colNameMap) {  
        this.colNameMap = colNameMap;  
    }  
      
  
    public int getHeadRowNum() {  
        return headRowNum;  
    }  
  
    public void setHeadRowNum(int headRowNum) {  
        this.headRowNum = headRowNum;  
    }  
  
    public List<List<String>> getDataList() {  
        return dataList;  
    }  
  
    public void setDataList(List<List<String>> dataList) {  
        this.dataList = dataList;  
    }

	public List<List<String>> getDataList1() {
		return dataList1;
	}

	public void setDataList1(List<List<String>> dataList1) {
		this.dataList1 = dataList1;
	}  
      
  
}  
