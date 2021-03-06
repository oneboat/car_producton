package org.hqu.production_ms.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.hqu.production_ms.domain.CarHandover;
import org.hqu.production_ms.domain.CarHandoverExample;
import org.hqu.production_ms.domain.po.CarHandoverPO;

public interface CarHandoverMapper {
	//扩展的mapper接口方法
		int deleteBatch(int[] ids);
		
		List<CarHandover> find();
		List<CarHandover> find1(String id);
		
		List<CarHandover> searchCarHandoverByCarHandoverDriverfrom(String brand);

		List<CarHandover> searchCarHandoverByCarHandoverAA(String checkNums);

		List<CarHandover> searchCarHandoverByCarHandoverName(String carXH);
		
		CarHandover selectSingleCarHandover(int carHandoverId);
			//逆向工程生成的mapper接口
    int countByExample(CarHandoverExample example);

    int deleteByExample(CarHandoverExample example);

    int deleteByPrimaryKey(Integer handoverId);

    int insert(CarHandoverPO record);

    int insertSelective(CarHandover record);

    List<CarHandover> selectByExample(CarHandoverExample example);

    CarHandover selectByPrimaryKey(Integer handoverId);

    int updateByExampleSelective(@Param("record") CarHandover record, @Param("example") CarHandoverExample example);

    int updateByExample(@Param("record") CarHandover record, @Param("example") CarHandoverExample example);

    int updateByPrimaryKeySelective(CarHandoverPO record);

    int updateByPrimaryKey(CarHandoverPO record);
}