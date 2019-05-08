# spring-boot-ssm
用spring boot 整合mybatis 构建一个简单的应用。
其中用到了swagger2 方便测试。

tip:在IDEA中，mybatis的**mapper.xml默认是放在resource文件加下的，否则不能打包到目标文件夹里（如果确实需要将xml与接口放到一起可以在pom中添加resource配置，
同时在主配置文件中添加扫描的路径mybatis.mapper-locations）