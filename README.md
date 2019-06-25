# cors-escape
Sample Spring Boot Java Project which will resolve CORS issues when calling external API outside of Nginx server.

A more common solution is used today "https://cors-anywhere.herokuapp.com/" which stops working after few no of request.

As for Server CORS, you can easily solve either by adding Filter or Interceptor on the backened code.But How will you handle this when remote server like LinkedIn api which are external to your code.

Scenario:- But if you are calling the external services like Google cloud content server, Linkedin api which are used in Front
and as a backened developer you don't have control over them.

This project will handle them easily. 

Working Approach: Create a Controller which match the prefix that will be appended by calling apis and then call will come to your backened server and from there you will call those external api and after getting the response add the Headers what browser is expecting and your issue will be gone !!:) 

Before Adding Url Prefix:-

![crop_error](https://user-images.githubusercontent.com/26761847/60092351-6f385f80-9764-11e9-83a3-23394edb9950.png)



After Adding the prefix : http://192.168.1.231:9000/cors-escape/ before to google content server https://www.googleapis.com/upload/storage/v1/b/++++++++++++++++++++++  then CORS error resolved.

After Adding :- 

![error_resolved](https://user-images.githubusercontent.com/26761847/60092352-6fd0f600-9764-11e9-9fef-10ab23f1cc23.png)


You can add your custom url prefix. 

Cheers !!

