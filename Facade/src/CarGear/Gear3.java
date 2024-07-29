package CarGear;

public class Gear3 extends gear{
    public Gear3(int level) {
        this.level = level;
    }

    @Override
    protected void shift() {
        System.out.println("Gear three : 80 - 120 mph ");
    }
}
