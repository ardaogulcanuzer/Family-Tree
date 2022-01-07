public class Person {


        String firstName;
        String lastName;

        int id;
        String gender;
        public Person(String firstName,String lastName){
            this.firstName=firstName;
            this.lastName=lastName;
        }
        public String toString(){
            return firstName+ " "+ lastName;
        }


}
