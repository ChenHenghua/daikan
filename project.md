#项目模块 

[1.获取项目列表](#1)

[2.通过项目ID获得班级列表](#2)

[3.添加班级](#3)

---
##<a id="1">1.获取项目列表</a>

###<a id="1.1">URL</a>
/v1/project/list.json

###<a id="1.2">请求方式</a>
POST

###<a id="1.3">Header</a>
Content-Type : application/json

###<a id="1.4">请求参数</a>
     参数      | 必选 	    | 类型及范围     |说明
-------------  | ---------- | -------------  |---------- 

###<a id="1.5">请求Json示例</a>
	{       
	}

###<a id="1.6">返回Json示例</a>
####<a id="1.6.1">请求成功</a>
	{
		"success":"true",
		"data" : [{
		  "projectId" : 111,
		  "name" : "项目名称",
		  "url" : "项目地址www.abidu.com",
		  "isopen" : true,
		  "spid" : 28
		}]
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
		    "email" : "3423@qq.com"
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
[错误码详见错误码对照表](错误码对照表.md)

