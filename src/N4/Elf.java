package N4;

public class Elf extends Hero {
    private int arrowCounts;

    public Elf(String username, int level, int arrowCounts) {
        super(username, level);
        this.setArrowCounts(arrowCounts);
    }

    public void setArrowCounts(int arrowCounts) {
        if (arrowCounts < 0)
            throw new IllegalArgumentException("Counts of arrows should be positive");

        this.arrowCounts = arrowCounts;
    }

    protected boolean shootArrow() {
        return (this.arrowCounts > 0);
    }

    @Override
    protected String action() {
        if (shootArrow()) {
            --this.arrowCounts;
            return String.format(
                    this.username
              + " shoot arrow"
            );
        }

        return super.getUsername() + " has no more arrows";
    }



}
