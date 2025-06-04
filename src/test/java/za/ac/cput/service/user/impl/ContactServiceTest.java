package za.ac.cput.service.user.impl;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import za.ac.cput.domain.user.Contact;
import za.ac.cput.factory.user.ContactFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ContactServiceTest {

    private static Contact contact;

    @Autowired
    private TestRestTemplate restTemplate;

    private static final String BASE_URL = "http://localhost:8080/petstore/contact";

    @BeforeAll
    static void setUp() {
        contact = ContactFactory.createContact(1, "0987654321", "email@gmail.com");
    }

    @Test
    @Order(1)
    void create() {
        String url = BASE_URL + "/create";
        Contact createdContact = restTemplate.postForObject(url, contact, Contact.class);
        assertNotNull(createdContact);
        System.out.println(createdContact);
    }

    @Test
    @Order(2)
    void read() {
        String url = BASE_URL + "/read/" + contact.getId();
        ResponseEntity<Contact> readContact = restTemplate.getForEntity(url, Contact.class);
        assertNotNull(readContact);
        System.out.println(readContact);
    }

    @Test
    @Order(3)
    void update() {
        Contact updateContact = new Contact.Builder().copy(contact).setPhone("0123456789").build();
        String url = BASE_URL + "/update";
        ResponseEntity<Contact> updatedContact = restTemplate.postForEntity(url, contact, Contact.class);
        assertNotNull(updatedContact);
        System.out.println(updatedContact);
    }

    @Test
    @Order(5)
    void delete() {
        String url = BASE_URL + "/delete/" + contact.getId();
        restTemplate.delete(url);

        String readUrl = BASE_URL + "/read/" + contact.getId();
        ResponseEntity<Contact> reponse = restTemplate.getForEntity(readUrl, Contact.class);
        assertEquals(HttpStatus.NOT_FOUND, reponse.getStatusCode());
        System.out.println("true");
    }

    @Test
    @Order(4)
    void getAll() {
        String url = BASE_URL + "/getAll";
        List<Contact> contacts = restTemplate.getForObject(url, List.class);
        assertNotNull(contacts);
        System.out.println(contacts);
    }
}