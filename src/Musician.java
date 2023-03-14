public class Musician extends Artist {
    private String operation; // atuação: instrumento ou vocal

    public Musician(String name, String dateBirth, String awards, String gender, String operation) {
        super(name, dateBirth, awards, gender);
        this.operation = operation;
    }

    //getters e setters
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
