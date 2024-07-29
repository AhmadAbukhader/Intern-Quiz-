package CarGear;

public abstract class gear {
    public static int GEAR1 = 1;
    public static int GEAR2 = 2;
    public static int GEAR3 = 3;

    protected int level ;
    protected gear nextGear ;

    public void setNextGear(gear nextGear){
        this.nextGear=nextGear;
    }
    public void shiftGear (int level){
        if (this.level <=  level){
            shift();
        }
        if(nextGear != null){
            nextGear.shiftGear(level);
        }
    }
    protected abstract void shift();
}
