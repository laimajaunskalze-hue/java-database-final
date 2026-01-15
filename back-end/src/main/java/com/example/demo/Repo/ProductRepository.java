package com.example.demo.Repo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface ProductRepository extends CrudRepository<Object, Long> {
    List<Object> findByCategory(String category);

    @Query("SELECT p FROM Product p WHERE p.storeId = :sId AND p.category = :cat")
    List<Object> findByStoreAndCategory(@Param("sId") Long storeId, @Param("cat") String category);
}
