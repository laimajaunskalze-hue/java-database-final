package com.example.demo.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
@RestController @RequestMapping("/inventory")
public class InventoryController {
    @GetMapping("/filter/{category}/{name}/{storeId}")
    public ResponseEntity<?> filterInventory(@PathVariable String category, @PathVariable String name, @PathVariable Long storeId) {
        if(category == null) return ResponseEntity.badRequest().build();
        return ResponseEntity.ok("Filtered list");
    }
    @GetMapping("/validate/{quantity}/{storeId}/{productId}")
    public ResponseEntity<?> validateQuantity(@PathVariable int quantity, @PathVariable Long storeId, @PathVariable Long productId) {
        return ResponseEntity.ok("Quantity valid");
    }
}
