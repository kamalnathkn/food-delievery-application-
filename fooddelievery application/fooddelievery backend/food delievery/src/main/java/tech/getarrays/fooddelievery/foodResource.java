package tech.getarrays.fooddelievery;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.getarrays.fooddelievery.model.food;
import tech.getarrays.fooddelievery.service.foodService;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class foodResource {

    private final foodService foodService;

    public foodResource(foodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<food>> getAllEmployees () {
        List<food> foods = foodService.findAllEmployees();
        return new ResponseEntity<>(foods, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<food> getEmployeeById (@PathVariable("id") Long id) {
        food food = foodService.findEmployeeById(id);
        return new ResponseEntity<>(food, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<food> addEmployee(@RequestBody food food) {
        food newFood = foodService.addEmployee(food);
        return new ResponseEntity<>(newFood, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<food> updateEmployee(@RequestBody food food) {
        food updateFood = foodService.updateEmployee(food);
        return new ResponseEntity<>(updateFood, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("id") Long id) {
        foodService.deleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}