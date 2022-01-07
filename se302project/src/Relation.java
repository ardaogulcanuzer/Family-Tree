class Relation {
    private TreeRelationType type;
    private String person1;
    private String person2;

    Relation(TreeRelationType type, String person1, String person2) {
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

    //public String getPerson1() {
        return person1;
    }

    public void setPerson1(String person1) {
        this.person1 = person1;
    }

    public String getPerson2() {
        return person2;
    }

    public void setPerson2(String person2) {
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

class InvalidInputException extends Exception {
    static final long serialVersionUID = -3387516993334229948L;

    public InvalidInputException(String message) {
        super(message);
    }

}