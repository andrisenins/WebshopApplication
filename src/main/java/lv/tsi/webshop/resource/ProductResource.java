package lv.tsi.webshop.resource;

import lv.tsi.webshop.model.Product;
import lv.tsi.webshop.model.ProductCategory;
import lv.tsi.webshop.model.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RequestMapping("/product")
@RestController
public class ProductResource {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(value = {"/all", "/all/{productCategory}"})
    public @ResponseBody List<Product> getAllProducts(@PathVariable Optional<ProductCategory> productCategory) {
        if(productCategory.isPresent()){
            return productRepository.findByProductCategory(productCategory.get());
        }
        return productRepository.findAll();
    }

    @RequestMapping("/{productId}")
    public @ResponseBody
    Optional<Product> getProduct(@PathVariable long productId) {
        return productRepository.findById(productId);
    }

}
