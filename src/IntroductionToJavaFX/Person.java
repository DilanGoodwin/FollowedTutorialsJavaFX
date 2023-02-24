package IntroductionToJavaFX;

public class Person {
    private int personalID;
    private String fullName;
    private boolean isEmployed;

    public Person(){
        this(0,"",false);
    }

    public Person(int id,String fullName,boolean isEmployed){
        this.personalID=id;
        this.fullName=fullName;
        this.isEmployed=isEmployed;
    }

    public int getPersonalID(){
        return this.personalID;
    }

    public String getFullName(){
        return this.fullName;
    }

    public boolean getIsEmployed(){
        return this.isEmployed;
    }

    public void setPersonalID(int id){
        this.personalID=id;
    }

    public void setFullName(String fullName){
        this.fullName=fullName;
    }

    public void setIsEmployed(boolean isEmployed){
        this.isEmployed=isEmployed;
    }

    @Override
    public String toString(){
        return "Person:[personalID="+this.personalID+", fullName="+this.fullName+", isEmployed="+this.isEmployed+"]";
    }
}
