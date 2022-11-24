# Using a Martial Art to do Tests

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

This repository contains all the files related with the conference.


## Requirements

To create your microservice you need to have in your machine the following things:
- [Java](https://www.oracle.com/ar/java/technologies/javase-jdk11-downloads.html)
- [Maven](https://maven.apache.org/)
- [Git](https://git-scm.com/)
- [Docker](https://www.docker.com/)

If you don't have some of these tools in your machine installed, please follow the instructions in the official documentation of each tool.

## Check requirements

If you have installed on your machine some of these tools previously or you installed all the tools now, please check if everything works fine.
- Check which version of Java you have using the following command:
   ````
   % java -version
   openjdk version "11.0.8" 2020-07-14
   OpenJDK Runtime Environment (build 11.0.8+10)
   OpenJDK 64-Bit Server VM (build 11.0.8+10, mixed mode, sharing)
   ````
- Check whether your Maven version is 3.0.0 or up. You can see which version of Maven you have using the following command:
   ````
   % mvn --version
   Apache Maven 3.0.0
   Maven home: /usr/share/maven
   ````
- Check whether the version of Docker in your machine is 18.09.0 or higher. You can check the version of Docker using the following command:

   ````
   % docker --version
   Docker version 18.09.0, build 369ce74a3c
   ````

## Documentation of APIs

The API has documentation to understand which parameters are required and the URL to invoke them. To see the documentation to understand which endpoints are available you can use the [Swagger](http://localhost:6070/api/flights/catalog/documentation)


## FAQ

**Which version of the JDK can I use on this project?**

There is no restriction about which version, in particular, you need to consider that exist different alternatives to the JDK:
* **OracleJDK**: This version was free until Java 11, after this version you can use it for development/test environments, but you need to pay a license to use it on production. This version of the JDK offers to you the most recent patches of bugs and new features because Oracle is the owner of the language.


* **OpenJDK**: When Oracle bought Sun Microsystems created this as an open-source alternative that all the developers can use in any environment without restrictions. The main problem with this version is the patches of the bugs take time to appear in a case that is not critical.


Take into consideration that there are other alternatives but according to [Snyk 2021 Report](https://res.cloudinary.com/snyk/image/upload/v1623860216/reports/jvm-ecosystem-report-2021.pdf), most of the developers use OpenJDK.


**Which tools can I use for development?**

Many free tools support Kotlin development. Here are two you may like:
- [IntelliJ IDEA Community Edition](https://www.jetbrains.com/idea/) – IntelliJ is the most widely used IDE for Kotlin development. IntelliJ IDEA Community Edition provides everything you need to start Kotlin and Spring.


- [Eclipse](https://www.eclipse.org/downloads/) – Eclipse is another IDE option for Kotlin development. Most plugins are free and have a vast community of developers who frequently update them. Take into consideration that to use Kotlin on this IDE, you need to install a plugin, you can follow the instructions on the [official webpage](https://kotlinlang.org/docs/eclipse.html) of Kotlin.

Take into consideration that there are other IDE but according to [Snyk 2021 Report](https://res.cloudinary.com/snyk/image/upload/v1623860216/reports/jvm-ecosystem-report-2021.pdf), most of the JVM developers use Eclipse and Intellij, but the use of Visual Studio code is growing in the last year.


## Further readings

Here are some links where you can have more information about Karate. 
- [Introduction to Karate](https://www.kloia.com/blog/step-1-introduction-to-karate-project-setup-hello-world) - Kloia
- [Karate Structure](https://github.com/karatelabs/karate#script-structure)

