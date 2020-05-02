package login.group.entity;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * Created by User on 12.04.2020.
 */
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String productBrand;
    private String productModel;
    private String category;
    private String subCategory;
    private String productImg;
    private int price;
    private boolean available;
    @Column(columnDefinition = "text")
    private String description;
    private Date dateOfSave = new Date();
    private int toLike;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private User user;


    public Product() {
    }

    public Product(String productTitle, String category, int price, boolean available, int rate, int size, String description, Date dateOfsave
//            ,User user
    ) {
        this.category = category;
        this.price = price;
        this.available = available;
        this.description = description;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public String getProductImg() {
        return productImg;
    }

    public void setProductImg(MultipartFile multipartFile) {
        String path = System.getProperty("user.home") + File.separator + "Pictures\\";
        try {
            multipartFile.transferTo(new File(path + multipartFile.getOriginalFilename()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.productImg = "\\workImg\\" + multipartFile.getOriginalFilename();
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public String getProductModel() {
        return productModel;
    }

    public void setProductModel(String productModel) {
        this.productModel = productModel;
    }

    public Date getDateOfSave() {
        return dateOfSave;
    }

    public void setDateOfSave(Date dateOfSave) {
        this.dateOfSave = dateOfSave;
    }

    public int getToLike() {
        return toLike;
    }

    public void setToLike(int toLike) {
        this.toLike = toLike;
    }


}
