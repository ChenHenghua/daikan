#项目模块 

[1.获取项目列表](#1)

[2.通过项目ID获得班级列表](#2)

[3.添加班级](#3)

---
##<a id="1">1.获取项目列表</a>

### URL
/v1/project/list.json

### 请求方式
POST

### Header
Content-Type : application/json

### 请求参数
     参数      | 必选 	    | 类型及范围     |说明
-------------  | ---------- | -------------  |---------- 

### 请求Json示例
	{       
	}

### 返回Json示例
#### 请求成功
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

#### 请求失败
	{
		"error_code":"10000",
		"error_message":"XXXXX"
	}

---
##<a id="3">3.添加班级</a>

### URL
/v1/project/{pid}/class/new.json

### 请求方式
POST

### Header
Content-Type : application/json

### 请求参数
     参数      | 必选 	    | 类型及范围     |说明
-------------  | ---------- | -------------  |---------- 
name           | true       | string         | 班级姓名

### 请求Json示例
	{       
		name : "2班"
	}

### 返回Json示例
#### 请求成功
	{
		"success":"true",
		"data" : {
			classId : 112
		}
	}

#### 请求失败
	{
		"error_code":"10000",
		"error_message":"XXXXX"
	}
	
---
##<a id="2">2.通过项目ID获得班级列表</a>

### URL
/v1/project/{pid}/classes.json

### 请求方式
POST

### Header
Content-Type : application/json

### 请求参数
     参数      | 必选 	    | 类型及范围     |说明
-------------  | ---------- | -------------  |---------- 

### 请求Json示例
	{       
	}

### 返回Json示例
#### 请求成功
	{
		"success":"true",
		"data" : [{
		  "classId" : 111,
		  "projectId" : 123,
		  "name" : "班级名称"
		}]
	}

#### 请求失败
	{
		"error_code":"10000",
		"error_message":"XXXXX"
	}	
[错误码详见错误码对照表](错误码对照表.md)

