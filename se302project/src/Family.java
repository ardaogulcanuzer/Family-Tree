import java.util.ArrayList;
import java.util.Scanner;

public class Family {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        Person person = new Person();
        ArrayList<Person> people = new ArrayList<Person>();
        person = person.addPerson();
        people.add(person);



        System.out.println(person.getName() + " " + person.getSurname());



    }



}



