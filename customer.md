#客户模块 

[1.批量添加一个班级的客户](#1)

[2.获得班级列表](#2)

[3.批量添加多个班级的客户](#3)

[4.根据查询条件搜索用户信息](#4)

[5.新增或修改一个用户的信息](#5)

[6.通过项目ID和用户在项目所在的网站系统的用户ID查询](#6)

[7.通过用户在项目所在的网站系统的用户ID查询](#7)

[8.通过用户在数据库的ID来查找用户](#8)

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
		  "lastLogin": "2015/5/12 17:17:18" //上次登录时间
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
##<a id="2">2.获得班级列表</a>

###<a id="2.1">URL</a>
/v1/customer/getClassList.json

###<a id="2.2">请求方式</a>
GET

###<a id="2.3">Header</a>
Content-Type : application/json

###<a id="2.4">请求参数</a>
无


###<a id="2.5">请求Json示例</a>
无

###<a id="2.6">返回Json示例</a>
####<a id="2.6.1">请求成功</a>
	{
		"success":"true",
		"data":[{},{}]  //每一个{}对应一个class对象
	}

####<a id="2.6.2">请求失败</a>
	{
		"error_code":"10000",
		"error_message":"XXXXX"
	}
[错误码详见错误码对照表](错误码对照表.md)

---
##<a id="3">3.批量添加多个班级的客户</a>

### URL
/v1/customer/addCustomerByMoreClass.json

### 请求方式
POST

### Header
Content-Type : application/json

### 请求参数
     参数      | 必选 	    | 类型及范围     |说明
-------------  | ---------- | -------------  |---------- 
spid      | true	      | string         |网站系统中的项目id
pname       | true	      | string         |项目名称
customers      | true       | array            |客户数组


### 请求Json示例
	{
	  spid : "28",
	  pname : "江门幼儿师范学校学前教育专业幼儿园教师资格证书班",
	  customers : {
	    "1222":[{},{}],   //1222为网站系统中班级编号
	    "1223":[{},{
		    "username": "baijieying",
		    "name": "白洁莹",
		    "hasStudyVideo": 48,
		    "videoTotal": 226,
		    "workStatus": "0/0/68/68",
		    "xindeStatus": "未完成",
		    "gender": "女",
		    "workunit": "",
		    "title": "",
		    "learnStage": "",
		    "subject": "",
		    "job": "",
		    "tel": "15920175703",
		    "email": "",
		    "qq": "",
		    "province": "广东省",
		    "city": "广州市",
		    "country": "广州市",
		    "userType": "学员",
		    "loginCount": 42,
		    "lastLogin": "2015/7/31 13:54:20"
	    }]
	  }
	}

### 返回Json示例
#### 请求成功
	{
		"success":"true"
	}

#### 请求失败
	{
		"error_code":"10000",
		"error_message":"XXXXX"
	}

---
##<a id="4">4.根据查询条件搜索用户信息</a>

### URL
/v1/customer/findByConditions.json

### 请求方式
POST

### Header
Content-Type : application/json

### 请求参数
     参数      | 必选 	    | 类型及范围     |说明
-------------  | ---------- | -------------  |---------- 
name           | false	    | string         |用户姓名
workunit       | false	    | string         |工作单位
province       | false	    | string         |所在省份
city           | false	    | string         |所在城市、县或者镇
projectId      | false      | int            |项目ID
classId        | false      | int            |班级ID
start          | true       | int            |记录初始位置
### 请求Json示例
	{       
	    "name" : "用户的姓名",
	    "workunit" : "工作单位,例如蓝天幼儿园",
	    "province" : "广东",
	    "city" : "广州",
	    "start" : 0
    	}

### 返回Json示例
#### 请求成功
	{
		"success":"true",
		"data" : {
		  "customers" : [{
		    "id" : 1212,
		    "name" : "张三",
		    "workunit" : "xxx",
		    "provnice" : "xxxxx",
		    "city" : "xxx",
		    "tel" : "234234234", //电话
		    "hasOrder" : true,  //已经下过订单,老客户
		    "qq" : 234234,
		    "email" : "3423@qq.com",
		    "projectName" : "幼师资格证培训",
		    "className" : "12班",
		    "projectId" : 12,
		    "classId" : 12,
		    "username" : "username"
		  }],
		  "count" : 30   //次查询条件下的总记录数
		}
	}

#### 请求失败
	{
		"error_code":"10000",
		"error_message":"XXXXX"
	}	

---
##<a id="5">5.新增或修改一个用户的信息</a>

### URL
/v1/customer/saveOrUpdate.json

### 请求方式
POST

### Header
Content-Type : application/json

### 请求参数
     参数      | 必选 	    | 类型及范围     |说明
-------------  | ---------- | -------------  |---------- 
id             | false	    | int            |客户ID,在修改用户的时候传入
sid            | true	    | string         |客户在学习系统中的用户ID
classId        | true	    | int            |客户在daikan DB中的班级ID
city           | false	    | string         |所在城市、县或者镇
province       | false      | string         |身份
name           | false      | string         |用户姓名
### 请求Json示例
	{       
	    "sid" : "23423423",
	    "classId" : 12,
	    "province" : "广东",
	    "city" : "广州"
    	}

### 返回Json示例
#### 请求成功
	{
		"success":"true",
		"data" : {
		 	"cid" : 324234	
		}
	}

#### 请求失败
	{
		"error_code":"10000",
		"error_message":"XXXXX"
	}		

---
##<a id="6">6.通过项目ID和用户在项目所在的网站系统的用户ID查询</a>

### URL
/v1/customer/findByProjectIdAndSid.json

### 请求方式
POST

### Header
Content-Type : application/json

### 请求参数
     参数      | 必选 	    | 类型及范围     |说明
-------------  | ---------- | -------------  |---------- 
projectId      | true	    | int            |项目ID
sid            | true	    | string         |客户在学习系统中的用户ID

### 请求Json示例
	{       
	    "sid" : "440110261851459",
	    "projectId" : 7
    	}

### 返回Json示例
#### 请求成功
	{
		"success":"true",
		"data" : {
		 	"customers" : [{},{}...]
		}
	}

#### 请求失败
	{
		"error_code":"10000",
		"error_message":"XXXXX"
	}		

---
##<a id="7">7.通过用户在项目所在的网站系统的用户ID查询</a>

### URL
/v1/customer/findBySid.json

### 请求方式
POST

### Header
Content-Type : application/json

### 请求参数
     参数      | 必选 	    | 类型及范围     |说明
-------------  | ---------- | -------------  |---------- 
sid            | true	    | string         |客户在学习系统中的用户ID

### 请求Json示例
	{       
	    "sid" : "440110261851459"
    	}

### 返回Json示例
#### 请求成功
	{
		"success":"true",
		"data" : {
		 	"customers" : [{},{}...]
		}
	}

#### 请求失败
	{
		"error_code":"10000",
		"error_message":"XXXXX"
	}				

---
##<a id="9">8.通过用户在数据库的ID来查找用户</a>

### URL
/v1/customer/cid/{cid}.json

### 请求方式
POST

### Header
Content-Type : application/json

### 请求参数
     参数      | 必选 	    | 类型及范围     |说明
-------------  | ---------- | -------------  |---------- 
cid            | true	    | int            |客户在数据库中的ID

### 请求Json示例
	/v1/customer/cid/123213.json

### 返回Json示例
#### 请求成功
	{
		"success":"true",
		"data" : {
		 	"id": 34234,
		 	...
		}
	}

#### 请求失败
	{
		"error_code":"10000",
		"error_message":"XXXXX"
	}				
[错误码详见错误码对照表](错误码对照表.md)
