# config-server
This project is a spring boot app which utilizes [spring cloud config] for exposing configurations stored in a database 
as rest api and client modules are expected to fetch them at start up.  

---

## Overview

* The schema of the table is set into [schema.sql] .
* Configurations are put into the single table database using a [sql script file] .
* Security for exposed api is configured in [BasicSecurityConfiguration.java] .   



[spring cloud config]: https://cloud.spring.io/spring-cloud-config/reference/html/ 
[schema.sql]: https://github.com/ali4j/cloud-config-sample/blob/master/SpringBootCloudConfig/src/main/resources/data.sql
[sql script file]: https://github.com/ali4j/cloud-config-sample/blob/master/SpringBootCloudConfig/src/main/resources/data.sql
[BasicSecurityConfiguration.java]: https://github.com/ali4j/cloud-config-sample/blob/master/SpringBootCloudConfig/src/main/java/io/github/ali4j/springbootcloudconfig/helloworld/config/security/BasicSecurityConfiguration.java
 

