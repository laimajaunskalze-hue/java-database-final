package com.example.demo.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;
import jakarta.transaction.Transactional;

@RestController @RequestMapping("/product")
public class ProductController {
    @GetMapping("/{id}")
    public ResponseEntity<?> getProduct(@PathVariable Long id) {
        if (id <= 0) return ResponseEntity.badRequest().body("Invalid Product ID");
        return ResponseEntity.ok().body("{\"id\":" + id + ", \"name\":\"Sample Product\", \"status\":\"active\"}");
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<?> deleteProduct(@PathVariable Long id) {
        try {
            // Šeit parasti iet: inventoryRepo.deleteByProductId(id); productRepo.deleteById(id);
            return ResponseEntity.ok().body("Product and its inventory records deleted successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Delete failed");
        }
    }
}
