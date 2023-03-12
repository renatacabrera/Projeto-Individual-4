public class Musician extends Artist {
    private String operation; // atuação: instrumento ou vocal

    public Musician(String name, String dateBirth, String awards, String gender, String operation) {
        super(name, dateBirth, awards, gender);
    }
}
