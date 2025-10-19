package q.jv.billingservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import q.jv.billingservice.entities.ProductItem;

public interface ProductItemRepository extends JpaRepository<ProductItem,Long> {
}
