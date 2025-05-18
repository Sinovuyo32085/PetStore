package za.ac.cput.domain.product;

import java.sql.Blob;
import java.util.List;
/*Oluhle Makhaye
* 222419636
* product class*/
public class Product {
    private int productID;
    private String productName;
    private String description;
    private Blob image;
    private double rating;
    private double price;
    private int stock;
    private double weight;
    private Brand brand;
    private int lifeStageID;
    private int foodtypeID;
    private int petTypeID;
    private List<Flavour> flavours;
    private List<Category> categories;

    private Product () {
    }

    private Product(Builder builder) {
        productID = builder.productID;
        productName = builder.productName;
        description = builder.description;
        image = builder.image;
        rating = builder.rating;
        price = builder.price;
        stock = builder.stock;
        brand = builder.brand;
        weight = builder.weight;
        lifeStageID = builder.lifeStageID;
        foodtypeID = builder.foodtypeID;
        petTypeID = builder.petTypeID;
        flavours = builder.flavours;
        categories = builder.categories;
    }

    public int getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public String getDescription() {
        return description;
    }

    public Blob getImage() {return image;
    }

    public double getRating() {
        return rating;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public double getWeight() {
        return weight;
    }

    public Brand getBrand() {
        return brand;
    }

    public int getLifeStageID() {
        return lifeStageID;
    }

    public int getFoodtypeID() {
        return foodtypeID;
    }

    public int getPetTypeID() {
        return petTypeID;
    }

    public List<Flavour> getFlavours() {
        return flavours;
    }

    public List<Category> getCategories() {
        return categories;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", productName='" + productName + '\'' +
                ", description='" + description + '\'' +
                ", image=" + image +
                ", rating=" + rating +
                ", price=" + price +
                ", stock=" + stock +
                ", weight=" + weight +
                ", brand=" + brand +
                ", lifeStageID=" + lifeStageID +
                ", foodtypeID=" + foodtypeID +
                ", petTypeID=" + petTypeID +
                ", flavours=" + flavours +
                ", categories=" + categories +
                '}';
    }

    public static class Builder {
        private int productID;
        private String productName;
        private String description;
        private Blob image;
        private double rating;
        private double price;
        private int stock;
        private double weight;
        private Brand brand;
        private int lifeStageID;
        private int foodtypeID;
        private int petTypeID;
        private List<Flavour> flavours;
        private List<Category> categories;


        public Builder setProductID(int productID) {
            this.productID = productID;
            return this;
        }

        public Builder setProductName(String productName) {
            this.productName = productName;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setImage(Blob image) {
            this.image = image;
            return this;
        }

        public Builder setRating(double rating) {
            this.rating = rating;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setStock(int stock) {
            this.stock = stock;
            return this;
        }

        public Builder setWeight(double weight) {
            this.weight = weight;
            return this;
        }

        public Builder setBrand(Brand brand) {
            this.brand = brand;
            return this;
        }

        public Builder setLifeStageID(int lifeStageID) {
            this.lifeStageID = lifeStageID;
            return this;
        }

        public Builder setFoodtypeID(int foodtypeID) {
            this.foodtypeID = foodtypeID;
            return this;
        }

        public Builder setPetTypeID(int petTypeID) {
            this.petTypeID = petTypeID;
            return this;
        }

        public Builder setFlavours(List<Flavour> flavours) {
            this.flavours = flavours;
            return this;
        }

        public Builder setCategories(List<Category> categories) {
            this.categories = categories;
            return this;
        }

        public Product copy(Product product) {
            this.productID = product.productID;
            this.productName = product.productName;
            this.description = product.description;
            this.image = product.image;
            this.rating = product.rating;
            this.price = product.price;
            this.stock = product.stock;
            this.weight = product.weight;
            this.brand = product.brand;
            this.lifeStageID = product.lifeStageID;
            this.foodtypeID = product.foodtypeID;
            this.petTypeID = product.petTypeID;
            this.flavours = product.flavours;
            this.categories = product.categories;
            return this.build();
        }

        public Product build() {
            return new Product(this);
        }
    }
}
