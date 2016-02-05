#社区模块 

[1.批量添加社区信息](#1)

---
##<a id="1">1.批量添加社区信息</a>

###<a id="1.1">URL</a>
/v1/community/batchAdd.json

###<a id="1.2">请求方式</a>
POST

###<a id="1.3">Header</a>
Content-Type : application/json

###<a id="1.4">请求参数</a>
     参数      | 必选 	    | 类型及范围     |说明
-------------  | ---------- | -------------  |---------- 
communities      | true	      | array         |社区信息列表

###<a id="1.5">请求Json示例</a>
	{       
		"communities": [{
		  "id" : 1,
		  "isExist" : true,
		  "mcount" : 123,
		  "name" : "一班",
		  "type" :"幼师资格班"
		}]
	}

###<a id="1.6">返回Json示例</a>
####<a id="1.6.1">请求成功</a>
	{
		"success":"true"
	}

####<a id="1.6.2">请求失败</a>
	{
		"error_code":"10000",
		"error_message":"XXXXX"
	}
[错误码详见错误码对照表](错误码对照表.md)
