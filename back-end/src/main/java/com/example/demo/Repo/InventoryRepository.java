package com.example.demo.Repo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface InventoryRepository extends CrudRepository<Object, Long> {
    @Query("SELECT i FROM Inventory i WHERE i.productId = :pId AND i.storeId = :sId")
    Object findByProductAndStore(@Param("pId") Long productId, @Param("sId") Long storeId);

    @Query("SELECT i FROM Inventory i WHERE i.storeId = :sId")
    List<Object> findAllByStoreId(@Param("sId") Long storeId);
}
