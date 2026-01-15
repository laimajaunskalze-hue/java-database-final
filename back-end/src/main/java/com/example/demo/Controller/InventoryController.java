package com.example.demo.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController @RequestMapping("/inventory")
public class InventoryController {
    @GetMapping("/filter/{category}/{name}/{storeId}")
    public ResponseEntity<?> filterInventory(@PathVariable String category, @PathVariable String name, @PathVariable Long storeId) {
        if(category == null || name == null || storeId == null) {
            return ResponseEntity.badRequest().body("Visiem laukiem jābūt aizpildītiem!");
        }
        return ResponseEntity.ok("Atrasts inventārs kategorijā: " + category);
    }

    @GetMapping("/validate/{quantity}/{storeId}/{productId}")
    public ResponseEntity<?> validateQuantity(@PathVariable int quantity, @PathVariable Long storeId, @PathVariable Long productId) {
        if(quantity <= 0) return ResponseEntity.badRequest().body("Daudzumam jābūt virs 0");
        return ResponseEntity.ok("Daudzums ir pieejams noliktavā.");
    }
}
