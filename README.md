# Set Up CRUD Endpoint with SpringBoot & MySQL

## Overview
This is a simple java springboot project with CRUD endpoint created. 

## Connection with MySQL
dir - demo/src/main/resource/application.propoerties

<strong>Update your MySQL url and credentials</strong>

spring.datasource.url= {}

spring.datasource.username = {}

spring.datasource.password = {}

## File Structure 
### Model
This consists of the class file for the database table - create all the get/set function over here as well as delcaring the constructor 

## Controller
The controller file will map all the endpoints - the current file consists of all the endpoint logic and it will trigger the {UserService.java} which consists of the CRUD functions

## Repository
This file will extend the JpsRespository framework where it will return the user information and status code




