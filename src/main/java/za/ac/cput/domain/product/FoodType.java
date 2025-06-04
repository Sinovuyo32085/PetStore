package za.ac.cput.domain.product;
/*Oluhle Makhaye
* 222419636*/

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FoodType {
    @Id
    private  int foodTypeID;
    private  String foodTypeName;

    protected FoodType() {

    }

    private FoodType(Builder builder){
        this.foodTypeID = builder.foodTypeID;
        this.foodTypeName = builder.foodTypeName;

    }

    public int getFoodTypeID() {
        return foodTypeID;
    }

    public String getFoodTypeName() {
        return foodTypeName;
    }

    @Override
    public String toString() {
        return "FoodType{" +
                "foodTypeID=" + foodTypeID +
                ", foodTypeName='" + foodTypeName + '\'' +
                '}';
    }

    public static class Builder {
        private int foodTypeID;
        private String foodTypeName;

        public Builder setFoodTypeID(int foodTypeID) {
            this.foodTypeID = foodTypeID;
            return this;
        }

        public Builder setFoodTypeName(String foodTypeName) {
            this.foodTypeName = foodTypeName;
            return this;
        }

        public FoodType copy(FoodType foodType){
            this.foodTypeID = foodType.foodTypeID;
            this.foodTypeName = foodType.foodTypeName;
            return this.build();
        }

        public FoodType build(){return new FoodType(this);}
    }
}
