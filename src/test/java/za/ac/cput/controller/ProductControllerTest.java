package za.ac.cput.controller;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import za.ac.cput.domain.Product;
import za.ac.cput.factory.ProductFactory;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ProductControllerTest {

    private static Product product;

    @Autowired
    private TestRestTemplate restTemplate;

    private static final String BASE_URL = "http://localhost:8080/petstore/product";

    @BeforeAll
    static void setUp() {

        List<String> categories = new ArrayList<>();

        product = ProductFactory.createProduct(1,"MissDog", "Nibbles","placeholder.jpg", 4f, 249.99, 199.99, true, 23, 1.34, "SaveMor", "Adult", "Dry", "Dog", "Chicken", categories);
    }

    @Test
    @Order(1)
    void create() {
        String url = BASE_URL + "/create";
        Product createdProduct = restTemplate.postForObject(url, product, Product.class);
        assertNotNull(createdProduct);
        System.out.println(createdProduct);
    }

    @Test
    @Order(2)
    void read() {
        String url = BASE_URL + "/read/" + product.getProductID();
        ResponseEntity<Product> readProduct = restTemplate.getForEntity(url, Product.class);
        assertNotNull(readProduct);
        System.out.println(readProduct);
    }

    @Test
    @Order(3)
    void update() {
        Product updateProduct = new Product.Builder().copy(product).setProductName("Dog Nibbles").build();
        String url = BASE_URL + "/update";
        ResponseEntity<Product> updated = restTemplate.postForEntity(url, updateProduct, Product.class);
        assertNotNull(updated);
        System.out.println(updated);
    }

    @Test
    @Order(5)
    void delete() {
        String url = BASE_URL + "/delete/" + product.getProductID();
        restTemplate.delete(url);

        String readUrl = BASE_URL + "/read/" + product.getProductID();
        ResponseEntity<Product> reponse = restTemplate.getForEntity(readUrl, Product.class);
        assertEquals(HttpStatus.NOT_FOUND, reponse.getStatusCode());
        System.out.println("true");
    }

    @Test
    @Order(4)
    void getAll() {
        String url = BASE_URL + "/getAll";
        List<Product> products = restTemplate.getForObject(url, List.class);
        assertNotNull(products);
        System.out.println(products);
    }
}
