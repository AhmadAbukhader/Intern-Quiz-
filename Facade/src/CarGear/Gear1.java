package CarGear;

public class Gear1 extends gear{
    public Gear1 (int level) {
        this.level = level;
    }

    @Override
    protected void shift() {
        System.out.println("Gear one : 0 - 40 mph ");
    }
}
