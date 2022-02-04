package bstorm.akimts.demo_spring.data;

import bstorm.akimts.demo_spring.models.entity.Marque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarqueRepository extends JpaRepository<Marque, Long> {
}
