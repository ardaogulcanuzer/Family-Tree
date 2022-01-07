public class Person {
    private int birthYear, deathYear, id;
    private String firstName, lastName, gender;

    //Setters and Getters
    //birthYear
    public int getbirthYear(){
        return this.birthYear;
    }
    public void setbirthYear(int newbirthYear){
        this.birthYear = newbirthYear;
    }
    //deathYear
    public int getdeathYear(){
        return this.deathYear;
    }
    public void setdeathYear(int newdeathYear){
        this.deathYear = newdeathYear;
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

    //id
    public int getID(){
        return this.id;
    }
    public void setID(int ID){
        this.id = ID;
    }


    public Person(String firstName,String lastName,int birthYear,int deathYear,String gender,int id){
            Relation relation = new Relation();
            this.firstName=firstName;
            this.lastName=lastName;
            this.gender=gender;
            this.id=id;
            Person mother=relation.getMother();
            Person father=relation.getFather();
    }
    public String toString(){
            return "İsim: "+firstName+ " " +"Soy İsim: "+ lastName+" "+"Cinsiyet: "+gender;
        }
}
