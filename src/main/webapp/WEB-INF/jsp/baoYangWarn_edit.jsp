<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">

<link href="css/uploadfile.css" rel="stylesheet"> 
<script src="js/jquery.uploadfile.js"></script>
<script src="js/malsup.github.iojquery.form.js"></script>

<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/lang/zh_CN.js"></script>
<div style="padding:10px 10px 10px 10px">
	<form id="carCheckEditForm" class="carCheckForm" method="post">
		<input type="hidden" name="checkId"/>
	    <center>
	    <table cellpadding="5" border="1px">
		   <tr>
	    		<td>设备编号</td>
	            <td>
	            	<input class="easyui-combobox" id="carCombox" data-options="required:true" panelHeight="auto" size="9px" />
	            	<input name="usenature" id="usenature" type="hidden"/>
    				<input class="easyui-combobox" id="carNumberCombox" data-options="required:true" panelHeight="auto" size="10px"/>  
    				<input name="carId" id="carId" type="hidden"/>
	            	
	            </td>
        			<td>运用年</td>
	            	<td> <input class="easyui-textbox" type="text" name="checkyear" data-options="required:true"></td>
		      </tr>
	         <tr>
    			<td>运用月</td>
	            <td>
	            <input class="easyui-textbox" type="text" name="checkmonth" data-options="required:true">
	             </td>
        			<td>车况评分</td>
	            <td>
	            	<input class="easyui-textbox" type="text" name="carscore" data-options="required:true"></input>
	            </td>
	        </tr>
	        <tr>
    			<td >存在问题</td>
	            <td colspan="3"> <textarea style="width:200px;height:100px;visibility:hidden;" name="carquestion"></textarea></td>
	       		
	        </tr>
	         <tr>
    		
	       		<td >处理结果</td>
	            <td colspan="3"><textarea style="width:200px;height:100px;visibility:hidden;" name="results"></textarea></td>
	        </tr>
	    </table>
	     </center>
	</form>
	<div style="padding:5px 0 0 55px">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitCarCheckEditForm()">提交</a>
	</div>
</div>
<script type="text/javascript">
var send2AddEditor;
var send2AddEditor1;

$(function(){
	//加载文件上传插件

	send2AddEditor = KindEditor.create("#carCheckEditForm [name=carquestion]", TT.kingEditorParams);
	send2AddEditor1 = KindEditor.create("#carCheckEditForm [name=results]", TT.kingEditorParams);
});

	function submitCarCheckEditForm(){
		if(!$('#carCheckEditForm').form('validate')){
			$.messager.alert('提示','表单还未填写完成!');
			return ;
		}
		send2AddEditor.sync();
		send2AddEditor1.sync();
		$.post("carCheck/update_all",$("#carCheckEditForm").serialize(), function(data){
			if(data.status == 200){
				$.messager.alert('提示','修改车型成功!','info',function(){
					$("#carCheckEditWindow").window('close');
					$("#carCheckList").datagrid("reload");
				});
			}else{
				$.messager.alert('提示', data.msg);
			}
		});
	}
	
	$('#carCombox').combobox({  
        url: "carPublic/get_data",  
        editable:false,  
        valueField:'usenature',   
        textField:'usenature',  
        panelHeight:'auto',  
        onSelect : function(data){  
            $('#usenature').val(data.usenature);  
            var fatherdep= $('#usenature').val();
          
            $('#carNumberCombox').combobox({  
               
                url:"carPublic/find_nature/"+fatherdep,  
                valueField:'carId',  
                textField:'carnumber' ,
                editable:false,
                onSelect : function(data1){  
                  $('#carId').val(data1.carId);  
                }
           
            }).combobox('clear');  
        }  
    });  
	

	$('#carCombox').combobox({  
        url: "carPublic/get_data",  
        editable:false,  
        valueField:'usenature',   
        textField:'usenature',  
        panelHeight:'auto',  
        onSelect : function(data){  
            $('#usenature').val(data.usenature);  
            var fatherdep= $('#usenature').val();
          
            $('#carNumberCombox').combobox({  
               
                url:"carPublic/find_nature/"+fatherdep,  
                valueField:'carId',  
                textField:'carnumber' ,
                editable:false,
                onSelect : function(data1){  
                  $('#carId').val(data1.carId);  
                }
           
            }).combobox('clear');  
        }  
    });  
</script>
