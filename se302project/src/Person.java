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

    public Person(){
        this.name = ("Empty");
        this.surname = ("Empty");
        this.ID = (0);
        this.birthdate = (0);
        this.gender = ("Empty");

    }

    public Person addPerson(){
        String addName, addSurname, addGender;
        float addID, addBirthdate;

        System.out.println("Enter ID: ");
        addID= input.nextInt();
        System.out.println("Enter name: ");
        addName= input.next();
        System.out.println("Enter surname: ");
        addSurname= input.next();
        System.out.println("Enter birthdate: ");
        addBirthdate= input.nextFloat();
        System.out.println("Enter gender: ");
        addGender= input.next();

        return new Person (addName,addSurname,addID,addBirthdate,addGender);
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
        System.out.println("Mother name "+refPerson.getFather().getName());
        System.out.println("Mother name "+refPerson.getSpouse().getName());
        System.out.println("Children name");
        for(int i=0; i<refPerson.children.size(); i++){
            System.out.println(children.get(i).getName());
        }
    }









}