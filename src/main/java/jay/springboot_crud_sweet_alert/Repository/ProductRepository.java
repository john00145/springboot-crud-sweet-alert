package jay.springboot_crud_sweet_alert.Repository;

import jay.springboot_crud_sweet_alert.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
