
Cloud_Discovery

```
cd Cloud_Discovery
gradle cleanEclipse eclipse

sudo vim /private/etc/hosts
```

# Eureka 介绍和案例

## Eureka_RegistryServer 
	eureka-server & spring-boot (8761)

## Eureka_Say_Hello_Service 
	eureka-client & spring-boot (8090, 8091, 8092)

## Eureka_User
	ribbon & spring-boot (8080)

TODO跨IP注册和发现...

查询那些有效的Client正在服务器里面 返回json
http://localhost:8761/eureka/apps

Refer this link: https://github.com/Netflix/eureka/wiki/Eureka-REST-operations

# Consul 
