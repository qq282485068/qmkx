
# 《全民快迅》 #
**本平台主要采用面向服务架构，使用标准的MVC三层架构模式，前后端动静分离，前端使用H5+Vuejs，服务提供基于SpringCloud + Docker + ELK技术实现。使用SpringBoot提供Rest服务**


## 基础类库 ##
- qmzb-commons-core: 基础类库


## 基础服务  ##
- qmkx-monitor: 服务监控
- qmkx-gateway: 服务网关
- qmkx-server-config: 配置中心
- qmkx-server-eureka: 注册中心




## 业务服务  ##
- qmkx-service-sys: 系统服务
- qmkx-service-user: 用户服务
- qmkx-service-video: 视频服务



## 后台管理系统  ##
- qmkx-web-admin: 全民直播后台管理系统



## 服务消费端  ##
- qmzb-monitor-server:  SpringBoot应用监控服务端


**编码命名规范**
- Controller类命名：XxxController，请求处理方法为:list update updateByXxx delete deleteBy getXxxList 
- Service接口命名：XxxService，业务处理方法为: getXxxByPage()   getXxxList()  getXxxList(Xxx arg1, Xxx arg2), 业务层方法可以使用方法重载
- Service实现类命名：XxxServiceImpl
- Mapper与实现类均使用MyBatis代码生成器生成， 持久层数据库操作方法命名与MyBatis代码生成工具生成的方法命名一致，如：selectByXxx()  selectAll()  selectByPageNumSize()
- 其中，Xxx表示实体类名
- 自己编写的工具类名统一为 XxxUtil

- 后台管理系统中html页面文件命名为：
- 列表页面：  实体类名_list.html    
- 添加页面： 实体类名_add.html   
- 更新页面：  实体类名_edit.html   
- 查看页面：实体类名_view.html   


**文件头注释样例**
```java
/**
 * @version 1.0
 * @author: HaijunLiu
 * @email: isaiah@sohu.com
 * @description：用户实体类
 * @date: 2018/2/1 14:12
 * @mofified By:
 */
```

## 代码质量要求：
1. Java代码单元测试覆盖率80%以上（SonarQube为准）
2. Java代码重复率3%以下（SonarQube为准）
3. 所有公开的方法必须有JavaDoc
4. 所有数据字典要求有枚举
5. 单个方法圈复杂度不可以高于15
6. SonarQube的Bugs、漏洞、坏味道三个指标必须归零


## 人员岗位：

1. 技术总监：柳海军
2. 测试经理：孙晓敏
3. 后端开发人员：李英凯
4. WEB开发人员：郭文强
5. IOS开发人员：乔柏智
6. Android开发人员：
7. 测试人员：
8. 运维：李方


## 例会时间：每天10:10


## 开发环境信息：
1. Mysql: 192.168.1.41:13306   root   123456
2. MQ: 192.168.1.41  端口号：8161、61616、61613
3. Redis: 192.168.1.41 端口号：6379
4. Solr: 192.168.1.41 端口号：8983


## 测试环境监控：
1. Dubbo管理控制台： http://47.93.250.208:8080/dubbo-admin-2.0.0
2. Dubbo简易监控台:  http://47.93.250.208:8070/index.html
3. SpringBoot监控服务端:  http://47.93.250.208:8000



## PDM信息
1. pdm的htm页面访问地址  http://jenkins.qmzb.local:8090/view/后端重构项目-测试/job/后端重构-PDM表结构发布/数据库物理模型/
2. pdm的项目是  http://gitlab.qmzb.local/qmzb/qmzb-pdm.git

## SonarQube检查地址：
> SonarQube每两分钟检查一次代码

http://sonarqube.qmzb.local:9000/dashboard?id=com.zzgele.qmzb%3Aqmzb



## 技术选型 ##


| 技术 | 简介 | 网址 | 
| :--- | :--- | :--- | 
| Spring Framework | 底层容器 |  [https://projects.spring.io/spring-framework/](https://projects.spring.io/spring-framework/) |
| Spring Boot | 基础构建框架，用于快速整合各资源 | [https://projects.spring.io/spring-boot/](https://projects.spring.io/spring-boot/) |
| Spring Cloud | 微服务框架 | [https://projects.spring.io/spring-cloud/](https://projects.spring.io/spring-cloud/) |
| Spring Cloud Eureka | 服务注册中心 | [https://projects.spring.io/spring-cloud/](https://projects.spring.io/spring-cloud/) |
| Spring Cloud Zuul | 服务网关 | [https://projects.spring.io/spring-cloud/](https://projects.spring.io/spring-cloud/) |
| Spring Cloud Hystrix | 服务容错框架 | [https://projects.spring.io/spring-cloud/](https://projects.spring.io/spring-cloud/) |
| Spring Cloud Feign | 微服务声明式调用框架 | [https://projects.spring.io/spring-cloud/](https://projects.spring.io/spring-cloud/) |
| Spring Boot Admin | 服务管理中心 | [https://github.com/codecentric/spring-boot-admin](https://github.com/codecentric/spring-boot-admin) |
| Spring Data Jpa | 持久化框架 | [https://projects.spring.io/spring-data-jpa/](https://projects.spring.io/spring-data-jpa/) |
| Spring Data Redis | 缓存框架 | [https://projects.spring.io/spring-data-redis/](https://projects.spring.io/spring-data-redis/) |
| Spring Cache | Spring缓存 | [https://projects.spring.io/spring-data-redis/](https://projects.spring.io/spring-data-redis/) |
| Spring Session | Spring提供分布式Session解决方案 | [https://projects.spring.io/spring-data-redis/](https://projects.spring.io/spring-data-redis/) |
| Apache Shiro | 安全框架 | [http://shiro.apache.org/](http://shiro.apache.org/) |
| thymeleaf-extras-shiro | thymeleaf的shiro标签 | [https://github.com/theborakompanioni/thymeleaf-extras-shiro](https://github.com/theborakompanioni/thymeleaf-extras-shiro) |
| Apereo CAS | 单点登陆框架 | [https://github.com/apereo/cas](https://github.com/apereo/cas) |
| Spring Validator | JSR-303验证实现框架 | [https://projects.spring.io/spring-framework/](https://projects.spring.io/spring-framework/) |
| Hibernate Validator | Hibernate验证框架 | [http://hibernate.org/](http://hibernate.org/) |
| webjars | 以jars的形式管理前端静态资源 | [http://www.webjars.org/](http://www.webjars.org/) |
| Thymeleaf | 模板引擎  | [http://www.thymeleaf.org/](http://www.thymeleaf.org/) |
| Maven | 项目构建管理  | [http://maven.apache.org/](http://maven.apache.org/) |
| Redis | 分布式缓存数据库 | [https://redis.io/](https://redis.io/) |
| Mysql | 对象关系数据库 | [https://www.mysql.com/](https://www.mysql.com/)|
| MongoDB | 基于文档类的NoSQL数据库 | [https://www.mysql.com/](https://www.mysql.com/)|
| Elasticsearch | ELK技术栈成员，类NoSQL数据库 | [https://www.elastic.co/products/elasticsearch/](https://www.elastic.co/products/elasticsearch/)|
| Docker | 一个开源的引擎,可以轻松的为任何应用创建一个轻量级的、可移植的、自给自足的容器 | [https://www.docker.com/](https://www.docker.com/)|




**作者：***柳海军*

**邮箱：***isaiah@sohu.com*
