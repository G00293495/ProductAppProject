package ie.atu.project;

import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/products")
public class ProductController {

    // Autowire ProductService here if needed

    @GetMapping("/{productId}")
    public String getProduct(@PathVariable Long productId) {
        return "Product details for ID " + productId;
    }

    @PostMapping
    public String createProduct(@RequestBody String productInfo) {
        //create a new product
        return "Product created: " + productInfo;
    }

    @PutMapping("/{productId}")
    public String updateProduct(@PathVariable Long productId, @RequestBody String updatedProductInfo) {
        //update an existing product
        return "Product updated for ID " + productId + ": " + updatedProductInfo;
    }

    @DeleteMapping("/{productId}")
    public String deleteProduct(@PathVariable Long productId) {
        // delete product
        return "Product deleted for ID " + productId;
    }

}
