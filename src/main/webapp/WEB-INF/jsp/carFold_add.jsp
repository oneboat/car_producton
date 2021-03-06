<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">

<link href="css/uploadfile.css" rel="stylesheet"> 
<script src="js/jquery.uploadfile.js"></script>
<script src="js/malsup.github.iojquery.form.js"></script>
<style type="text/css">   
    .border-table {   
        border-collapse: collapse;   
         border: solid #87CEFA 1px;   
    }   
    .border-table td {   
        border: solid #87CEFA 1px;
        color:#4682B4; 
        font-size:13px;
    }  
</style>
<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/lang/zh_CN.js"></script>

<div style="padding:10px 10px 10px 10px">
	<form id="carFoldAddForm" class="carFoldForm" method="post">
	 <center>
	    <table class="border-table" cellpadding="5" align="center">
		       <tr>
	    		<td width="110px" bgcolor="#F0F8FF" align="right">发布人</td>
	            	<td width="auto" > <input class="easyui-textbox" name="user" value="${username }" data-options="required:true"></td>
		      </tr>
		       <tr>
	    		<td bgcolor="#F0F8FF" align="right">部门</td>
	            <td>
	            	<input class="easyui-combobox" id="departmenCombox823" panelHeight="200"  data-options="required:true"/>
	            	<input name="departmentFrist" id="departmentFrist" type="hidden"/>
    				<input name="bei2" id="departmentId823" type="hidden"/>
    				<!-- 
    				<input class="easyui-combobox" id="departmenCombox0508" panelHeight="auto" data-options="required:true"/>
	            	<input name="departmentFrist" id="departmentFrist" type="hidden"/>
    				<input class="easyui-combobox" id="department0508"  panelHeight="200"/>  
    				<input name="departmentId" id="departmentId0508" type="hidden"/>
    				 -->
	            </td>
	            </tr>
		      <tr>
		      <td bgcolor="#F0F8FF" align="right">文件来源</td>
		      <td>
		       <select id="cc" class="easyui-combobox" name="bei" panelHeight="auto" 
	            		data-options="required:true,width:150, editable:false">
						<option value="${chejian }">${chejian }</option>
						<option value="${duanfa }">${duanfa }</option>
						<option value="${jufa }">${jufa }</option>
					</select></td>
		      </tr>
		       <tr>
	    		<td bgcolor="#F0F8FF" align="right">上传时间</td>
	            	<td>
	            	<input class="easyui-datetimebox" name="datetime"     
        			data-options="required:true,showSeconds:true" value="date.format('yyyy-MM-dd')" style="width:150px"></input>
	            </td>
		      </tr>
	         <tr>
    			<td  bgcolor="#F0F8FF" align="right">文件上传</td>
    			 <td>
	                 <!-- <iframe src="file_upload.jsp"></iframe>  -->
	                 <div id="foldAddFileUploader">上传文件</div>
	                 <input type="hidden" id="carFoldAddFile" name="fold"/>
	            </td>
	        </tr>
	    </table>
	     </center>
	    <input type="hidden" name="carFoldParams"/>
	</form>
	<div style="padding:5px 0 0 650px">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitCarFoldAddForm()">提交</a>
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearCarFoldADDForm()">重置</a>
	</div>
</div>
<script type="text/javascript">

		$(function(){
			//加载文件上传插件
			initFoldAddFileUpload();
		});
	//提交表单
	function submitCarFoldAddForm(){
		//有效性验证
		if(!$('#carFoldAddForm').form('validate')){
			$.messager.alert('提示','表单还未填写完成!');
			return ;
		}
		//ajax的post方式提交表单
		//$("#carFoldAddForm").serialize()将表单序列号为key-value形式的字符串
		$.post("carFold/insert",$("#carFoldAddForm").serialize(), function(data){
			if(data.status == 200){
				$.messager.alert('提示','新增信息成功!');
				$("input[name='fold']").val(null);
				clearCarFoldADDForm();
				$("#carFoldAddWindow").window('close');
				$(".ajax-file-upload-container > .ajax-file-upload-statusbar").remove();
				$("#carFoldList").datagrid("reload");
			}else{
				$.messager.alert('提示',data.msg);
				$("input[name='fold']").val(null);
				clearCarFoldADDForm();
				$("#carFoldAddWindow").window('close');
				$(".ajax-file-upload-container > .ajax-file-upload-statusbar").remove();
				$("#carFoldList").datagrid("reload");
			}
		});
	}
	
	function clearCarFoldADDForm(){
		$('#carFoldAddForm').form('reset');
	}
	$('#departmenCombox823').combobox({  
        url: "department/get_data_first",  
        editable:false,  
        valueField:'departmentId',   
        textField:'departmentName',  
        onSelect : function(data){  
            $('#departmentFrist').val(data.departmentId);  
            $('#departmentId823').val(data.departmentId);  
 //           var fatherdep= $('#departmentFrist').val();
          
//            $('#department0508').combobox({  
               
 //               url:"department/get_data_second/"+fatherdep,  
 //               valueField:'departmentId',  
 //               textField:'departmentName',
//                onSelect : function(data1){  
//                  $('#departmentId0508').val(data1.departmentId);  
//                }
           
//            }).combobox('clear');  
        }  
    });  
</script>
