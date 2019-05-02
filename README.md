# Microservices Showcase with Spring Boot and Spring Cloud
Business &amp; Decision Showcase using Spring Boot and Spring Cloud. What we have done here is:

* Simplified Microservices Communication using Feign REST Client
* Centralized Microservice Configuration with Spring Cloud Config Server
* Client Side Load Balancing using Ribbon
* Dynamic scaling using Netflix Eureka and Ribbon
* API Gateway using Netflix Zuul
* Distributed Tracing using Spring Cloud Sleuth and Zipkin
* Fault Tolerance with Zipkin

The Overview looks like the following:
Architecture:
![The Architecture](file://assets/spring-cloud-route.PNG "The Architecture")
![alt text][arch]

[arch]: assets/spring-cloud-route.PNG "The Architecture"

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

Clone the following repositories onto your local machine:

* spring-cloud-config-server, The Spring Cloud configuration Server
* netflix-zuul-api-gateway-server, The API Gateway
* netflix-eureka-naming-server, The Naming Server
* currency-exchange-service, The Currency Exchange Microservice
* currency-conversion-service, The Currency Calculator Microservice

### Prerequisites

* Minimum of Java 8
* Spring-Boot 2.1.4-RELEASE
* Maven 3.6.0

## Ports

Application | Port(s)
--- | --- 
Spring Cloud Config Server | 8888
Currency Exchange Service | 8000, 8001, 8002, ...
Currency Conversion Service | 8100, 8101, 8102, ...
Netflix Eureka Naming Server | 8761
Netflix Zuul API Gateway Server | 8765
Zipkin Distributed Tracing Server | 9411

## Running the Services

Run the services in the following order:

1. Run the Naming Server first!
2. Then the Microservices, Currency Exchange Service and Currency Conversion Service
3. The Zuul API Gateway must be run at last.

## Testing the services

To test the services, you want to use your favorite browser.
You can only test the conversion to Swiss Francs. By example from USD, CAD, AUD, EUR or GBP.

### The Eureka Dashbord
The Eureka Dashboard is to be find at <http://localhost:8761/> if you deploy everything correctly.

The Dashboard allows to visualize how many instances are running, their statuses as well as general instances informations.

### The API Gateway
There are two versions of the API. One with Netflix-Feign and the other without.

* With Feign: <http://localhost:8765/currency-conversion-service/currency-converter-feign/from/USD/to/CHF/amount/10000>
* Without Feign: <http://localhost:8765/currency-conversion-service/currency-converter/from/USD/to/CHF/amount/10000>

With Feign, you should realize that the port that is serving the Conversion is changing (After browser refresh)

### Testing Service Failure
* Run many instances of Currency Exchange Service on ports 8000, 8001, 8002, etc...
* Run many instances of Currency Conversion Service on ports 8100, 8101, 8102, etc...

Then check on The Eureka Dashboard that all these Services are registered with the Naming Server.

Kill the currency exchange service running on port 8000. You will see that traffic is routed to the instances running on 8001 or 8002.

## Built With

* [Springframework](https://spring.io/) - The framework used
* [Maven](https://maven.apache.org/) - Dependency Management

## Author

* **Bernard Adanlessossi**

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Thomas Wenger, JUG-Bern, Switzerland
