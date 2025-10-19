package q.jv.billingservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import q.jv.billingservice.entities.Bill;

public interface BillRepository extends JpaRepository<Bill, Long> {
}
