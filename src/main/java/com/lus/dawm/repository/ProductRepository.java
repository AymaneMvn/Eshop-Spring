package com.lus.dawm.repository;

import com.lus.dawm.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;



@Repository
public interface ProductRepository extends JpaRepository<Produit, Long> {
    @Query("SELECT p FROM Produit p")
    List<Produit> findAll();

}
