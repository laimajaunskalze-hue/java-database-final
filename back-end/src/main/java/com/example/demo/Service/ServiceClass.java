package com.example.demo.Service;
import org.springframework.stereotype.Service;
@Service
public class ServiceClass {
    public boolean validateInventory(Long productId, Long storeId) { return true; }
    public Long getInventoryId(Long productId, Long storeId) { return 1L; }
}
