RestClient4J is a simple implementation of Ruby's excellent Rest_Client library.

Usage is fairly simple.  You can call static methods to perform RESTful http calls like so:

     RestClient4J.get(url, params);

Where url is a String object that represents the url you are calling and params is a Map<String, String>. Params will hold any http header info you need to pass to the receiving web server.

An example param could be passing the content type, where you would add the following
     params.put("content-type", "application/json");
if you were passing json encoded content.

The above example is making a GET call.  Making a POST call would be like the following:
     RestClient4J.post(url, content, params)
where content is a String to be passed as a payload. PUT works the same way as POST and DELETE is a call that simply accepts a URL.

If you wish to make calls without utilizing the static api's, you can instantiate a RestClient instance and make calls in the following manner:
    RestClient client = new RestClient(url);
    client.get(params);
where url is a String or URL object and params are, once again, headers passed as part of the request.

A post call would look like the following:
    RestClient client = new RestClient(url);
    client.post(content, params);
where content is an InputStream object. This allows you to send binary content, name-value pairs, etc.