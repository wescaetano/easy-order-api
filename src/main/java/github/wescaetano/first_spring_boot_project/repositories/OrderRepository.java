package github.wescaetano.first_spring_boot_project.repositories;

import github.wescaetano.first_spring_boot_project.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
