package com.example.demo.Repo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;
public interface ProductRepository extends CrudRepository<Object, Long> {
    List<Object> findByCategory(String category);
    @Query("SELECT p FROM Product p WHERE p.store.id = ?1 AND p.category = ?2")
    List<Object> findByStoreAndCategory(Long storeId, String category);
}
