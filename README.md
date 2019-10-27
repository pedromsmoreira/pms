# pms

Pet Management System

## Project Idea

Main idea reduce the number of abandoned pets in the world (Simple as this :) )

Create a system that allow someone to search for pets that need adoption.
This system should also provide an easy access to a Veterinarians and Pet Hospitals Network, making it simple to share data between them.
This system should also allow pets to be advertised for adoption and where they are and their conditions. Mainly make things simple enough to facilitate the adoption of abandoned pets.
Register former pets ouwner who abandoned a pet and place them in a blacklist. This will prevent pets from being placed/adopted by owners who won't really care about them.

## Repository structure

- backend-api -> will have the base api for the system to work
- frontend -> will have the frontend application that will call the backend api
- worker-services -> will have the background jobs that will manipulate, load and ingest data from both backend and frontend
- infrastructure-services -> will have application or script that will help manage infrastructure (TBD: not sure if it worth)

## Main Objectives

- All applications must be containerized, therefore the use of Docker is a must


## Simple Architecture that can evolve through time

Basic interactions of the system in a holistic view:

frontend -> backend-api

infrastructure-services -> backend-api
                        -> frontend
                        -> worker-services

worker-services -> backend-api

