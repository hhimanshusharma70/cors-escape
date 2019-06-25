# cors-esacpe
Sample Java Project which will resolve CORS issues when calling external API outside of Nginx.

As for Server CORS, you can easily solve either by adding Filter or Interceptor on the backened code.But How will you handle this when remote server like LinkedIn api which are external to your code.

Scenario:- But if you are calling the external services like Google cloud content server, Linkedin api which are used in Front
and as a backened developer you don't have control over them.

This project will handle them easily. 

Working Approach: Create a Controller which match the prefix that will be appended by calling apis and then call will come to your backened server and from there you will call those external api and after getting the response add the Headers what browser is expecting and your issue will be gone !!:) 
