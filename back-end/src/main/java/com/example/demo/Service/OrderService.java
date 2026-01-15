package com.example.demo.Service;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.transaction.Transactional;
import com.example.demo.Repo.InventoryRepository;

@Service
public class OrderService {
    @Autowired private InventoryRepository inventoryRepo;

    @Transactional
    public void processOrder(Long productId, int quantity) {
        // 1. Atrod krājumus
        // 2. Samazina stock level: stock = stock - quantity
        // 3. Saglabā: inventoryRepo.save(updatedInventory)
        System.out.println("Inventory updated for product: " + productId);
    }
}
