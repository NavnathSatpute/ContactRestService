# ContactRestService

The Service API has been developed to serve the REST Calls.

Technology stack:
Spring Boot with H2 Database

# To have a stable database, add the following in application.properties file
spring.datasource.url=jdbc:h2:file:C:/db/contact

1) List all contacts: 

http://localhost:8080/contacts-api/list-contacts

2) search by id

http://localhost:8080/contacts-api/search/1

3) add a new contact

http://localhost:8080/contacts-api/save-contact

{       
        "firstName": "John",
        "lastName": "Kines",
        "email": "john.kines@em.co",
        "phoneNumber": "911234567891",
        "status": "ACTIVE"
}

4) udpdate a contact

http://localhost:8080/contacts-api/update-contact/4

{       
        "firstName": "John",
        "lastName": "Kines",
        "email": "john.kines@em.co",
        "phoneNumber": "911234567891",
        "status": "ACTIVE"
}

5) delete a contact 

http://localhost:8080/contacts-api/delete-contact/2


