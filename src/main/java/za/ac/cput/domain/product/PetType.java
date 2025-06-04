package za.ac.cput.domain.product;
/*Oluhle Makhaye
* 222419636*/

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PetType {
 @Id
 private int petTypeID;
 private String petTypeName;

 protected PetType() {

 }

 private PetType(Builder builder){
  petTypeID = builder.petTypeID;
  petTypeName = builder.petTypeName;
 }

 public int getPetTypeID() {
  return petTypeID;
 }

 public String getPetTypeName() {
  return petTypeName;
 }

 @Override
 public String toString() {
  return "PetType{" +
          "petTypeID=" + petTypeID +
          ", petTypeName='" + petTypeName + '\'' +
          '}';
 }

 public static class Builder {
  private int petTypeID;
  private String petTypeName;

  public Builder setPetTypeID(int petTypeID) {
   this.petTypeID = petTypeID;
   return this;
  }

  public Builder setPetTypeName(String petTypeName) {
   this.petTypeName = petTypeName;
   return this;
  }

  public PetType copy(PetType petType){
   this.petTypeID = petType.petTypeID;
   this.petTypeName = petType.petTypeName;
   return this.build();
  }

  public PetType build(){return new PetType(this);}
 }
}
