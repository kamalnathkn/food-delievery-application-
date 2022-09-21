package tech.getarrays.fooddelievery.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.fooddelievery.model.food;

import java.util.Optional;

public interface foodRepo extends JpaRepository<food,   Long>{



    void deleteEmployeeById(Long id);

    Optional<food> findEmployeeById(Long id);
}
