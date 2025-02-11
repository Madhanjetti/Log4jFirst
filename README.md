Steps For Log4j Implementation:
1.open eclipse and start maven project,start simple project 
2.Then search maven-compiler-plugin java 21 in chrome next go to site given
https://maven.apache.org/plugins/maven-compiler-plugin/examples/set-compiler-source-and-target.html
3.Then copy the code given
<properties>
    <maven.compiler.source>1.8</maven.compiler.source>
    <maven.compiler.target>1.8</maven.compiler.target>
  </properties>
4.Add the above the code to pom.xml 
5.next add following dependencies to pom.xml
https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-core  --  2.17.2
https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.17.2  --  2.17.2 
6.Then follow code steps in test and resource

