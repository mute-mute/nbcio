Nbcio-Boot V1.0.0 NBCIO亿事达企业管理平台
===============

基于jeecg-boot3.0版本（发布日期：2021-11-01）

前端地址 https://gitee.com/nbacheng/nbcio-vue

## 在线演示(包括H5) ：[http://122.227.135.243:9888](http://122.227.135.243:9888)

    H5地址是：http://122.227.135.243:9888/h5/
    演示账号：admin，zhangsan，01015521328526密码都是123456
	如果你对项目感兴趣，请Watch、Star项目

## 联系作者
- 欢迎bug反馈，需求建议，技术交流等

- 个人网页:  https://blog.csdn.net/qq_40032778

- QQ交流群 ：655054809 

## 友情链接
- Uniapp项目: https://gitee.com/pzy332/jeecg-app-flowable.git 

## 后端技术架构
- 基础框架：Spring Boot 2.3.5.RELEASE

- 持久层框架：Mybatis-plus 3.4.3.1

- 安全框架：Apache Shiro 1.7.0，Jwt 3.11.0

- 数据库连接池：阿里巴巴Druid 1.1.22

- 缓存框架：redis

- 日志打印：logback

- 其他：fastjson，poi，Swagger-ui，quartz, lombok（简化代码）等。



## 开发环境

- 语言：Java 8

- IDE(JAVA)： STS安装lombok插件 或者 IDEA

- 依赖管理：Maven

- 数据库：MySQL5.7+  &  Oracle 11g & SqlServer & postgresql & 国产等更多数据库

- 缓存：Redis


注意： 如果本地安装了mysql和redis,启动容器前先停掉本地服务，不然会端口冲突。
       net stop redis
       net stop mysql
 
# 1.配置host

    # nbcioboot
    127.0.0.1   nbcio-boot-redis
    127.0.0.1   nbcio-boot-mysql
    127.0.0.1   nbcio-boot-system
	
# 2.修改项目配置文件 application.yml
    active: dev
	
# 3.修改application-dev.yml文件的数据库和redis链接
	修改数据库连接和redis连接，将连接改成host方式

# 4.先进JAVA项目jeecg-boot根路径 maven打包
    mvn clean package

# 5.访问后台项目（注意要开启swagger）
    http://localhost:8080/nbcio-boot/doc.html

## 增加的主要功能

   1、基于flowable 6.7.2 的工作流管理:
          包括流程设计、表单定义、流程发起、流程流转和消息提醒等功能，同时支持自定义业务的流程定义与流转。

   2、基于钉钉的薪资流程审批例子:
          写了一个薪资的钉钉流程流转，通过定义流程，同时结合钉钉，发起后通过钉钉来进行审批与流转。

   3、写了一个前端实现从表ERP格式选择，以便以后满足库存管理等ERP应用。

   4、参考了多个开源项目，在此表示感谢。
   
   5、增加了一个聊天功能
   
   6、在线表单设计器修改成formdesigner
   
   7、流程设计器修改成bpmn-process-designer
   
   8、支持online表单的流程申请与流转审批
   
   9、重新整理优化流程，支持会签角色等功能
   
   10、增加部分ERP功能
   
   11、增加大屏设计功能
   
   12、增加网盘功能

   13、以后希望能增加更多OA和ERP等相关功能。
   
   系统效果
   ----
![](https://oscimg.oschina.net/oscnet/up-ce7d9e52f39df3c7c9c08fae2233b843c86.png)

![](https://oscimg.oschina.net/oscnet/up-5a590c9f230541b58d89a3d44c23de7ae2d.png)

![](https://oscimg.oschina.net/oscnet/up-0b37ae7cf543b1ccc92f04a89c242866a25.png)

![](https://oscimg.oschina.net/oscnet/up-a5dcf863f39bb9bb81493b71eb46b51b884.png)

![](https://oscimg.oschina.net/oscnet/up-971d9321e22618ad70db56bbc1a6de77e9c.png)

![](https://oscimg.oschina.net/oscnet/up-e9182f6d379a37f8a03f347beeeca4cc7ca.png)

![](https://oscimg.oschina.net/oscnet/up-639599563b744e92ee9533f5e040d37c6ce.png)

![](https://oscimg.oschina.net/oscnet/up-1cca12b07f43edf134df5df66c9781972aa.png)

![](https://oscimg.oschina.net/oscnet/up-d2b8047ace2640dd190891fb78c3a58fd7e.png)

![](https://oscimg.oschina.net/oscnet/up-dfb183d37a7ac8b7c66af4e84fc120da1e1.png)

![](https://oscimg.oschina.net/oscnet/up-9f41d75e82ff682061dcfaec0ff6cb3954d.png)

![](https://oscimg.oschina.net/oscnet/up-6af11135ef1e923ef9f75af716886bc1b51.png)

![](https://oscimg.oschina.net/oscnet/up-cc49627b43df4c9abe7baf68272523c70e1.png)

## 捐赠 

如果觉得还不错，请作者喝杯咖啡吧！

![](https://oscimg.oschina.net/oscnet/up-58088c35672c874bd5a95c2327300d44dca.png)