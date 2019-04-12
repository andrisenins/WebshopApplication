package lv.tsi.webshop.resource;

import lv.tsi.webshop.model.Product;
import lv.tsi.webshop.model.ProductCategory;
import lv.tsi.webshop.model.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductResource {

    @Autowired
    ProductRepository productRepository;

    @RequestMapping(value = {"/all", "/all/{productCategory}"})
    public @ResponseBody List<Product> getAllProducts(@PathVariable Optional<ProductCategory> productCategory) {
        if(productCategory.isPresent()) {
            return productRepository.findByProductCategory(productCategory.get());
        }
        return productRepository.findAll();
    }


}
