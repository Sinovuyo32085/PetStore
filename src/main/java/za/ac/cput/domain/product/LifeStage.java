package za.ac.cput.domain.product;

public class LifeStage {
private int lifeStageID;
private String lifeStageName;

    public LifeStage() {
    }

    public int getLifeStageID() {
        return lifeStageID;
    }

    public String getLifeStageName() {
        return lifeStageName;
    }

    public LifeStage(Builder builder) {
        this.lifeStageID = builder.lifeStageID;
        this.lifeStageName = builder.lifeStageName;

    }

    public static class Builder {
        private int lifeStageID;
        private String lifeStageName;

        public Builder setLifeStageID(int lifeStageID) {
            this.lifeStageID = lifeStageID;
            return this;
        }
        public Builder setLifeStageName(String lifeStageName) {
            this.lifeStageName = lifeStageName;
            return this;
        }

        public Builder copy(LifeStage lifeStage) {
            this.lifeStageID = lifeStage.getLifeStageID();
            this.lifeStageName = lifeStage.getLifeStageName();
            return this;
        }
       public LifeStage build() {
            return new LifeStage(this);
       }
    }
    @Override
    public String toString() {
        return "LifeStage{" +
                "lifeStageID=" + lifeStageID +
                ", lifeStageName='" + lifeStageName + '\'' +
                '}';
    }
}
