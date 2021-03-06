package org.hqu.production_ms.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.hqu.production_ms.domain.CarKeep;
import org.hqu.production_ms.domain.CarKeepExample;

public interface CarKeepMapper {
	//扩展的mapper接口方法
	int deleteBatch(int[] ids);
	
	List<CarKeep> find();
	List<CarKeep> find1(String id);
	
	List<CarKeep> searchCarKeepByCarKeepDriverfrom(String brand);

	List<CarKeep> searchCarKeepByCarKeepAA(String checkNums);

	List<CarKeep> searchCarKeepByCarKeepDriverfrom1(String id,String brand);

	List<CarKeep> searchCarKeepByCarKeepAA1(String id,String checkNums);
	
	List<CarKeep> searchCarKeepByCarId(int id);
	
	CarKeep selectSingleCarKeep(int carKeepId);
		//逆向工程生成的mapper接口
    int countByExample(CarKeepExample example);

    int deleteByExample(CarKeepExample example);

    int deleteByPrimaryKey(Integer keepId);

    int insert(CarKeep record);

    int insertSelective(CarKeep record);

    List<CarKeep> selectByExample(CarKeepExample example);

    CarKeep selectByPrimaryKey(Integer keepId);

    int updateByExampleSelective(@Param("record") CarKeep record, @Param("example") CarKeepExample example);

    int updateByExample(@Param("record") CarKeep record, @Param("example") CarKeepExample example);

    int updateByPrimaryKeySelective(CarKeep record);

    int updateByPrimaryKey(CarKeep record);
}