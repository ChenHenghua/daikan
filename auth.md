#员工权限模块 

[1.登录](#1)

[2.登出](#2)

---
##<a id="1">1.登录</a>

###<a id="1.1">URL</a>
/v1/auth/login.json

###<a id="1.2">请求方式</a>
POST

###<a id="1.3">Header</a>
Content-Type : application/json

###<a id="1.4">请求参数</a>
     参数      | 必选 	    | 类型及范围     |说明
-------------  | ---------- | -------------  |---------- 
username      | true	      | string         |用户名
password       | true	      | string         |密码

###<a id="1.5">请求Json示例</a>
	{ 
	  "username" : "admin",
	  "password" : "admin"
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
##<a id="2">2.登出</a>

### URL
/v1/auth/logout?v=0.12424（随机数）

### 请求方式
GET

###<a id="1.3">Header</a>
Content-Type : application/json

###<a id="1.4">请求参数</a>
无

### 返回示例
跳转到登录页面

[错误码详见错误码对照表](错误码对照表.md)

