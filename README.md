# CICD Dummy

This is an example of Mule project which can be build and deployed with Maven

## Getting Started

Please pull the sources from github

### Prerequisites

Please make sure that your <HOME>/.m2/setting.xml contains:

- in the <servers> tag
```
    <server>
    	<id>MuleRepository</id>
    	<username>User Provided by MuleSoft</username>
    	<password>Password</password>
	</server>
```

- in the <profiles> tag

```
	<profile>
 
    <id>Mule</id>
    <activation>
        <activeByDefault>true</activeByDefault>
    </activation>
    <repositories>
        <repository>
            <id>MuleRepository</id>
            <name>MuleRepository</name>
            <url>https://repository.mulesoft.org/nexus-ee/content/repositories/releases-ee/</url>
            <layout>default</layout>
            <releases>
                <enabled>true</enabled>
            </releases>
            <snapshots>
                <enabled>true</enabled>
            </snapshots>
        </repository>
    </repositories>
 
</profile>
```

### How to build the project

```
    mvn clean package
```

### How to deploy the project

```
    mvn deploy -Dcloudhub.password=<Cloudhub password>
```