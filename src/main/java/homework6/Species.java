package homework6;

public enum Species {
    CAT(false, 4, true),
    DOG(false, 4, true),
    FISH(false, 0, false),
    HAMSTER(false, 4, true);


    private boolean canfly;
    private int numberOflegs;
    private boolean hasFur;


    Species(boolean canfly, int numberOflegs, boolean hasFur) {
        this.canfly = canfly;
        this.numberOflegs = numberOflegs;
        this.hasFur = hasFur;

    }


    @Override
    public String toString() {
        return String.format("%s [canFly=%b, numberOfLegs=%d , hasFur=%b]", Species.this.name(), canfly, numberOflegs, hasFur);
    }
}
