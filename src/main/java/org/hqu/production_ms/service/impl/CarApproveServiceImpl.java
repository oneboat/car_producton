package org.hqu.production_ms.service.impl;

import java.util.List;

import org.hqu.production_ms.domain.CarApprove;
import org.hqu.production_ms.domain.CarApproveExample;
import org.hqu.production_ms.domain.custom.CustomResult;
import org.hqu.production_ms.domain.custom.EUDataGridResult;
import org.hqu.production_ms.domain.po.CarApprovePO;
import org.hqu.production_ms.mapper.CarApproveMapper;
import org.hqu.production_ms.service.CarApproveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class CarApproveServiceImpl implements CarApproveService{
	@Autowired
	CarApproveMapper carApproveMapper;
	@Override
	public List<CarApprove> find(String string) throws Exception {
		CarApproveExample example = new CarApproveExample();
		return carApproveMapper.selectByExample(example);
	}
	@Override
	public List<CarApprove> find1(String name,String id) throws Exception {
		CarApproveExample example = new CarApproveExample();
		return carApproveMapper.selectByExample(example);
	}
	@Override
	public List<CarApprove> find2(String name,String id,String ids) throws Exception {
		CarApproveExample example = new CarApproveExample();
		return carApproveMapper.selectByExample(example);
	}
	@Override
	public EUDataGridResult getList1(int page, int rows, CarApprove carApprove,String string) throws Exception {
		//分页处理
				PageHelper.startPage(page, rows);
				List<CarApprove> list = carApproveMapper.find(string);
				//创建一个返回值对象
				EUDataGridResult result = new EUDataGridResult();
				result.setRows(list);
				//取记录总条数
				PageInfo<CarApprove> pageInfo = new PageInfo<>(list);
				result.setTotal(pageInfo.getTotal());
				return result;
	}
	@Override
	public EUDataGridResult getList(int page, int rows, CarApprove carApprove,String name,String id) throws Exception {
		//分页处理
				PageHelper.startPage(page, rows);
				List<CarApprove> list = carApproveMapper.find1(name,id);
				//创建一个返回值对象
				EUDataGridResult result = new EUDataGridResult();
				result.setRows(list);
				//取记录总条数
				PageInfo<CarApprove> pageInfo = new PageInfo<>(list);
				result.setTotal(pageInfo.getTotal());
				return result;
	}
	@Override
	public EUDataGridResult getLists(int page, int rows, CarApprove carApprove,String name,String id,String ids) throws Exception {
		//分页处理
				PageHelper.startPage(page, rows);
				List<CarApprove> list = carApproveMapper.find2(name,id,ids);
				//创建一个返回值对象
				EUDataGridResult result = new EUDataGridResult();
				result.setRows(list);
				//取记录总条数
				PageInfo<CarApprove> pageInfo = new PageInfo<>(list);
				result.setTotal(pageInfo.getTotal());
				return result;
	}

	@Override
	public CarApprove get(int carApproveId) throws Exception {
		return carApproveMapper.selectSingleCarApprove(carApproveId);
	}

	@Override
	public CustomResult delete(int string) throws Exception {
		int i = carApproveMapper.deleteByPrimaryKey(string);
		if(i>0){
			return CustomResult.ok();
		}else{
			return CustomResult.build(101, "删除信息失败");
		}
	}

	@Override
	public CustomResult deleteBatch(int[] ids) throws Exception {
		int i = carApproveMapper.deleteBatch(ids);
		if(i>0){
			return CustomResult.ok();
		}else{
			return CustomResult.build(101, "删除信息失败");
		}
	}

	@Override
	public CustomResult insert(CarApprovePO carApprove) throws Exception {
		int i = carApproveMapper.insert(carApprove);
		if(i>0){
			return CustomResult.ok();
		}else{
			return CustomResult.build(101, "新增技术特性信息失败");
		}
	}

	@Override
	public CustomResult updateAll(CarApprovePO carApprove) throws Exception {
		int i = carApproveMapper.updateByPrimaryKey(carApprove);
		if(i>0){
			return CustomResult.ok();
		}else{
			return CustomResult.build(101, "修改技术特性信息失败");
		}
	}

	@Override
	public CustomResult update(CarApprovePO carApprove) throws Exception {
		int i = carApproveMapper.updateByPrimaryKeySelective(carApprove);
		if(i>0){
			return CustomResult.ok();
		}else{
			return CustomResult.build(101, "修改技术特性信息失败");
		}
	}

	@Override
	public List<CarApprove> searchCarApproveByCarApproveName(String applyname) throws Exception {
		CarApproveExample example = new CarApproveExample();
		CarApproveExample.Criteria criteria = example.createCriteria();
		criteria.andApplynameLike(applyname);
		return carApproveMapper.selectByExample(example);
	}

	@Override
	public List<CarApprove> searchCarApproveByCarApproveId(int carApproveId) throws Exception {
		CarApproveExample example = new CarApproveExample();
		CarApproveExample.Criteria criteria = example.createCriteria();
		criteria.andApplyIdEqualTo(carApproveId);
		return carApproveMapper.selectByExample(example);
	}

	@Override
	public EUDataGridResult searchCarApproveByCarApproveBrand(Integer page, Integer rows, String brand) throws Exception {
			//分页处理
			PageHelper.startPage(page, rows);
			List<CarApprove> list = carApproveMapper.searchCarApproveByCarApproveDriverfrom(brand);
			//创建一个返回值对象
			EUDataGridResult result = new EUDataGridResult();
			result.setRows(list);
			//取记录总条数
			PageInfo<CarApprove> pageInfo = new PageInfo<>(list);
			result.setTotal(pageInfo.getTotal());
			return result;
	}

	@Override
	public EUDataGridResult searchCarApproveByCarApproveCarXH(Integer page, Integer rows, String carXH) throws Exception {
		//分页处理
		PageHelper.startPage(page, rows);
		List<CarApprove> list = carApproveMapper.searchCarApproveByCarApproveAA(carXH);
		//创建一个返回值对象
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		//取记录总条数
		PageInfo<CarApprove> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

	@Override
	public EUDataGridResult searchCarApproveByCheckNums(Integer page, Integer rows, String checkNums) throws Exception {
		//分页处理
				PageHelper.startPage(page, rows);
				List<CarApprove> list = carApproveMapper.searchCarApproveByCarApproveName(checkNums);
				//创建一个返回值对象
				EUDataGridResult result = new EUDataGridResult();
				result.setRows(list);
				//取记录总条数
				PageInfo<CarApprove> pageInfo = new PageInfo<>(list);
				result.setTotal(pageInfo.getTotal());
				return result;
	}
	@Override
	public CustomResult updateById(CarApprovePO carApprove) throws Exception {
		int i = carApproveMapper.updateById(carApprove);
		if(i>0){
			return CustomResult.ok();
		}else{
			return CustomResult.build(101, "审批失败");
		}
	}
}
