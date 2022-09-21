package tech.getarrays.fooddelievery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.getarrays.fooddelievery.exception.UserNOtFoundException;
import tech.getarrays.fooddelievery.model.food;
import tech.getarrays.fooddelievery.repo.foodRepo;

import java.util.List;
import java.util.UUID;

@Service
public class foodService {

    @Autowired
    private final foodRepo foodRepo;
    public foodService(foodRepo foodRepo) {
        this.foodRepo = foodRepo;
    }

    public food addEmployee(food food)
    {
    food.setEmployeeCode(UUID.randomUUID().toString());
    return foodRepo.save(food);
    }


    public List<food> findAllEmployees()
    {
        return foodRepo.findAll();

    }
  public food updateEmployee(food food)
  {
      return foodRepo.save(food);
  }

  public food findEmployeeById(Long id)
  {
      return foodRepo.findEmployeeById(id).orElseThrow(()->new UserNOtFoundException("Use by id"+id +"was not found "));
  }
  public void deleteEmployee(Long id)

  {
       foodRepo.deleteEmployeeById(id);
  }


}
