public class Movies extends Media {
    private int duration;
    private String type; // tipo: curta ou longa
    private String[] cast;
    private String director;
    private String producer;

    public Movies(String title, int year, String gender, int duration, String type, String[] cast, String director, String producer) {
        super(title, year, gender);
        this.duration = duration;
        this.type = type;
        this.cast = cast;
        this.director = director;
        this.producer = producer;
    }

    //getters e setters
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String[] getCast() {
        return cast;
    }

    public void setCast(String[] cast) {
        this.cast = cast;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }


}
