package lv.tsi.webshop.model.repository;

import lv.tsi.webshop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
