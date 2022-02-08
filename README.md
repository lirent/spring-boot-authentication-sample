# Spring Boot Authentication

A simply login form with Spring Boot to secure your application. It uses the `inMemoryAuthentication()` and the Spring build in login form.
You can use also `jdbcAuthentication()` or `ldapAuthentication()` as form of authentication.

![index](https://user-images.githubusercontent.com/5686908/83764450-3eea8800-a67a-11ea-9720-a5d432b6f353.png)

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

What things you need to install the software and how to install it

```
Eclipse (or other code editor)
Java 8 JDK (1.8)
```

### Installing

A step by step series of examples that tell you how to get a development env running


```
Clone or pull this repository
```

Build with Maven

```
In Eclipse -> Update Maven
```


## Running the tests

Run the service under *Boot Dashboard*

```
Select and Start the SpringBootAuthentication app
```

## Demo

Open the browser and visit:

```
http://localhost:8080/
```

Login with `user` as username and `password` as password 🙃

![login](https://user-images.githubusercontent.com/5686908/83764451-3f831e80-a67a-11ea-98c7-2c88510d810e.png)

### Bad Login

![bad-login](https://user-images.githubusercontent.com/5686908/83764445-3e51f180-a67a-11ea-85bb-7d6a812d3dce.png)

### User Logout

![logout](https://user-images.githubusercontent.com/5686908/83764453-3f831e80-a67a-11ea-8758-11561b8f5304.png)


## Built With

* [SpringBoot](https://spring.io/) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [Bootstrap](https://getbootstrap.com/) - Bootstrap CDN


## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate. :tada:


## Authors

* [Lirent P.](https://github.com/lirent) - Initial work - 
 
See also the list of contributors who participated in this project.

## License

[Apache-2.0](https://github.com/lirent/SpringBootAuthentication/blob/master/LICENSE-Apache-2.0.txt)
