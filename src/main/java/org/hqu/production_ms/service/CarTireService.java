package org.hqu.production_ms.service;

import java.util.List;

import org.hqu.production_ms.domain.CarTire;
import org.hqu.production_ms.domain.custom.CustomResult;
import org.hqu.production_ms.domain.custom.EUDataGridResult;
import org.hqu.production_ms.domain.po.CarTirePO;

public interface CarTireService {
List<CarTire> find() throws Exception;  
	
	EUDataGridResult getList(int page, int rows, CarTire carTire) throws Exception;
	
List<CarTire> find1(String id) throws Exception;  
	
	EUDataGridResult getList1(int page, int rows, CarTire carTire,String id) throws Exception;
	
	CarTire get(int string) throws Exception;
	
	CustomResult delete(int string) throws Exception;

	CustomResult deleteBatch(int[] ids) throws Exception;

	CustomResult insert(CarTirePO carTire) throws Exception;

    //更新全部字段，不判断非空，直接进行更新
    CustomResult updateAll(CarTirePO carTire) throws Exception;
    
    CustomResult update(CarTirePO carTire) throws Exception;
    
    List<CarTire> searchCarTireByCarTireName(String carTireName) throws Exception;

	List<CarTire> searchCarTireByCarTireId(int carTireId) throws Exception;

	//根据品牌查找车型信息
	EUDataGridResult searchCarTireByCarTireBrand(Integer page, Integer rows,
			String brand) throws Exception;

	//根据车型查找车型信息
	EUDataGridResult searchCarTireByCarTireCarXH(Integer page, Integer rows,
			String carXH) throws Exception;

	//根据荷载人数查找车型信息
	EUDataGridResult searchCarTireByCheckNums(Integer page, Integer rows,
			int checkNums) throws Exception;
}
