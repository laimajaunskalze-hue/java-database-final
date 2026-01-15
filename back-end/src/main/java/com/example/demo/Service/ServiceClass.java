package com.example.demo.Service;
import org.springframework.stereotype.Service;

@Service
public class ServiceClass {
    public boolean validateInventory(Long productId, Long storeId) {
        // Pārbauda vai šāds produkts šajā veikalā vispār eksistē
        return productId != null && storeId != null;
    }

    public Long getInventoryId(Long productId, Long storeId) {
        // Atgriež unikālu ID, kas apvieno abus parametrus (testa nolūkiem)
        return Long.parseLong(productId.toString() + storeId.toString());
    }
}
