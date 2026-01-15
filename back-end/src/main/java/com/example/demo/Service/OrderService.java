package com.example.demo.Service;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
@Service
public class OrderService {
    @Transactional
    public void saveOrder() {
        // logic to save orderDetailsRepository.save() and update stock
    }
}
