#客户模块 

[1.批量添加客户](#1)

---
##<a id="1">1.批量添加客户</a>

###<a id="1.1">URL</a>
/v1/customer/addCustomerBatch.json

###<a id="1.2">请求方式</a>
POST

###<a id="1.3">Header</a>
Content-Type : application/json

###<a id="1.4">请求参数</a>
     参数      | 必选 	    | 类型及范围     |说明
-------------  | ---------- | -------------  |---------- 
className      | true	      | string         |班级名称
sclassid       | true	      | string         |班级在网站系统中的编号
customers      | true       | array          |客户数组

###<a id="1.5">请求Json示例</a>
	{       
		"pname": "项目名称",
		"spid": "项目在系统中的id",
		"className": "班级名称",
		"sclassid" : "",
		"customers" : [{
		  "name" : "姓名",
		  "qq":"10000",
		  "tel":"13765348726",
		  "province":"省份",
		  "city":"城市",
		  "country":"县区乡镇",
		  "username":"所在网站系统的用户名",
		  "workunit":"工作单位",
		  "hasStudyVideo":23,//已观看课件的数量
		  "videoTotal": 234, //课件的总数量
		  "workStatus":"68/34/34/34", //作业完成情况
		  "xindeStatus":"未来完成", //心得完成情况
		  "learnStage":"第一学年",//学段
		  "email": "a@b.com",
		  "loginCount": 20, //登录次数
		  "gender": "F",
		  "title":"职称",
		  "job":"教师", //职务
		  "subject":"学科",
		  "userType":"学员", //用户类型
		  "lastLogin": "2015/5/12 17:17:18", //上次登录时间
		},{...},{...}]
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

---
##<a id="2">2.批量双向添加好友</a>

###<a id="2.1">URL</a>


###<a id="2.2">请求方式</a>
POST

###<a id="2.3">Header</a>
Content-Type : application/json

###<a id="2.4">请求参数</a>
     参数      | 必选 	    | 类型及范围     |说明
-------------  | ---------- | -------------  |---------- 
userIdA        | true	    | string         |用户id
userIdBatch    | true       | array          |被加的批量用户ID


###<a id="2.5">请求Json示例</a>
	{
		"userIdA" : "2342332222",
		"userIdBatch" :["1342332222","1342332223","1342332224"]
	}

###<a id="2.6">返回Json示例</a>
####<a id="2.6.1">请求成功</a>
	{
		"success":"true"
	}

####<a id="2.6.2">请求失败</a>
	{
		"error_code":"10000",
		"error_message":"XXXXX"
	}
[错误码详见错误码对照表](错误码对照表.md)

