package pattern.creational.builder;

public class House {
    private int livingRoom;
    private int bathroom;
    private int bedroom;
    private int kitchen;

    private House(HouseBuilder builder) {
        this.livingRoom = builder.livingRoom;
        this.bathroom = builder.bathroom;
        this.bedroom = builder.bedroom;
        this.kitchen = builder.kitchen;
    }

    /**
     * Gets livingRoom.
     *
     * @return the livingRoom
     */
    public int getLivingRoom() {
        return livingRoom;
    }

    /**
     * Gets bathroom.
     *
     * @return the bathroom
     */
    public int getBathroom() {
        return bathroom;
    }

    /**
     * Gets bedroom.
     *
     * @return the bedroom
     */
    public int getBedroom() {
        return bedroom;
    }

    /**
     * Gets kitchen.
     *
     * @return the kitchen
     */
    public int getKitchen() {
        return kitchen;
    }

    @Override
    public String toString() {
        return String.format("This house has %d living room, %d bedroom, %d bathroom and %d kitchen.", getLivingRoom(), getBedroom(), getBathroom(), getKitchen());
    }

    public static class HouseBuilder {
        private int livingRoom;
        private int bathroom;
        private int bedroom;
        private int kitchen;

        public HouseBuilder() {
        }

        public HouseBuilder setLivingRoom(int count) {
            this.livingRoom = count;
            return this;
        }
        public HouseBuilder setBathroom(int count) {
            this.bathroom = count;
            return this;
        }
        public HouseBuilder setBedroom(int count) {
            this.bedroom = count;
            return this;
        }
        public HouseBuilder setKitchen(int count) {
            this.kitchen = count;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}
