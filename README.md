# Franco Sebastian Spring Demo For 23 People

This is a simple Spring Demo for a Job Interview

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

What things you need to install the software and how to install them

```
- Java JDK8 
- MySql Database
```
If you don't have installed MySQL in your machine you can use Docker 

**Run MySQL Server in Docker container by:**

```
docker run --name springdemo-mysql -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=demo -e MYSQL_USER=demo_user -e MYSQL_PASSWORD=demo_pass -p 3306:3306 -d mysql:5.6
```

**Docker MySql Container Logs:**

```
docker logs springdemo-mysql
```

### Docker Java container  Task



```
./gradlew build buildDocker
```

## Built With

* [Spring Framework](http://www.dropwizard.io/1.0.2/docs/) - The web framework used
* [Gradle](https://maven.apache.org/) - Dependency Management

## Authors

* **Franco Arraño** - *Initial work* - [Franco Arraño](https://github.com/francosebastian)

See also the list of [contributors](https://github.com/francosebastian/springdemo2018/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
