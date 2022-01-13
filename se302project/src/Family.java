import java.util.ArrayList;
import java.util.Scanner;

public class Family {
    public static void main(String[] args) {
        Person myPer = new Person("Doruk","Sayın", 12, 2001, "Male");
        Person myMom = new Person("Hülya", "Sayın", 13, 1974, "Female");

        myPer.addMother(myMom,myPer);
        System.out.println(myPer.getMother().getName());
        System.out.println(myPer.getMother().getSurname());
        System.out.println(myPer.getMother().getID());

    }


}



