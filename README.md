Simple rest endpoint

Starting:

mvn wildfly-swarm:run

OR

mvn package
java -jar target/rest-1.0-SNAPSHOT-swarm.jar

Testing:

curl http://localhost:8080/rest/hello