package lv.tsi.webshop.model.repository;

import lv.tsi.webshop.model.Product;
import lv.tsi.webshop.model.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByProductCategory(ProductCategory productCategory);
}
