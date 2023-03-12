public class Artist {
    private String name;
    private String dateBirth;
    private String awards; // notas: 1 a 5
    private String gender;


    public Artist(String name,String dateBirth, String awards, String gender) {
        this.name = name;
        this.dateBirth = dateBirth;
        this.awards = awards;
        this.gender = gender;
    }

    // getters e setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

