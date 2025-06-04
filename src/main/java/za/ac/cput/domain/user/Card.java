package za.ac.cput.domain.user;

import java.time.LocalDate;

public class Card {
   private int cardID;
    private String cardHolder;
    private String cardNumber;
    private LocalDate expiryDate;

    private Card () {}

    private Card (Builder builder) {
        this.cardID = builder.cardID;
        this.cardHolder = builder.cardHolder;
        this.cardNumber = builder.cardNumber;
        this.expiryDate = builder.expiryDate;
    }

    public int getCardID() {
        return cardID;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardID=" + cardID +
                ", cardHolder='" + cardHolder + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", expiryDate=" + expiryDate +
                '}';
    }
    public static class Builder {

        private int cardID;
        private String cardHolder;
        private String cardNumber;
        private LocalDate expiryDate;

        public Builder cardID(Integer cardID) {
            this.cardID = cardID;
            return this;
        }
        public Builder cardHolder(String cardHolder) {
            this.cardHolder = cardHolder;
            return this;
        }
        public Builder cardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }
        public Builder expiryDate(LocalDate expiryDate) {
            this.expiryDate = expiryDate;
            return this;
        }

    }
}