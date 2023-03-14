public class Movies extends Media {
    private double duration;
    private String type; // tipo: curta ou longa
    private String[] cast;
    private String director;
    private String producer;

    public Movies(String title, int year, String gender, double duration, String type, String[] cast, String director, String producer) {
        super(title, year, gender);
        this.type = type;
        this.duration = duration;
        this.cast = cast;
        this.director = director;
        this.producer = producer;
    }

    //getters e setters

    public String getType() {
        if (duration  >= 40) {
            System.out.println("Longa metragem");
        }
        else {
            System.out.println("Curta metragem");
        }
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
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
