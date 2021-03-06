<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<link href="js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/lang/zh_CN.js"></script>
<table class="easyui-datagrid" id="carKeepApplyList" title="车辆维护 列表" 
       data-options="singleSelect:false,collapsible:true,pagination:true,rownumbers:true,url:'carKeepApply/list',
       	method:'get',pageSize:10,fitColumns:true,toolbar:toolbar_carKeepApply">
    <thead>
        <tr>
        	<th data-options="field:'ck',checkbox:true"></th>
        	<th data-options="field:'carnum',align:'center',width:80">维修车辆</th>
        	<th data-options="field:'applyname',align:'center',width:70">申请人</th>
        	<th data-options="field:'approve',align:'center',width:70">审批人</th>
        	<th data-options="field:'intervalkm',align:'center',width:80">当前里程(/公里)</th>
        	<th data-options="field:'dep',align:'center',width:100,formatter:formatDepartment">所在部门</th>
        	<th data-options="field:'startdate',align:'center',width:80,formatter:TAOTAO.formatDate">开始日期</th>
        	<th data-options="field:'enddate',align:'center',width:80,formatter:TAOTAO.formatDate">截止日期</th>
            <th data-options="field:'repairtype',align:'center',width:200">维护级别或修理项目</th>
            <th data-options="field:'suppliername',align:'center',width:80">厂家名称</th>
           <th data-options="field:'beiyong1',align:'center',width:60">车辆性质</th>
           <th data-options="field:'stats1',align:'center',width:60,formatter:formatSN1">申请状态</th>
           <th data-options="field:'carKeepApplyEdit',align:'center',width:50,formatter:formatCarKeepApplyEdit">编辑</th>
        </tr>
    </thead>
</table>

<div  id="toolbar_carKeepApply" style=" height: 22px; padding: 3px 11px; background: #fafafa;">  
	
	<c:forEach items="${sessionScope.sysPermissionList}" var="per" >
		<c:if test="${per=='carKeepApply:add' }" >
		    <div style="float: left;">  
		        <a href="#" class="easyui-linkbutton" plain="true" icon="icon-add" onclick="carKeepApply_add()">新增</a>  
		    </div>  
		</c:if>
		<!-- 
		<c:if test="${per=='carKeepApply:edit' }" >
		    <div style="float: left;">  
		        <a href="#" class="easyui-linkbutton" plain="true" icon="icon-edit" onclick="carKeepApply_edit()">编辑</a>  
		    </div>  
		</c:if>
		 -->
		
		<c:if test="${per=='carKeepApply:delete' }" >
		    <div style="float: left;">  
		        <a href="#" class="easyui-linkbutton" plain="true" icon="icon-cancel" onclick="carKeepApply_delete()">删除</a>  
		    </div>  
		</c:if>
	</c:forEach>
	
	<div class="datagrid-btn-separator"></div>  
	
	<div style="float: left;">  
		<a href="#" class="easyui-linkbutton" plain="true" icon="icon-reload" onclick="carKeepApply_reload()">刷新</a>  
	</div>  

</div>  

<div id="carKeepApplyEditWindow" class="easyui-window" title="编辑维护申请" data-options="modal:true,
	closed:true,resizable:true,iconCls:'icon-save',href:'carKeepApply/edit'" style="width:850px;height:600px;padding:10px;">
</div>
<div id="carKeepApplyAddWindow" class="easyui-window" title="新增维护申请" data-options="modal:true,
	closed:true,resizable:true,iconCls:'icon-save',href:'carKeepApply/add'" style="width:850px;height:600px;padding:10px;">
</div>
<script>
function doSearch_carKeepApply(value,name){ //用户输入用户名,点击搜素,触发此函数  
	if(value == null || value == ''){
		
		$("#carKeepApplyList").datagrid({
	        title:'车辆维护 列表', singleSelect:false, collapsible:true, pagination:true, rownumbers:true, method:'get', nowrap:true,  
	        toolbar:"toolbar_carKeepApply", url:'carKeepApply/list', method:'get', loadMsg:'数据加载中......', fitColumns:true,//允许表格自动缩放,以适应父容器  
	        columns : [ [ 
	             	{field : 'ck', checkbox:true }, 
	             	{field : 'carnum', width : 80, align : 'center', title : '维修车辆'},
	             	{field : 'applyname', width : 70, align : 'center', title : '申请人'},
	             	{field : 'approve', width : 70, align : 'center', title : '审批人'},
	             	{field : 'intervalkm', width : 80, align : 'center', title : '当前里程(/公里)'},
	             	{field : 'dep', width : 100, align : 'center', title : '所在部门',formatter:formatDepartment},
	             	{field : 'startdate', width : 80, align : 'center', title : '开始日期',formatter:TAOTAO.formatDate},
	             	{field : 'enddate', width : 80, align:'center', title : '截止日期',formatter:TAOTAO.formatDate},
	             	{field : 'repairtype', width : 200, align : 'center', title : '维护级别或维护项目'},
	             	{field : 'suppliername', width : 80, align : 'center', title : '厂家名称'},
	             	{field : 'beiyong1', width : 60, align : 'center', title : '车辆性质'},
	             	{field : 'stats', width : 60, align : 'center', title : '申请状态'}
	        ] ],  
	    });
	}
}
function  formatCarKeepApplyEdit(value, row, index){ 
	return "<a herf='#' style='cursor:pointer' icon='icon-edit' onclick='carKeepApply_edit()'><span style='color:blue'>编辑</span></a>";
};
    function getCarKeepApplySelectionsIds(){
    	var carKeepApplyList = $("#carKeepApplyList");
    	var sels = carKeepApplyList.datagrid("getSelections");
    	var ids = [];
    	for(var i in sels){
    		ids.push(sels[i].applyId);
    	}
    	ids = ids.join(","); 
    	
    	return ids;
    }
    function  formatSN1(value, row, index){ 
		if(value ==null && value == ''){
			return '无';}
		else{
			if(row.stats=="未审批"){
				return '<span style="color:red;">'+row.stats+'</span>';
			}else if(row.stats=="上报处理"){
				return '<span style="color:orange;">'+row.stats+'</span>';
			}else{
				return '<span style="color:green;">'+row.stats+'</span>';
			}
		}
	};
    function  formatDepartment(value, row, index){ 
    	if(value ==null && value == ''){
			return '无';}
    	else{
    		return ""+row.department.departmentName+"";
    	}
	};
    function carKeepApply_add(){
    	$.get("carKeepApply/add_judge",'',function(data){
       		if(data.msg != null){
       			$.messager.alert('提示', data.msg);
       		}else{
       			$("#carKeepApplyAddWindow").window("open");
       		}
       	});
    }
    function getCarKeepApplySelectionsnames(){
    	var carKeepApplyList = $("#carKeepApplyList");
    	var sels = carKeepApplyList.datagrid("getSelections");
    	var ids = [];
    	for(var i in sels){
    		ids.push(sels[i].carnum);
    	}
    	ids = ids.join(","); 
    	
    	return ids;
    }
    function getSelectionsName(){
    	var carKeepApplyList = $("#carKeepApplyList");
    	var sels = carKeepApplyList.datagrid("getSelections");
    	var ids = [];
    	for(var i in sels){
    		ids.push(sels[i].stats);
    	}
    	ids = ids.join(","); 
    	
    	return ids;
    }
    function carKeepApply_edit(){
    	$.get("carKeepApply/edit_judge",'',function(data){
       		if(data.msg != null){
       			$.messager.alert('提示', data.msg);
       		}else{
       			var name = getSelectionsName();
       			var ids = getCarKeepApplySelectionsIds();
            	if(ids.length == 0){
            		$.messager.alert('提示','必须选择一条信息才能编辑!');
            		return ;
            	}
            	if(ids.indexOf(',') > 0){
            		$.messager.alert('提示','只能选择一条信息编辑!');
            		return ;
            	}if(name==("段内处理")|| name==("上报处理")){
               		$.messager.alert('提示','段内处理或上报处理后，不能在编辑信息!');
               		return;
               	}
            	
            	$("#carKeepApplyEditWindow").window({
            		onLoad :function(){
            			//回显数据
            			var data = $("#carKeepApplyList").datagrid("getSelections")[0];
            			data.startdate = TAOTAO.formatDate(data.startdate);
            			data.enddate = TAOTAO.formatDate(data.enddate);
            			data.departmentId = data.department.departmentId;
            		//	if(data.department.fatherdep=='0'){
            		//		data.fathername = data.department.departmentName;
            		//	}else{
            				data.departmentName = data.department.departmentName;
            		//	}
            			keep1applyEditor.html(data.repairtype);
            			$("#carKeepApplyEditForm").form("load", data);
            			
            		}
            	}).window("open");
       		}
       	});
    }
    
    function carKeepApply_delete(){
    	$.get("carKeepApply/delete_judge",'',function(data){
      		if(data.msg != null){
      			$.messager.alert('提示', data.msg);
      		}else{
      			var ids = getCarKeepApplySelectionsIds();
      			var name = getCarKeepApplySelectionsnames();
            	if(ids.length == 0){
            		$.messager.alert('提示','未选中信息!');
            		return ;
            	}
            	$.messager.confirm('确认','确定删除车牌号为 '+name+' 的维护信息吗？',function(r){
            	    if (r){
            	    	var params = {"ids":ids};
                    	$.post("carKeepApply/delete_batch",params, function(data){
                			if(data.status == 200){
                				$.messager.alert('提示','删除信息成功!',undefined,function(){
                					$("#carKeepApplyList").datagrid("reload");
                				});
                			}
                		});
            	    }
            	});
      		}
      	});
    }
    
    function carKeepApply_reload(){
    	$("#carKeepApplyList").datagrid("reload");
    }
</script>