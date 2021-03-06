package org.hqu.production_ms.service;

import java.util.List;

import org.hqu.production_ms.domain.CarRemove;
import org.hqu.production_ms.domain.custom.CustomResult;
import org.hqu.production_ms.domain.custom.EUDataGridResult;
import org.hqu.production_ms.domain.po.CarRemovePO;

public interface CarRemoveService {
	List<CarRemove> find() throws Exception;  
	
	EUDataGridResult getList(int page, int rows, CarRemove carRemove) throws Exception;
	
List<CarRemove> find1(String id) throws Exception;  
	
	EUDataGridResult getList1(int page, int rows, CarRemove carRemove,String id) throws Exception;
	
	CarRemove get(int string) throws Exception;
	
	CustomResult delete(int string) throws Exception;

	CustomResult deleteBatch(int[] ids) throws Exception;

	CustomResult insert(CarRemovePO carRemove) throws Exception;

    //更新全部字段，不判断非空，直接进行更新
    CustomResult updateAll(CarRemovePO carRemove) throws Exception;
    
    CustomResult update(CarRemovePO carRemove) throws Exception;
    
    List<CarRemove> searchCarRemoveByCarRemoveName(String carRemoveName) throws Exception;

	List<CarRemove> searchCarRemoveByCarRemoveId(int carRemoveId) throws Exception;

	//根据品牌查找车型信息
	EUDataGridResult searchCarRemoveByCarRemoveBrand(Integer page, Integer rows,
			String brand) throws Exception;

	//根据车型查找车型信息
	EUDataGridResult searchCarRemoveByCarRemoveCarXH(Integer page, Integer rows,
			String carXH) throws Exception;
	//根据品牌查找车型信息
		EUDataGridResult searchCarRemoveByCarRemoveBrand1(Integer page, Integer rows,String id,
				String brand) throws Exception;

		//根据车型查找车型信息
		EUDataGridResult searchCarRemoveByCarRemoveCarXH1(Integer page, Integer rows,String id,
				String carXH) throws Exception;

	//根据荷载人数查找车型信息
	EUDataGridResult searchCarRemoveByCheckNums(Integer page, Integer rows,
			String checkNums) throws Exception;
}
