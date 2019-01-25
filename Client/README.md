# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        
        DefaultApi apiInstance = new DefaultApi();
        Application body = new Application(); // Application | 
        try {
            Application result = apiInstance.addApplication(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#addApplication");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *localhost:8080*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**addApplication**](docs/DefaultApi.md#addApplication) | **POST** /applications | Creates a new application.
*DefaultApi* | [**addBadge**](docs/DefaultApi.md#addBadge) | **POST** /badges | Creates a new badge.
*DefaultApi* | [**addEvent**](docs/DefaultApi.md#addEvent) | **POST** /events | Creates a new event.
*DefaultApi* | [**addPointScale**](docs/DefaultApi.md#addPointScale) | **POST** /pointScales | Creates a new point scale.
*DefaultApi* | [**addRule**](docs/DefaultApi.md#addRule) | **POST** /rules | Creates a new rule.
*DefaultApi* | [**addUser**](docs/DefaultApi.md#addUser) | **POST** /users | Creates a new user.
*DefaultApi* | [**deleteRule**](docs/DefaultApi.md#deleteRule) | **DELETE** /rules/{ruleId} | delete a rule by ID
*DefaultApi* | [**findBadge**](docs/DefaultApi.md#findBadge) | **GET** /badges/{badgeId} | Returns a badge by ID.
*DefaultApi* | [**findEvent**](docs/DefaultApi.md#findEvent) | **GET** /events/{eventId} | Returns an event by ID.
*DefaultApi* | [**findPointScale**](docs/DefaultApi.md#findPointScale) | **GET** /pointScales/{pointScaleId} | Returns a point scale by ID.
*DefaultApi* | [**findRule**](docs/DefaultApi.md#findRule) | **GET** /rules/{ruleId} | Returns a rule by ID.
*DefaultApi* | [**getBadges**](docs/DefaultApi.md#getBadges) | **GET** /badges | Returns an array of all badges
*DefaultApi* | [**getEvents**](docs/DefaultApi.md#getEvents) | **GET** /events | Returns an array of all events
*DefaultApi* | [**getPointScales**](docs/DefaultApi.md#getPointScales) | **GET** /pointScales | Returns an array of all point scales
*DefaultApi* | [**getRules**](docs/DefaultApi.md#getRules) | **GET** /rules | Returns an array of all rules
*DefaultApi* | [**getUserEvents**](docs/DefaultApi.md#getUserEvents) | **GET** /events/user/{userId} | Returns all events of a user.
*DefaultApi* | [**updateBadge**](docs/DefaultApi.md#updateBadge) | **PUT** /badges | Update a badge
*DefaultApi* | [**updatePointScale**](docs/DefaultApi.md#updatePointScale) | **PUT** /pointScales | Update a point scale
*DefaultApi* | [**updateRule**](docs/DefaultApi.md#updateRule) | **PUT** /rules | Update a rule

## Documentation for Models

 - [Application](docs/Application.md)
 - [Badge](docs/Badge.md)
 - [Error](docs/Error.md)
 - [Event](docs/Event.md)
 - [PointScale](docs/PointScale.md)
 - [Property](docs/Property.md)
 - [Rule](docs/Rule.md)
 - [User](docs/User.md)

## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


