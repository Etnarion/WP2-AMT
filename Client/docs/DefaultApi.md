# DefaultApi

All URIs are relative to *localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addApplication**](DefaultApi.md#addApplication) | **POST** /applications | Creates a new application.
[**addBadge**](DefaultApi.md#addBadge) | **POST** /badges | Creates a new badge.
[**addEvent**](DefaultApi.md#addEvent) | **POST** /events | Creates a new event.
[**addPointScale**](DefaultApi.md#addPointScale) | **POST** /pointScales | Creates a new point scale.
[**addRule**](DefaultApi.md#addRule) | **POST** /rules | Creates a new rule.
[**addUser**](DefaultApi.md#addUser) | **POST** /users | Creates a new user.
[**deleteRule**](DefaultApi.md#deleteRule) | **DELETE** /rules/{ruleId} | delete a rule by ID
[**findBadge**](DefaultApi.md#findBadge) | **GET** /badges/{badgeId} | Returns a badge by ID.
[**findEvent**](DefaultApi.md#findEvent) | **GET** /events/{eventId} | Returns an event by ID.
[**findPointScale**](DefaultApi.md#findPointScale) | **GET** /pointScales/{pointScaleId} | Returns a point scale by ID.
[**findRule**](DefaultApi.md#findRule) | **GET** /rules/{ruleId} | Returns a rule by ID.
[**getBadges**](DefaultApi.md#getBadges) | **GET** /badges | Returns an array of all badges
[**getEvents**](DefaultApi.md#getEvents) | **GET** /events | Returns an array of all events
[**getPointScales**](DefaultApi.md#getPointScales) | **GET** /pointScales | Returns an array of all point scales
[**getRules**](DefaultApi.md#getRules) | **GET** /rules | Returns an array of all rules
[**getUserEvents**](DefaultApi.md#getUserEvents) | **GET** /events/user/{userId} | Returns all events of a user.
[**updateBadge**](DefaultApi.md#updateBadge) | **PUT** /badges | Update a badge
[**updatePointScale**](DefaultApi.md#updatePointScale) | **PUT** /pointScales | Update a point scale
[**updateRule**](DefaultApi.md#updateRule) | **PUT** /rules | Update a rule

<a name="addApplication"></a>
# **addApplication**
> Application addApplication(body)

Creates a new application.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Application body = new Application(); // Application | 
try {
    Application result = apiInstance.addApplication(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#addApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Application**](Application.md)|  |

### Return type

[**Application**](Application.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addBadge"></a>
# **addBadge**
> addBadge(body)

Creates a new badge.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Badge body = new Badge(); // Badge | 
try {
    apiInstance.addBadge(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#addBadge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Badge**](Badge.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="addEvent"></a>
# **addEvent**
> addEvent(body)

Creates a new event.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Event body = new Event(); // Event | 
try {
    apiInstance.addEvent(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#addEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Event**](Event.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="addPointScale"></a>
# **addPointScale**
> addPointScale(body)

Creates a new point scale.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
PointScale body = new PointScale(); // PointScale | 
try {
    apiInstance.addPointScale(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#addPointScale");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PointScale**](PointScale.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="addRule"></a>
# **addRule**
> addRule(body)

Creates a new rule.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Rule body = new Rule(); // Rule | 
try {
    apiInstance.addRule(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#addRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Rule**](Rule.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="addUser"></a>
# **addUser**
> User addUser(body)

Creates a new user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
User body = new User(); // User | 
try {
    User result = apiInstance.addUser(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#addUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**User**](User.md)|  |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteRule"></a>
# **deleteRule**
> deleteRule(ruleId)

delete a rule by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer ruleId = 56; // Integer | ID of rule to delete
try {
    apiInstance.deleteRule(ruleId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleId** | **Integer**| ID of rule to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findBadge"></a>
# **findBadge**
> Badge findBadge(badgeId)

Returns a badge by ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer badgeId = 56; // Integer | 
try {
    Badge result = apiInstance.findBadge(badgeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#findBadge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **badgeId** | **Integer**|  |

### Return type

[**Badge**](Badge.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findEvent"></a>
# **findEvent**
> Event findEvent(eventId)

Returns an event by ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer eventId = 56; // Integer | 
try {
    Event result = apiInstance.findEvent(eventId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#findEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **Integer**|  |

### Return type

[**Event**](Event.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findPointScale"></a>
# **findPointScale**
> PointScale findPointScale(pointScaleId)

Returns a point scale by ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer pointScaleId = 56; // Integer | 
try {
    PointScale result = apiInstance.findPointScale(pointScaleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#findPointScale");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pointScaleId** | **Integer**|  |

### Return type

[**PointScale**](PointScale.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findRule"></a>
# **findRule**
> Rule findRule(ruleId)

Returns a rule by ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer ruleId = 56; // Integer | 
try {
    Rule result = apiInstance.findRule(ruleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#findRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleId** | **Integer**|  |

### Return type

[**Rule**](Rule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBadges"></a>
# **getBadges**
> List&lt;Badge&gt; getBadges()

Returns an array of all badges

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    List<Badge> result = apiInstance.getBadges();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getBadges");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Badge&gt;**](Badge.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEvents"></a>
# **getEvents**
> List&lt;Event&gt; getEvents()

Returns an array of all events

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    List<Event> result = apiInstance.getEvents();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getEvents");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Event&gt;**](Event.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPointScales"></a>
# **getPointScales**
> List&lt;PointScale&gt; getPointScales()

Returns an array of all point scales

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    List<PointScale> result = apiInstance.getPointScales();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getPointScales");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;PointScale&gt;**](PointScale.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRules"></a>
# **getRules**
> List&lt;Rule&gt; getRules()

Returns an array of all rules

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    List<Rule> result = apiInstance.getRules();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getRules");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Rule&gt;**](Rule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserEvents"></a>
# **getUserEvents**
> List&lt;Event&gt; getUserEvents(userId)

Returns all events of a user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer userId = 56; // Integer | 
try {
    List<Event> result = apiInstance.getUserEvents(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getUserEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**|  |

### Return type

[**List&lt;Event&gt;**](Event.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBadge"></a>
# **updateBadge**
> updateBadge(body)

Update a badge

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Badge body = new Badge(); // Badge | 
try {
    apiInstance.updateBadge(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateBadge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Badge**](Badge.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updatePointScale"></a>
# **updatePointScale**
> updatePointScale(body)

Update a point scale

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
PointScale body = new PointScale(); // PointScale | 
try {
    apiInstance.updatePointScale(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updatePointScale");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PointScale**](PointScale.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateRule"></a>
# **updateRule**
> updateRule(body)

Update a rule

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Rule body = new Rule(); // Rule | 
try {
    apiInstance.updateRule(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Rule**](Rule.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

