import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class Person{

    Scanner input = new Scanner(System.in);

    String name,surname;
    float ID,birthdate;
    String gender;
    Person father,mother,spouse;
    ArrayList<Person> children = new ArrayList<Person>();


    //getters and setters
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public float getID() {
        return ID;
    }

    public float getBirthdate() {
        return birthdate;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setID(float ID) {
        this.ID = ID;
    }

    public void setBirthdate(float birthdate) {
        this.birthdate = birthdate;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Person getFather() {
        return father;
    }

    public Person getMother() {
        return mother;
    }

    public Person getSpouse() {
        return spouse;
    }

    public ArrayList<Person> getChildren() {
        return children;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }

    public void setChildren(ArrayList<Person> children) {
        this.children = children;
    }


    public Person(String name, String surname, float ID, float birthdate, String gender) {
        this.name = name;
        this.surname = surname;
        this.ID = ID;
        this.birthdate = birthdate;
        this.gender = gender;
    }


    public void addMother(Person perMother, Person perPerson){
        perPerson.setMother(perMother);
    }
    public void addFather(Person perFather, Person perPerson){
        perPerson.setMother(perFather);
    }
    public void addSpouse(Person perSpouse, Person perPerson){
        perPerson.setMother(perSpouse);
    }
    public void addChildren(Person perChildren, Person perPerson){
        perPerson.setMother(perChildren);
    }

    public void RelationMake(Person refPerson){
        System.out.println("Mother name "+refPerson.getMother().getName());
        System.out.println("Father name "+refPerson.getFather().getName());
        System.out.println("Spouse name "+refPerson.getSpouse().getName());
        System.out.println("Children name");
        for(int i=0; i<refPerson.children.size(); i++){
            System.out.println(children.get(i).getName());
        }
    }
}


