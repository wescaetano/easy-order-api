package github.wescaetano.first_spring_boot_project.repositories;

import github.wescaetano.first_spring_boot_project.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
