package org.hqu.production_ms.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.hqu.production_ms.domain.CarIn;
import org.hqu.production_ms.domain.CarInExample;
import org.hqu.production_ms.domain.po.CarInPO;

public interface CarInMapper {
	//扩展的mapper接口方法
			int deleteBatch(int[] ids);
			
			List<CarIn> find();
			
			List<CarIn> find1(String id);
			
			List<CarIn> searchCarInByCarInDriverfrom(String brand);

			List<CarIn> searchCarInByCarInAA(String checkNums);
			
			List<CarIn> searchCarInByCarInDriverfrom1(String id,String brand);

			List<CarIn> searchCarInByCarInAA1(String id,String checkNums);

			List<CarIn> searchCarInByCarInName(String carXH);
			
			List<CarIn> findCount();
			
			CarIn selectSingleCarIn(int carRemoveId);
				//逆向工程生成的mapper接口
    int countByExample(CarInExample example);

    int deleteByExample(CarInExample example);

    int deleteByPrimaryKey(Integer inId);

    int insert(CarInPO record);

    int insertSelective(CarIn record);

    List<CarIn> selectByExample(CarInExample example);

    CarIn selectByPrimaryKey(Integer inId);

    int updateByExampleSelective(@Param("record") CarIn record, @Param("example") CarInExample example);

    int updateByExample(@Param("record") CarIn record, @Param("example") CarInExample example);

    int updateByPrimaryKeySelective(CarInPO record);

    int updateByPrimaryKey(CarInPO record);
}