package com.example.demo.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
@RestController @RequestMapping("/store")
public class StoreController {
    @GetMapping("/validate/{id}")
    public ResponseEntity<?> validateStore(@PathVariable Long id) {
        return ResponseEntity.ok("Store exists");
    }
    @PostMapping("/order")
    public ResponseEntity<?> placeOrder() {
        try { return ResponseEntity.ok("Order placed"); }
        catch (Exception e) { return ResponseEntity.badRequest().body(e.getMessage()); }
    }
}
