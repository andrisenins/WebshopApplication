package lv.tsi.webshop.model.repository;

import lv.tsi.webshop.model.Product;
import lv.tsi.webshop.model.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByProductCategory(ProductCategory productCategory);
}
