package github.wescaetano.first_spring_boot_project.repositories;

import github.wescaetano.first_spring_boot_project.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
