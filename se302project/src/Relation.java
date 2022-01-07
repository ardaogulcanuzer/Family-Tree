class Relation {
    private TreeRelationType type;
    private Person person1;
    private Person person2;


    Relation(TreeRelationType type, Person person1, Person person2) {
        this.type = type;
        this.person1 = person1;
        this.person2 = person2;
    }

    public TreeRelationType getType() {
        return type;
    }

    public void setType(TreeRelationType type) {
        this.type = type;
    }

    public Person getPerson1() {
        return person1;
    }

    public void setPerson1(Person person1) {
        this.person1 = person1;
    }

    public Person getPerson2() {
        return person2;
    }

    public void setPerson2(Person person2) {
        this.person2 = person2;
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

