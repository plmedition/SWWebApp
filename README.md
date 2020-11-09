# SWWebApp

SwWebApp is an integration of the swapi (https://swapi.dev/) which is exposing two services that will retrieve information about swapi.People and swapi.Starship sorted by its name and creation date.

## Installation

Just start @SpringBootApplication [SWWebApplication] and the following services will be exposed for you.


## REST Api Usage

1.- People service.
URL : http://localhost:8080/people
http method : GET
Params :  [paramName]('name' , 'created)| [order]('asc' , 'desc)
Example : curl -X GET "http://localhost:8080/people?paramName=created&order=asc"

2.- Starships service
URL : http://localhost:8080/starships
http method : GET
Params :  [paramName]('name' , 'created)| [order]('asc' , 'desc)
Example : curl -X GET "http://localhost:8080/starships?paramName=created&order=asc"

## UI

There is a small UI provided(no fancy stuff) that can help you to visualize the responses of these APIS in a clear way.

This is accesible through : http://localhost:8080/index.html

## Contributing
Contributions are not still opened.


