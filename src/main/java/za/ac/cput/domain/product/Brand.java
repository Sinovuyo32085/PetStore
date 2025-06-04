package za.ac.cput.domain.product;
/*Oluhle Makhaye
* 222419636*/

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Brand {
    @Id
    private int brandID;
    private String brandName;

    protected Brand() {

    }

    private Brand(Builder builder){
        this.brandID = builder.brandID;
        this.brandName = builder.brandName;
    }

    public int getBrandID() {
        return brandID;
    }

    public String getBrandName() {
        return brandName;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "brandID=" + brandID +
                ", brandName='" + brandName + '\'' +
                '}';
    }

    public static class Builder {
        private int brandID;
        private String brandName;

        public Builder setBrandID(int brandID) {
            this.brandID = brandID;
            return this;
        }

        public Builder setBrandName(String brandName) {
            this.brandName = brandName;
            return this;
        }

        public Brand copy(Brand brand){
            this.brandID = brand.brandID;
            this.brandName = brand.brandName;
            return this.build();
        }

        public Brand build(){return new Brand(this);}
    }

}
