
## Add jar to local maven repo

mvn install:install-file -Dfile=./spring-cloud-tsf-sleuth-0.0.1-SNAPSHOT.jar -DgroupId=com.tencent.tsf \
-DartifactId=spring-cloud-tsf -Dversion=0.0.1-SNAPSHOT -Dpackaging=jar

