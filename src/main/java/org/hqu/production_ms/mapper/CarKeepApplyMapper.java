package org.hqu.production_ms.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.hqu.production_ms.domain.CarKeepApply;
import org.hqu.production_ms.domain.CarKeepApplyExample;
import org.hqu.production_ms.domain.po.CarKeepApplyPO;

public interface CarKeepApplyMapper {
	//扩展的mapper接口方法
			int deleteBatch(int[] ids);
			
			List<CarKeepApply> find();
			
			List<CarKeepApply> find1(String id);
			
			List<CarKeepApply> findByDepartment();
			
			CarKeepApply findByBian(String string);
			
			List<CarKeepApply> getXX();
			
			List<CarKeepApply> searchCarKeepApplyByCarKeepApplyDriverfrom(String brand);

			List<CarKeepApply> searchCarKeepApplyByCarKeepApplyAA(String checkNums);

			List<CarKeepApply> searchCarKeepApplyByCarKeepApplyName(String carXH);
			
			List<CarKeepApply> searchCarKeepApplyByCarId(String carXH);
			
			CarKeepApply selectSingleCarKeepApply(int applyId);
			//逆向工程生成的mapper接口
    int countByExample(CarKeepApplyExample example);

    int deleteByExample(CarKeepApplyExample example);

    int deleteByPrimaryKey(Integer applyId);

    int insert(CarKeepApplyPO record);

    int insertSelective(CarKeepApply record);

    List<CarKeepApply> selectByExample(CarKeepApplyExample example);

    CarKeepApply selectByPrimaryKey(Integer applyId);

    int updateByExampleSelective(@Param("record") CarKeepApply record, @Param("example") CarKeepApplyExample example);

    int updateByExample(@Param("record") CarKeepApply record, @Param("example") CarKeepApplyExample example);

    int updateByPrimaryKeySelective(CarKeepApplyPO record);

    int updateByPrimaryKey(CarKeepApplyPO record);
}