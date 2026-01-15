package com.example.demo.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.*;

@RestController @RequestMapping("/reviews")
public class ReviewController {
    @GetMapping("/{storeId}/{productId}")
    public ResponseEntity<?> getReviews(@PathVariable Long storeId, @PathVariable Long productId) {
        List<Map<String, String>> reviews = new ArrayList<>();
        reviews.add(Map.of("customer", "Jānis B.", "comment", "Lieliska kvalitāte!"));
        reviews.add(Map.of("customer", "Anna K.", "comment", "Ātra piegāde."));
        return ResponseEntity.ok(reviews);
    }
}
