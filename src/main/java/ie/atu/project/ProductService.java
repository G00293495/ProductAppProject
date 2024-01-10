package ie.atu.project;



import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/products")
public class ProductService {

    private final Map<Long, Product> products = new HashMap<>();

    @PostMapping("/add-product")
    public String addProduct(@RequestBody Product product) {
        products.put(product.getProductId(), product);
        return "Product added successfully!";
    }

    @GetMapping("/{productId}")
    public Product getProduct(@PathVariable Long productId) {
        return products.get(productId);
    }
}


