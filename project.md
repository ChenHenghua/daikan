#项目模块 

[1.获取项目列表](#1)

[2.通过项目ID获得班级列表](#2)

[3.添加或修改班级](#3)

[4.添加班级](#4)

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
	
---
##<a id="3">3.添加班级</a>

### URL
/v1/project/class/saveOrUpdate.json

### 请求方式
POST

### Header
Content-Type : application/json

### 请求参数
     参数      | 必选 	    | 类型及范围     |说明
-------------  | ---------- | -------------  |---------- 
classId        | false      | int            | 班级ID，修改时必须传入,新增时不传入
projectId      | false      | int            | 项目ID,新增时必须传入        
name           | false      | string         | 班级名称,新增时必须传入

### 请求Json示例
	{       
		"projectId" : 6,
		"name" : "2班"
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
##<a id="4">4.添加班级</a>

### URL
/v1/project/class/create.json

### 请求方式
POST

### Header
Content-Type : application/json

### 请求参数
     参数      | 必选 	    | 类型及范围     |说明
-------------  | ---------- | -------------  |---------- 
projectId      | true       | int            | 项目ID,新增时必须传入        
name           | true       | string         | 班级名称,新增时必须传入
sclassid       | false      | string         | 班级在项目所在网站系统中的ID

### 请求Json示例
	{       
		"projectId" : 6,
		"name" : "2班",
		"sclassid" : "12312"
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
[错误码详见错误码对照表](错误码对照表.md)

