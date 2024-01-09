package ie.atu.project;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "product-microservice", url = "http://localhost:8080")
public interface ProductFeignClient {

    @GetMapping("/products/{productId}")
    String getProductDetails(@PathVariable Long productId);

    @PostMapping("/products")
    String createProduct(@RequestBody String productInfo);

    @PostMapping("/products/{productId}")
    String updateProduct(@PathVariable Long productId, @RequestBody String updatedProductInfo);

    @DeleteMapping("/products/{productId}")
    String deleteProduct(@PathVariable Long productId);

    // Add other endpoints as needed
}
