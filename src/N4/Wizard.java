package N4;

public class Wizard extends Hero{
    private int mana;
    private int spellpower;

    public Wizard(String username, int level, int mana, int spellpower) {
        super(username, level);
        this.setMana(mana);
        this.setSpellpower(spellpower);
    }

    public void setMana(int mana) {
        if (mana < 0 || mana > spellpower)
            throw new IllegalArgumentException("Mana can't be negative and be more than" + "spell power");
        this.mana = mana;
    }

    public void setSpellpower(int spellpower) {
        if (spellpower < 0)
            throw new IllegalArgumentException("Spell power should be positive");
        this.spellpower = spellpower;
    }

    protected boolean spell(){
        return (this.mana - this.spellpower > 0);
    }

    @Override
    protected String action() {
        if (spell()) {
            this.mana -= this.spellpower;
            return String.format(
                    this.getUsername()
                    + " spell with "
                    + this.spellpower
            );
        }

        return "Not enough mana";
    }

}
