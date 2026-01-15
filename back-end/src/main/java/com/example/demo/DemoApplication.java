package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}

@RestController
@CrossOrigin
@RequestMapping("/products")
class ProductController {
    @GetMapping
    public List<Map<String, Object>> getProducts() {
        return Arrays.asList(
            Map.of("id", 1, "title", "Laptop", "price", 999.99),
            Map.of("id", 2, "title", "Phone", "price", 499.99),
            Map.of("id", 3, "title", "Mouse", "price", 25.50)
        );
    }
}
