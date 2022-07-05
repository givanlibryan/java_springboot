DemoSAX - com.learning.sax
DemoDOM - com.learning.dom
DemoChallange - com.learning.challange

mvn archetype:generate -DgroupId=com.learning.sax -DartifactId=DemoSAX -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
mvn archetype:generate -DgroupId=com.learning.dom -DartifactId=DemoDOM -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
mvn archetype:generate -DgroupId=com.learning.challange -DartifactId=DemoChallange -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
mvn archetype:generate -DgroupId=com.learning.alexa -DartifactId=Alexa -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

mvn exec:java -Dexec.mainClass="com.ParsingXmlSax.module.Mail"
mvn exec:java -Dexec.mainClass="com.learning.sax.ParseKnownXMLStructure"
mvn exec:java -q

mvn exec:java -Dexec.mainClass="com.ParsingXmlSax.module.Mail"
mvn exec:java -Dexec.mainClass="com.learning.dom.ParseKnownXMLStructure"
mvn exec:java -q

<dependencies>

    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.13</version>
      <scope>test</scope>
    </dependency>

    <dependency>
      <groupId>org.hamcrest</groupId>
      <artifactId>hamcrest-core</artifactId>
      <version>1.3</version>
      <scope>test</scope>
    </dependency>
    
  </dependencies>

  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>1.8</maven.compiler.source>
    <maven.compiler.target>1.8</maven.compiler.target>
  </properties>

  <build>
    <plugins>

        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-jar-plugin</artifactId>
            <version>2.3.2</version>
            <configuration>
                <archive>
                    <manifest>
                        <mainClass>com.learning.thread.App</mainClass>
                    </manifest>
                </archive>
            </configuration>
        </plugin>

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

