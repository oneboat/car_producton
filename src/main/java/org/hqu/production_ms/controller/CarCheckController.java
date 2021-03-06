package org.hqu.production_ms.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.hqu.production_ms.domain.CarCheck;
import org.hqu.production_ms.domain.custom.ActiveUser;
import org.hqu.production_ms.domain.custom.CustomResult;
import org.hqu.production_ms.domain.custom.EUDataGridResult;
import org.hqu.production_ms.domain.po.CarCheckPO;
import org.hqu.production_ms.service.CarCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/carCheck")
public class CarCheckController {

	@Autowired
	private CarCheckService carCheckService;
	
	@RequestMapping("/get/{checkId}")
	@ResponseBody
	public CarCheck getItemById(@PathVariable int checkId) throws Exception{
		CarCheck carCheck = carCheckService.get(checkId);
		return carCheck;
	}
	
	@RequestMapping("/get_data")
	@ResponseBody
	public List<CarCheck> getData() throws Exception{
		 List<CarCheck> list = carCheckService.find();
		return list;
	}
	
	@RequestMapping("/find")
	public String find() throws Exception{
		return "carCheck_list";                                                                                                                                                                                                                                                                                                 
	}
	
	@RequestMapping("/add_judge")
	@ResponseBody
	public Map<String,Object> CarCheckAddJudge() throws Exception{
		//从shiro的session中取activeUser
		Subject subject = SecurityUtils.getSubject();
		//取身份信息
		ActiveUser activeUser = (ActiveUser) subject.getPrincipal();
		Map<String,Object> map = new HashMap<String,Object>(); 
		if(!activeUser.getUserStatus().equals("1")){
			map.put("msg", "您的账户已被锁定，请切换账户登录！");
		}else if(!activeUser.getRoleStatus().equals("1")){
			map.put("msg", "当前角色已被锁定，请切换账户登录！");
		}else{
			if(!subject.isPermitted("carCheck:add")){
				map.put("msg", "您没有权限，请切换用户登录！");
			}
		}
		return map;
	}
	
	@RequestMapping("/add")
	public String add() throws Exception{
		return "carCheck_add";
	}
	
	@RequestMapping("/edit_judge")
	@ResponseBody
	public Map<String,Object> CarCheckEditJudge() throws Exception{
		Subject subject = SecurityUtils.getSubject();
		ActiveUser activeUser = (ActiveUser) subject.getPrincipal();
		Map<String,Object> map = new HashMap<String,Object>();
		if(!activeUser.getUserStatus().equals("1")){
			map.put("msg", "您的账户已被锁定，请切换账户登录！");
		}else if(!activeUser.getRoleStatus().equals("1")){
			map.put("msg", "当前角色已被锁定，请切换账户登录！");
		}else{
			if(!subject.isPermitted("carCheck:edit")){
				map.put("msg", "您没有权限，请切换用户登录！");
			}
		}
		return map;
	}
	
	@RequestMapping("/edit")
	public String edit() throws Exception{
		return "carCheck_edit";
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public EUDataGridResult getList(Integer page, Integer rows, CarCheck carCheck,HttpSession session) throws Exception{
		String id = (String) session.getAttribute("departmentId");
		EUDataGridResult result = null;
		int id1 =  (int) session.getAttribute("leve");
		if(2 == id1){
			result = carCheckService.getList(page, rows, carCheck);
		}else{
			result = carCheckService.getList1(page, rows, carCheck,id);
		}
		return result;
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	@ResponseBody
	private CustomResult insert(@Valid CarCheckPO carCheck, BindingResult bindingResult) throws Exception {
		CustomResult result;
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			System.out.println(fieldError.getDefaultMessage());
			return CustomResult.build(100, fieldError.getDefaultMessage());
		}else{
			result = carCheckService.insert(carCheck);
		}
		
		return result;
	}
	
	@RequestMapping(value="/update")
	@ResponseBody
	private CustomResult update(@Valid CarCheckPO carCheck, BindingResult bindingResult) throws Exception {
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			return CustomResult.build(100, fieldError.getDefaultMessage());
		}
		return carCheckService.update(carCheck);
	}
	
	@RequestMapping(value="/update_all")
	@ResponseBody
	private CustomResult updateAll(@Valid CarCheckPO carCheck, BindingResult bindingResult) throws Exception {
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			return CustomResult.build(100, fieldError.getDefaultMessage());
		}
		return carCheckService.updateAll(carCheck);
	}
	
	@RequestMapping("/delete_judge")
	@ResponseBody
	public Map<String,Object> CarCheckDeleteJudge() throws Exception{
		Subject subject = SecurityUtils.getSubject();
		ActiveUser activeUser = (ActiveUser) subject.getPrincipal();
		Map<String,Object> map = new HashMap<String,Object>();
		if(!activeUser.getUserStatus().equals("1")){
			map.put("msg", "您的账户已被锁定，请切换账户登录！");
		}else if(!activeUser.getRoleStatus().equals("1")){
			map.put("msg", "当前角色已被锁定，请切换账户登录！");
		}else{
			if(!subject.isPermitted("carCheck:delete")){
				map.put("msg", "您没有权限，请切换用户登录！");
			}
		}
		return map;
	}
	
	@RequestMapping(value="/delete")
	@ResponseBody
	private CustomResult delete(int id) throws Exception {
		CustomResult result = carCheckService.delete(id);
		return result;
	}
	
	@RequestMapping(value="/delete_batch")
	@ResponseBody
	private CustomResult deleteBatch(int[] ids) throws Exception {
		CustomResult result = carCheckService.deleteBatch(ids);
		return result;
	}
	
	//搜索
	@RequestMapping("/search_carCheck_by_carid")
	@ResponseBody
	public EUDataGridResult searchCarCheckByCarCheckYear(Integer page, Integer rows,String searchValue,HttpSession session) 
			throws Exception{
		String id = (String) session.getAttribute("departmentId");
		EUDataGridResult result = null;
		int id1 =  (int) session.getAttribute("leve");
		if(2 == id1){
			result = carCheckService.searchCarCheckByCarCheck1(page, rows, searchValue);
		}else{
			result = carCheckService.searchCarCheckByCarCheck1s(page, rows,id, searchValue);
		}
		return result;
	}
	//搜索
		@RequestMapping("/search_carCheck_by_depname")
		@ResponseBody
		public EUDataGridResult searchCarCheckByCarCheckdep(Integer page, Integer rows,String searchValue,HttpSession session) 
				throws Exception{
			String id = (String) session.getAttribute("departmentId");
			EUDataGridResult result = null;
			int id1 =  (int) session.getAttribute("leve");
			if(2 == id1){
				result = carCheckService.searchCarCheckByCarCheck2(page, rows, searchValue);
			}else{
				result = carCheckService.searchCarCheckByCarCheck2s(page, rows,id, searchValue);
			}
			return result;
		}
	
	//搜索
	@RequestMapping("/findCheck/{carId}")
	@ResponseBody
	public EUDataGridResult searchCarCheckByCarCheckCarXH(@PathVariable int carId,Integer page, Integer rows) 
			throws Exception{
		EUDataGridResult result = carCheckService.searchCarCheckByCarCheckCarId(page, rows, carId);
		return result;
	}
	
}
