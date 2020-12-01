![](/api/v3/attachments/108/content)

![alt text](https://github.com/adityaver2701/selenium-docker/blob/master/images/Selenium-local.PNG?raw=true)

Pull all three necessary files in local from dockerhub

`docker pull selenium/hub:3.14`

`docker pull selenium/node-firefox:3.14`

`docker pull selenium/node-chrome:3.14`

Create a docker-compose file

```yaml
version: "3"
services:
  hub:
    image: selenium/hub:3.14
    ports:
      - "4444:4444"
  chrome:
    image: selenium/node-chrome:3.14
    depends_on:
      - hub
    environment:
      - HUB_HOST=hub
  firefox:
    image: selenium/node-firefox:3.14
    depends_on:
      - hub
    environment:
      - HUB_HOST=hub
```

Create a Java-framework for selenium grid:

![alt text](https://github.com/adityaver2701/selenium-docker/blob/master/images/Intellij.PNG?raw=true)


Open terminal inside Project and run following commands:

`mvn clean package -DskipTests`

`cd target`

`java -cp selenium-docker.jar;selenium-docker-tests.jar;libs/* -DBROWSER=firefox org.testng.TestNG ../book-flight-module.xml`

Login to planck.ai docker registry:

`sudo docker login registry.planck.ai`

username: `*&%$#`

password: `*&%$^&*$#`

Build docker images on internal docker registry:

build: `sudo docker build -t=registry.planck.ai/selenium-docker`

push: `sudo docker push registry.planck.ai/selenium-docker`

`docker run -e HUB_HOST=192.168.0.103(local IP) -e MODULE=search-module.xml registry.planck.ai/selenium-docker`

Docker-compose file for building of scripts:

```dockerfile
FROM openjdk:8u191-jre-alpine3.8

RUN apk add curl jq

# WorkspaceWORKDIR /usr/share/qubitai

# ADD .jar under target from host# into this imageADD target/selenium-docker.jar    selenium-docker.jarADD target/selenium-docker-tests.jar  selenium-docker-tests.jarADD target/libs       libs

# in case of any other dependency like .csv / .json / .xls# please ADD that as well

# ADD suite filesADD book-flight-module.xml    book-flight-module.xmlADD search-module.xml     search-module.xml

#ENTRYPOINT java -cp selenium-docker.jar;selenium-docker-tests.jar;libs/* -DBROWSER=$BROWSER -DHUB_HOST =$HUB_HOST org.testng.TestNG $MODULE

ENTRYPOINT java -cp selenium-docker.jar:selenium-docker-tests.jar:libs/* \   -DHUB_HOST=$HUB_HOST \   -DBROWSER=$BROWSER \   org.testng.TestNG $MODULE
```

![alt text](https://github.com/adityaver2701/selenium-docker/blob/master/images/Docker.PNG?raw=true)

## Jenkins Configuration:

Jenkins url: [http://jenkins-dev.planck.ai](http://jenkins-dev.planck.ai)

Username: *&^%

Password: %$%^$$

We have to add three credentials inside jenkins:

![alt text](https://github.com/adityaver2701/selenium-docker/blob/master/images/jenkins-credentials.png?raw=true)

Plugins to install:

EC2 Fleet

![alt text](https://github.com/adityaver2701/selenium-docker/blob/master/images/EC2-fleet.PNG?raw=true)

### Jenkins cloud configuration:

![alt text](https://github.com/adityaver2701/selenium-docker/blob/master/images/jenkins-cloud.PNG?raw=true)

![alt text](https://github.com/adityaver2701/selenium-docker/blob/master/images/jenkins-cloud2.PNG?raw=true)

![alt text](https://github.com/adityaver2701/selenium-docker/blob/master/images/jenkins-cloud3.PNG?raw=true)

### Jenkins Pipeline Configuration:

![alt text](https://github.com/adityaver2701/selenium-docker/blob/master/images/Pipeline-configuration.PNG?raw=true)

![alt text](https://github.com/adityaver2701/selenium-docker/blob/master/images/AWS Selenium architecture.PNG?raw=true)

![alt text](https://github.com/adityaver2701/selenium-docker/blob/master/images/Internal cloud framework.PNG?raw=true)

## AWS Configuration:

![alt text](https://github.com/adityaver2701/selenium-docker/blob/master/images/jenkins-user.PNG?raw=true)
