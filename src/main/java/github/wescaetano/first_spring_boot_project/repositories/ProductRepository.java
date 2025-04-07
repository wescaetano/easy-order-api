package github.wescaetano.first_spring_boot_project.repositories;

import github.wescaetano.first_spring_boot_project.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
