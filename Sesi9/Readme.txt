DemoSAX - com.learning.sax
DemoDOM - com.learning.dom
DemoChallange - com.learning.challange

mvn archetype:generate -DgroupId=com.learning.challange -DartifactId=DemoChallange -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

<build>
    <plugins>
        <plugin>
            <groupId>org.codehaus.mojo</groupId>
            <artifactId>exec-maven-plugin</artifactId>
            <version>1.6.0</version>
            <configuration>
                <mainClass>com.learning.sax.JavaReadXmlSaxEx</mainClass>
            </configuration>
        </plugin>
    </plugins>
  </build>

mvn exec:java -Dexec.mainClass="com.ParsingXmlSax.module.Mail"
mvn exec:java -Dexec.mainClass="com.learning.sax.ParseKnownXMLStructure"
mvn exec:java -q

mvn exec:java -Dexec.mainClass="com.ParsingXmlSax.module.Mail"
mvn exec:java -Dexec.mainClass="com.learning.dom.ParseKnownXMLStructure"
mvn exec:java -q

