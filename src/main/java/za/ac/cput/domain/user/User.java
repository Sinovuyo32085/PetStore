package za.ac.cput.domain.user;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    private int userID;
    private String firstName;
    private String lastName;
    private String password;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "card_id")
    private Card card;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "shippingAddress_id")
    private ShippingAddress address;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contact_id")
    private Contact contact;
    private Role role;

    protected User(){}

    private User(Builder builder){
        userID = builder.userID;
        firstName = builder.firstName;
        lastName = builder.lastName;
        password = builder.password;
        card = builder.card;
        address = builder.address;
        contact = builder.contact;
        role = builder.role;
    }
    public int getUserID() {
        return userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public Contact getContact() {
        return contact;
    }

    public Card getCard(){
        return card;
    }

    public ShippingAddress getAddress(){
        return address;
    }

    public Role getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", card=" + card +
                ", address=" + address +
                ", contact=" + contact +
                ", role=" + role +
                '}';
    }

    public static class Builder {
        private int userID;
        private String firstName;
        private String lastName;
        private String password;
        private Card card;
        private ShippingAddress address;
        private Contact contact;
        private Role role;

        public Builder setUserID(int userID) {
            this.userID = userID;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setCard(Card card){
            this.card = card;
            return this;
        }

        public Builder setAddress(ShippingAddress address){
            this.address = address;
            return this;
        }

        public Builder setContact(Contact contact) {
            this.contact = contact;
            return this;
        }

        public Builder setRole(Role role) {
            this.role = role;
            return this;
        }

        public Builder copy(User user){
            this.userID = user.userID;
            this.firstName = user.firstName;
            this.lastName = user.lastName;
            this.password = user.password;
            this.card = user.card;
            this.address = user.address;
            this.contact = user.contact;
            this.role = user.role;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}
