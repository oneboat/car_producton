package org.hqu.production_ms.service;

import java.util.List;

import org.hqu.production_ms.domain.CarKeepApprove;
import org.hqu.production_ms.domain.custom.CustomResult;
import org.hqu.production_ms.domain.custom.EUDataGridResult;
import org.hqu.production_ms.domain.po.CarKeepApprovePO;

public interface CarKeepApproveService {
	List<CarKeepApprove> find(String string) throws Exception;  
	List<CarKeepApprove> find1(String id,String name) throws Exception;  
	List<CarKeepApprove> find5() throws Exception;  
//	EUDataGridResult getList(int page, int rows, CarKeepApprove carKeepApprove,String string) throws Exception;
	EUDataGridResult getList(int page, int rows, CarKeepApprove carKeepApprove,String name) throws Exception;
	EUDataGridResult getList1(int page, int rows, CarKeepApprove carKeepApprove,String id,String name) throws Exception;
	CarKeepApprove get(int string) throws Exception;
	
	CustomResult delete(int string) throws Exception;

	CustomResult deleteBatch(int[] ids) throws Exception;

	CustomResult insert(CarKeepApprovePO carKeepApprove) throws Exception;

    //更新全部字段，不判断非空，直接进行更新
    CustomResult updateAll(CarKeepApprovePO carKeepApprove) throws Exception;
    
    CustomResult update(CarKeepApprovePO carKeepApprove) throws Exception;
    
    List<CarKeepApprove> searchCarKeepApproveByCarKeepApproveName(String carKeepApproveName) throws Exception;

	List<CarKeepApprove> searchCarKeepApproveByCarKeepApproveId(int carKeepApproveId) throws Exception;

	//根据品牌查找车型信息
	EUDataGridResult searchCarKeepApproveByCarKeepApproveBrand(Integer page, Integer rows,
			String brand) throws Exception;

	//根据车型查找车型信息
	EUDataGridResult searchCarKeepApproveByCarKeepApproveCarXH(Integer page, Integer rows,
			String carXH) throws Exception;

	//根据荷载人数查找车型信息
	EUDataGridResult searchCarKeepApproveByCheckNums(Integer page, Integer rows,
			String checkNums) throws Exception;
}
