package org.hqu.production_ms.service.impl;

import java.util.List;

import org.hqu.production_ms.domain.CarRemove;
import org.hqu.production_ms.domain.CarRemoveExample;
import org.hqu.production_ms.domain.custom.CustomResult;
import org.hqu.production_ms.domain.custom.EUDataGridResult;
import org.hqu.production_ms.domain.po.CarRemovePO;
import org.hqu.production_ms.mapper.CarRemoveMapper;
import org.hqu.production_ms.service.CarRemoveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class CarRemoveServiceImpl implements CarRemoveService {
	@Autowired
	CarRemoveMapper technicalMapper;
	@Override
	public List<CarRemove> find() throws Exception {
		CarRemoveExample example = new CarRemoveExample();
		return technicalMapper.selectByExample(example);
	}

	@Override
	public EUDataGridResult getList(int page, int rows, CarRemove carRemove) throws Exception {
		//分页处理
				PageHelper.startPage(page, rows);
				List<CarRemove> list = technicalMapper.find();
				//创建一个返回值对象
				EUDataGridResult result = new EUDataGridResult();
				result.setRows(list);
				//取记录总条数
				PageInfo<CarRemove> pageInfo = new PageInfo<>(list);
				result.setTotal(pageInfo.getTotal());
				return result;
	}
	
	@Override
	public List<CarRemove> find1(String id) throws Exception {
		CarRemoveExample example = new CarRemoveExample();
		return technicalMapper.selectByExample(example);
	}

	@Override
	public EUDataGridResult getList1(int page, int rows, CarRemove carRemove,String id) throws Exception {
		//分页处理
				PageHelper.startPage(page, rows);
				List<CarRemove> list = technicalMapper.find1(id);
				//创建一个返回值对象
				EUDataGridResult result = new EUDataGridResult();
				result.setRows(list);
				//取记录总条数
				PageInfo<CarRemove> pageInfo = new PageInfo<>(list);
				result.setTotal(pageInfo.getTotal());
				return result;
	}

	@Override
	public CarRemove get(int carRemoveId) throws Exception {
		return technicalMapper.selectSingleCarRemove(carRemoveId);
	}

	@Override
	public CustomResult delete(int string) throws Exception {
		int i = technicalMapper.deleteByPrimaryKey(string);
		if(i>0){
			return CustomResult.ok();
		}else{
			return CustomResult.build(101, "删除信息失败");
		}
	}

	@Override
	public CustomResult deleteBatch(int[] ids) throws Exception {
		int i = technicalMapper.deleteBatch(ids);
		if(i>0){
			return CustomResult.ok();
		}else{
			return CustomResult.build(101, "删除信息失败");
		}
	}

	@Override
	public CustomResult insert(CarRemovePO carRemove) throws Exception {
		int i = technicalMapper.insert(carRemove);
		if(i>0){
			return CustomResult.ok();
		}else{
			return CustomResult.build(101, "新增技术特性信息失败");
		}
	}

	@Override
	public CustomResult updateAll(CarRemovePO carRemove) throws Exception {
		int i = technicalMapper.updateByPrimaryKey(carRemove);
		if(i>0){
			return CustomResult.ok();
		}else{
			return CustomResult.build(101, "修改技术特性信息失败");
		}
	}

	@Override
	public CustomResult update(CarRemovePO carRemove) throws Exception {
		int i = technicalMapper.updateByPrimaryKeySelective(carRemove);
		if(i>0){
			return CustomResult.ok();
		}else{
			return CustomResult.build(101, "修改技术特性信息失败");
		}
	}

	@Override
	public List<CarRemove> searchCarRemoveByCarRemoveName(String driverFrom) throws Exception {
		CarRemoveExample example = new CarRemoveExample();
		CarRemoveExample.Criteria criteria = example.createCriteria();
		criteria.andOutorganLike(driverFrom);
		return technicalMapper.selectByExample(example);
	}

	@Override
	public List<CarRemove> searchCarRemoveByCarRemoveId(int carRemoveId) throws Exception {
		CarRemoveExample example = new CarRemoveExample();
		CarRemoveExample.Criteria criteria = example.createCriteria();
		criteria.andRemoveIdEqualTo(carRemoveId);
		return technicalMapper.selectByExample(example);
	}

	@Override
	public EUDataGridResult searchCarRemoveByCarRemoveBrand(Integer page, Integer rows, String brand) throws Exception {
			//分页处理
			PageHelper.startPage(page, rows);
			List<CarRemove> list = technicalMapper.searchCarRemoveByCarRemoveDriverfrom(brand);
			//创建一个返回值对象
			EUDataGridResult result = new EUDataGridResult();
			result.setRows(list);
			//取记录总条数
			PageInfo<CarRemove> pageInfo = new PageInfo<>(list);
			result.setTotal(pageInfo.getTotal());
			return result;
	}

	@Override
	public EUDataGridResult searchCarRemoveByCarRemoveCarXH(Integer page, Integer rows, String carXH) throws Exception {
		//分页处理
		PageHelper.startPage(page, rows);
		List<CarRemove> list = technicalMapper.searchCarRemoveByCarRemoveAA(carXH);
		//创建一个返回值对象
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		//取记录总条数
		PageInfo<CarRemove> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}
	@Override
	public EUDataGridResult searchCarRemoveByCarRemoveBrand1(Integer page, Integer rows, String brand,String id) throws Exception {
			//分页处理
			PageHelper.startPage(page, rows);
			List<CarRemove> list = technicalMapper.searchCarRemoveByCarRemoveDriverfrom1(id,brand);
			//创建一个返回值对象
			EUDataGridResult result = new EUDataGridResult();
			result.setRows(list);
			//取记录总条数
			PageInfo<CarRemove> pageInfo = new PageInfo<>(list);
			result.setTotal(pageInfo.getTotal());
			return result;
	}

	@Override
	public EUDataGridResult searchCarRemoveByCarRemoveCarXH1(Integer page, Integer rows, String carXH,String id) throws Exception {
		//分页处理
		PageHelper.startPage(page, rows);
		List<CarRemove> list = technicalMapper.searchCarRemoveByCarRemoveAA1(id,carXH);
		//创建一个返回值对象
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		//取记录总条数
		PageInfo<CarRemove> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

	@Override
	public EUDataGridResult searchCarRemoveByCheckNums(Integer page, Integer rows, String checkNums) throws Exception {
		//分页处理
				PageHelper.startPage(page, rows);
				List<CarRemove> list = technicalMapper.searchCarRemoveByCarRemoveName(checkNums);
				//创建一个返回值对象
				EUDataGridResult result = new EUDataGridResult();
				result.setRows(list);
				//取记录总条数
				PageInfo<CarRemove> pageInfo = new PageInfo<>(list);
				result.setTotal(pageInfo.getTotal());
				return result;
	}

}
