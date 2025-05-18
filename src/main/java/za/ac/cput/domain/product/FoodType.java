package za.ac.cput.domain.product;
/*Oluhle Makhaye
* 222419636*/

public class FoodType {
    private  int foodTypeID;
    private  String foodTypeName;
    private PetType petType;

    private FoodType() {

    }

    private FoodType(Builder builder){
        this.foodTypeID = builder.foodTypeID;
        this.foodTypeName = builder.foodTypeName;
        this.petType = builder.petType;

    }

    public int getFoodTypeID() {
        return foodTypeID;
    }

    public String getFoodTypeName() {
        return foodTypeName;
    }

    public PetType getPetType() {return petType;}

    @Override
    public String toString() {
        return "FoodType{" +
                "foodTypeID=" + foodTypeID +
                ", foodTypeName='" + foodTypeName + '\'' +
                ", petType=" + petType +
                '}';
    }

    public static class Builder {
        private int foodTypeID;
        private String foodTypeName;
        private PetType petType;

        public Builder setFoodTypeID(int foodTypeID) {
            this.foodTypeID = foodTypeID;
            return this;
        }

        public Builder setFoodTypeName(String foodTypeName) {
            this.foodTypeName = foodTypeName;
            return this;
        }

        public Builder setPetType(PetType petType) {
            this.petType = petType;
            return this;
        }

        public FoodType copy(FoodType foodType){
            this.foodTypeID = foodType.foodTypeID;
            this.foodTypeName = foodType.foodTypeName;
            this.petType = foodType.petType;
            return this.build();
        }

        public FoodType build(){return new FoodType(this);}
    }
}
