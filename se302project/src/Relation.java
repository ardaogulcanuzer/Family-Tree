import java.util.ArrayList;

class Relation {
    private TreeRelationType type;
    private RelationType relationtype;
    private Gender gender;
    private Person Mother;
    private Person Father;
    ArrayList<Person> children;


    public TreeRelationType getType() {
        return type;
    }

    public void setType(TreeRelationType type) {
        this.type = type;
    }

    public Person getMother() {
        return Mother;
    }

    public void setMother(Person newMother) {
        this.Mother = newMother;
    }

    public Person getFather() {
        return Father;
    }

    public void setFather(Person newFather) {
        this.Father = newFather;
    }

    public ArrayList<Person> getChildren(ArrayList<Person> children){
        return children;
    }
    public void setChildren(ArrayList<Person> newChildren) {
        this.children = newChildren;
    }
    public RelationType getRelation(){
        return relationtype;
    }
    public void setRelation(RelationType relationtype){
        this.relationtype = relationtype;
    }
    public Gender getGender(){
        return gender;
    }
    public void setGender(Gender gender){
        this.gender = gender;
    }



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







