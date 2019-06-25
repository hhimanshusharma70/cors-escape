# cors-esacpe
Sample Spring Boot Java Project which will resolve CORS issues when calling external API outside of Nginx server.

A more common solution is used today "https://cors-anywhere.herokuapp.com/" which stops working after few no of request.

As for Server CORS, you can easily solve either by adding Filter or Interceptor on the backened code.But How will you handle this when remote server like LinkedIn api which are external to your code.

Scenario:- But if you are calling the external services like Google cloud content server, Linkedin api which are used in Front
and as a backened developer you don't have control over them.

This project will handle them easily. 

Working Approach: Create a Controller which match the prefix that will be appended by calling apis and then call will come to your backened server and from there you will call those external api and after getting the response add the Headers what browser is expecting and your issue will be gone !!:) 

Before Adding Url Prefix:-

![alt text]https://firebasestorage.googleapis.com/v0/b/github-c7ce1.appspot.com/o/crop_error.png?alt=media&token=3f524026-279c-4432-9e7d-4f2186be2dfa

After Adding the prefix : http://192.168.1.231:9000/cors-escape/ before to google content server https://www.googleapis.com/upload/storage/v1/b/++++++++++++++++++++++  then CORS error resolved.

After Adding :- 

![alt text]https://firebasestorage.googleapis.com/v0/b/github-c7ce1.appspot.com/o/error_resolved.png?alt=media&token=adc3dcf7-0bb9-4866-a3bf-a8d6e7d74d3d

You can add your custom url prefix. 

