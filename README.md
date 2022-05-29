The point of this API is providing front-end apps easy and functional endpoints for basic CRUD operations.

Note that the API doesn't accept cross-origin requests, a solution for that is [implementing a proxy on the client-side](https://levelup.gitconnected.com/fixing-cors-errors-with-angular-cli-proxy-e5e0ef143f85).

> TODO implement CORS

### What you need:
* Docker

Simply run:

``docker run -d -p 8080:8080 olavodetona/my-repo:latest``

To access h2 database console: http://localhost:8080/h2-console/
To access the swagger endpoints: http://localhost:8080/swagger-ui.html
