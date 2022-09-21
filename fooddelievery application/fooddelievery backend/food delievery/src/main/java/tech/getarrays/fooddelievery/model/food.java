package tech.getarrays.fooddelievery.model;
import javax.persistence.*;
import java.io.Serializable;


@Entity
public class food implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String Resname;
    private String phone;
    private String imageUrl;
    @Column(nullable = false, updatable = false)
    private String foodname;
   private String price ;
    private String rating ;



    public food() {}

    public food(String name, String email, String Resname, String phone, String imageUrl, String  foodname , String  price , String rating ) {
        this.name = name;
        this.email = email;
        this.Resname = Resname;
        this.phone = phone;
        this.imageUrl = imageUrl;
        this.foodname = foodname;
        this. price=price;
        this.rating =rating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getResname() {
        return Resname;
    }

    public void setResname(String resname) {
        Resname = resname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setEmployeeCode(String employeeCode) {
        this.foodname = foodname;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", jobTitle='" + Resname + '\'' +
                ", phone='" + phone + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}