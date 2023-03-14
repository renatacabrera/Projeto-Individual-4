public class Actor extends Artist {
    private String formation; //formação: teatro, cinema, outros

    public Actor(String name, String dateBirth, String awards, String gender, String formation) {
        super(name, dateBirth, awards, gender);
        this.formation = formation;
    }

    //getters e setters
    public String getFormation() {
        return formation;
    }

    public void setFormation(String formation) {
        this.formation = formation;
    }
}
