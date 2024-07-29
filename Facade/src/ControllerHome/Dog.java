package ControllerHome;

public class Dog {
    private final String name = "bob";
    private boolean thief ;
    private boolean warning ;
    public Dog(){
    }
    public void bark(){
        if (thief ){
            System.out.println("barking");
            warning = true ;
        }
    }
    boolean getWarning () {
        return warning ;
    }
}
