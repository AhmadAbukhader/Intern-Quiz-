package ControllerHome;

public class Security {
    private final Dog bob = new Dog();
    public Security(){
        //default constructor
    }
    public void doorLock(String doorNum){
        System.out.println("the "+doorNum +" is locked");
    }
    public void doorOpen(String doorNum){
        System.out.println("the "+doorNum +" is open");
    }

    public void alarmOn(){
        if (bob.getWarning()){
        System.out.println("weeeeeee weeeeeeeee");
        }
    }
}
