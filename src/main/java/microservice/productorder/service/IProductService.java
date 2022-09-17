package microservice.productorder.service;

import microservice.productorder.model.Product;

import java.util.List;

public interface IProductService {
    Product saveProduct(Product product);

    void deleteProduct(Long productId);

    List<Product> findAllProduct();
}
