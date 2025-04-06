package github.wescaetano.first_spring_boot_project.repositories;

import github.wescaetano.first_spring_boot_project.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
