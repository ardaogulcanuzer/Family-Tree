import java.util.ArrayList;

public class Family {
    ArrayList<Person> people = new ArrayList<>();
    int id=0;
    Relation relation=new Relation();

    public void addPerson(String firstName,String lastName,int birthYear,int deathYear,String gender){
        id++;
        Person person=new Person(firstName,lastName,birthYear,deathYear,gender,id);

        if(gender.equals("Kadın")){
            relation.setMother(person);
            //System.out.println(relation.getMother());
            people.add(person);
            for(int i=0;i< people.size();i++){
                if(people.get(i).getID()==1){
                    //System.out.println(relation.getMother());

                }
            }

        }
        else  if(gender.equals("Erkek")){
            relation.setFather(person);
            System.out.println(relation.getFather());
        }


    }
    public ArrayList<Person> getList() {
        return people;
    }

    enum TreeRelationType {
        SPOUSE, PARENT, CHILD
    }

    enum Gender {
        MALE, FEMALE
    }

    enum RelationType {
        FATHER, MOTHER, BROTHER, SISTER, SON, DAUGHTER, COUSIN, GRANDMOTHER, GRANDFATHER, GRANDSON, GRANDDAUGHTER, AUNT, UNCLE, HUSBAND, WIFE
    }
}


