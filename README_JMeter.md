# AMT - WP2
## JMeter concurrency testing  
The tree of the test plan we used to test if our project contains any concurrency issues is presented below.  

![](./img/test-tree.png)  

The test plan contains two Thread Groups. The first one is a setUp Thread Group. It first sends a `POST` request to the `/applications` endpoint to retrieve the authorization token, then performs other `POST` requests which create a badge, a point scale and a rule.  
Once set up operations are done, the `Events` Thread Group is launched. This Thread Group sends a stream of events for a given user. Every time such a request is processed, the user's score for a given point scale is incremented. So if *N* is the number of threads sending the `POST` request to the `/events` endpoint and *M* is the score needed to win a reward badge, we expect the user to get *N/M* badges after the `Event` Thread Group is executed.  
Let's set the score needed to win a badge to 5 points for a given point scale ("target" field in a `rules-post` request)
and send a stream of 10 events (*N = 10*). We expect a user to get 2 badges. However, the results we get are not quite what was expected. Below is the state of the database after the execution of the test plan.  

*user-score table:*
![](./img/user-score.png)  

As we can see, three users were created instead of one and the total number of points won by all the users is 6.  
We added a `@Lock(LockModeType.PESSIMISTIC_WRITE)` annotation to the ` processEvent(Event event, List<Rule> rules, String token)` function of the `EventProcessor` service to obtain an exclusive lock while processing the event. But it didn't work as planned. Users were still created multiple times.
