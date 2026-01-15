package com.example.demo.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
@RestController @RequestMapping("/reviews")
public class ReviewController {
    @GetMapping("/{storeId}/{productId}")
    public ResponseEntity<?> getReviews(@PathVariable Long storeId, @PathVariable Long productId) {
        return ResponseEntity.ok("Structured review data with customer names");
    }
}
