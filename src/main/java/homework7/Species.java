package homework7;

public enum Species {
    DOMESTICCAT(false, 4, true),
    DOG(false, 4, true),
    FISH(false, 0, false),
    ROBOCAT(false, 4, true),
    UNKNOWN(false, 0, false);


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
