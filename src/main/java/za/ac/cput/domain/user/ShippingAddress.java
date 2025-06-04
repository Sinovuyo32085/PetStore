package za.ac.cput.domain.user;

public class ShippingAddress {
      private int shippingAddressID;
    private String street;
    private String flatDetail;
    private String suburb;
    private String city;
    private String postalCode;

    private ShippingAddress() {}

    private ShippingAddress(Builder builder) {
        this.shippingAddressID = builder.shippingAddressID;
        this.street = builder.street;
        this.flatDetail = builder.flatDetail;
        this.suburb = builder.suburb;
        this.city = builder.city;
        this.postalCode = builder.postalCode;

    }

    public Integer getShippingAddressID() {
        return shippingAddressID;
    }

    public String getStreet() {
        return street;
    }

    public String getFlatDetail() {
        return flatDetail;
    }

    public String getSuburb() {
        return suburb;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }


    @Override
    public String toString() {
        return "ShippingAddress{" +
                "shippingAddressID=" + shippingAddressID +
                ", street='" + street + '\'' +
                ", flatDetail='" + flatDetail + '\'' +
                ", suburb='" + suburb + '\'' +
                ", city='" + city + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }


    public static class Builder {

        private Integer shippingAddressID;
        private String street;
        private String flatDetail;
        private String suburb;
        private String city;
        private String postalCode;

        public Builder shippingAddressID(Integer shippingAddressID) {
            this.shippingAddressID = shippingAddressID;
            return this;
        }

        public Builder street(String street) {
            this.street = street;
            return this;
        }

        public Builder flatDetail(String flatDetail) {
            this.flatDetail = flatDetail;
            return this;
        }

        public Builder suburb(String suburb) {
            this.suburb = suburb;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Builder postalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public ShippingAddress build() {
            return new ShippingAddress(this);
        }
    }
}