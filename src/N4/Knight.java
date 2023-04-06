package N4;

public class Knight extends Hero {
    private int strength;
    private int forcepower;

    public Knight(String username, int level, int strength, int forcepower) {
        super(username, level);
        this.setStrength(strength);
        this.setForcepower(forcepower);
    }

    public void setStrength(int strength) {
        if (strength < 1 || strength > 100)
            throw new IllegalArgumentException("Strength should be in [1..100]");
        this.strength = strength;
    }

    public void setForcepower(int forcepower) {
        if (forcepower < 0)
            throw new IllegalArgumentException("Force power should be positive");

        this.forcepower = forcepower;
    }

    protected boolean fight() {
         return (this.strength - this.forcepower > 0);
    }

    @Override
    protected String action() {
        if (fight()){
            this.strength -= this.forcepower;
            return String.format(
              this.getUsername()
              + " fight with " +
                      this.forcepower
            );
        }

        return "Not enough strength";
    }

}
