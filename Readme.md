##java_script_engine
Java and groovy are compatible in a way 
    - java source could be invoked from groovy
    - groovy source could be executed from java using the Java Scripting API (defined by JSR 223)
    https://docs.oracle.com/javase/8/docs/technotes/guides/scripting/prog_guide/api.html
```
mvn package
java -cp target/pengapp-1.0-SNAPSHOT-jar-with-dependencies.jar com.penguin.App

mvn exec:java -Dexec.mainClass="com.penguin.App"

# to include dependencies, inc org.apache.maven.plugins plugin build step.




```
