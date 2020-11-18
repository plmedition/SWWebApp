# SWWebApp

SwWebApp is an integration of the swapi (https://swapi.dev/) which is exposing two services that will retrieve information about swapi.People and swapi.Starship sorted by its name and creation date.

This API must receive these two mandatory params : 

"paramName" : ["name" | "created"]    &   "order" : ["asc" | "desc"]

##Prerequisites

To build this application you must have installed Apache Maven 3.6.3 [https://maven.apache.org/download.cgi]

## Installation

Just start @SpringBootApplication [SWWebApplication] and the following services will be exposed for you.


## REST Api Usage

1.- People service.
URL : http://localhost:6969/people
http method : GET
Params :  [paramName]('name' , 'created)| [order]('asc' , 'desc)
Example : curl -X GET "http://localhost:6969/people?paramName=created&order=asc"

2.- Starships service
URL : http://localhost:6969/starships
http method : GET
Params :  [paramName]('name' , 'created)| [order]('asc' , 'desc)
Example : curl -X GET "http://localhost:6969/starships?paramName=created&order=asc"

## UI

There is a small UI provided(no fancy stuff) that can help you to visualize the responses of these APIS in a clear way.

This is accesible through : http://localhost:6969/index.html

## Contributing
Contributions are not still opened.


