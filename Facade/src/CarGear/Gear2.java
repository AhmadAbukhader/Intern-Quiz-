package CarGear;
public class Gear2 extends gear{
    public Gear2 (int level) {
        this.level = level;
    }

    @Override
    protected void shift() {
        System.out.println("Gear tweo : 40 - 80 mph ");

    }
}
