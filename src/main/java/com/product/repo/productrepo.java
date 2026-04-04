package com.product.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.product.model.Product;
import jakarta.transaction.Transactional;

@Repository
public interface productrepo extends JpaRepository<Product, Integer> {
	@Query("SELECT p FROM Product p WHERE LOWER(p.name) LIKE LOWER(CONCAT('%', :keyword, '%')) or LOWER(p.category) LIKE LOWER(CONCAT('%', :keyword, '%'))")
	List<Product> searchByName(@Param("keyword") String keyword);
	
	@Query("SELECT p FROM Product p WHERE p.price BETWEEN :min AND :max")
	List<Product> findByPriceRange(int min,
	                              @Param("max") int max);
	
    @Query("select p from Product p where p.price > :price and p.category=:cate")
	List<Product> findByCategoryAndPrice(@Param("cate") String category, @Param("price") int price);
    
    @Modifying
    @Transactional
    @Query("update Product p set p.price= :price where p.id=:id")
	int updatePrice(@Param("id") int id,@Param("price") int price);
    
    @Query("select p from Product p where p.price=(select max(p2.price) from Product p2)")
	Product getHighProduct();
    
    @Query("select p.category , count(p) from Product p group by p.category")
	List<Object[]> countByCategory();
}
