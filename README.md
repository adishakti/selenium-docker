![](/api/v3/attachments/108/content)

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

![](/api/v3/attachments/109/content)

Open terminal inside Project and run following commands:

`mvn clean package -DskipTests`

`cd target`

`java -cp selenium-docker.jar;selenium-docker-tests.jar;libs/* -DBROWSER=firefox org.testng.TestNG ../book-flight-module.xml`

Login to planck.ai docker registry:

`sudo docker login registry.planck.ai`

username: `planckai`

password: `planck-ai@registry`

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

![](/api/v3/attachments/110/content)

## Jenkins Configuration:

Jenkins url: [http://jenkins-dev.planck.ai](http://jenkins-dev.planck.ai)

Username: admin

Password: admin

We have to add three credentials inside jenkins:

![](/api/v3/attachments/116/content)

Plugins to install:

EC2 Fleet

![](/api/v3/attachments/117/content)

### Jenkins cloud configuration:

![](/api/v3/attachments/118/content)

![](/api/v3/attachments/119/content)

![](/api/v3/attachments/120/content)

### Jenkins Pipeline Configuration:

![](/api/v3/attachments/121/content)

![](/api/v3/attachments/111/content)

![](/api/v3/attachments/112/content)

## AWS Configuration:

![](/api/v3/attachments/113/content)