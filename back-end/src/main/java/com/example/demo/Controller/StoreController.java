package com.example.demo.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.Repo.ProductRepository;

@RestController @RequestMapping("/store")
public class StoreController {
    @Autowired private ProductRepository productRepo;

    @GetMapping("/validate/{id}")
    public ResponseEntity<?> validateStore(@PathVariable Long id) {
        if (id < 1) return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Store not found");
        return ResponseEntity.ok().body("Store is active and valid");
    }

    @PostMapping("/order")
    public ResponseEntity<?> placeOrder(@RequestBody Object orderData) {
        try {
            if (orderData == null) throw new Exception("Order data is missing");
            return ResponseEntity.status(HttpStatus.CREATED).body("Order processed successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error: " + e.getMessage());
        }
    }
}
