package microservice.productorder.repository;

import microservice.productorder.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product,Long> {


}
