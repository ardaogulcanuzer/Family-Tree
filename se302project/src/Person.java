import java.lang.reflect.Array;

public class Person {

        private int ID, birthYear, deathYear, currentYear;
        private String firstName, lastName, gender;

        private Relation parents = new Relation();

        //Setters and Getters

    //ID
    public int getID(){
        return this.ID;
    }
    public void setID(int newID){
        this.ID = newID;
    }
    //birthYear
    public int getbirthYear(){
        return this.birthYear;
    }
    public void setbirthYear(int newbirthYear){
        this.ID = newbirthYear;
    }
    //deathYear
    public int getdeathYear(){
        return this.deathYear;
    }
    public void setdeathYear(int newdeathYear){
        this.ID = newdeathYear;
    }
    //currentYear
    public int getCurrentYear(){
        return this.currentYear;
    }
    public void setCurrentYear(int newcurrentYear){
        this.currentYear = newcurrentYear;
    }
    //firstName
     public String getFirstName(){
        return this.firstName;
     }
     public void setFirstName(String newfirstName){
        this.firstName = newfirstName;
     }
     //lastName
     public String getLastName(){
         return this.lastName;
     }
     public void setLastName(String newlastName){
        this.lastName = newlastName;
    }
    //gender
    public String getGender(){
        return this.gender;
    }
    public void setGender(String newGender){
        this.gender = newGender;
    }

}

