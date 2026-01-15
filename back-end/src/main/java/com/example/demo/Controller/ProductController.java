package com.example.demo.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import jakarta.transaction.Transactional;
@RestController @RequestMapping("/product")
public class ProductController {
    @GetMapping("/{id}")
    public ResponseEntity<?> getProduct(@PathVariable Long id) {
        return ResponseEntity.ok("Product data");
    }
    @DeleteMapping("/{id}") @Transactional
    public ResponseEntity<?> deleteProduct(@PathVariable Long id) {
        return ResponseEntity.ok("Product and inventory deleted");
    }
}
