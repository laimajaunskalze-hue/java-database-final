package com.example.demo.Repo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;
public interface InventoryRepository extends CrudRepository<Object, Long> {
    @Query("SELECT i FROM Inventory i WHERE i.product.id = ?1 AND i.store.id = ?2")
    Object findByProductAndStore(Long productId, Long storeId);
    List<Object> findByStoreId(Long storeId);
}
