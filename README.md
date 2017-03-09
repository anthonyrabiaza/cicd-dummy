# CICD Dummy

This is an example of Mule project which can be build and deployed with Maven

## Getting Started

Please pull the sources from github

### Prerequisites

Please make sure that your HOME/.m2/setting.xml (example provided here [setting.xml](resources/setting.xml)) contains:

- in the &lt;servers&gt; tag
```
    <server>
    	<id>MuleRepository</id>
    	<username>User Provided by MuleSoft</username>
    	<password>Password</password>
	</server>
```

- in the &lt;profiles&gt; tag

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
- Update pom.xml and replace the CloudHub username, environment and businessGroup (if you use the business group option, please uncomment the businessGroup tag in line 78)

```
        <!-- ARA -->
    	<prefix>ant</prefix>
    	<!-- cloudhub.domain>MuleSoft</cloudhub.domain-->
    	<cloudhub.username>anthonyrabiaza</cloudhub.username>
    	<cloudhub.environment>Sandbox</cloudhub.environment>
    	<!-- cloudhub.businessGroup>engineering\devops</cloudhub.businessGroup--><!-- uncomment businessGroup tag bellow-->
		<!-- END ARA -->
```
### How to build the project

```
    mvn clean package
```

### How to deploy the project

```
    mvn deploy -Dcloudhub.password=<Cloudhub password>
```