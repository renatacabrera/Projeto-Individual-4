public class Music extends Media {
    private int duration;
    private String artist;
    private int notes;

    public Music(String title, int year, String gender, int duration, String artist, int notes) {
        super(title, year, gender);
        this.duration = duration;
        this.artist = artist;
        this.notes = notes;
    }

    //getters e setters
    public int getDuration() {

        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getNotes() {
        return notes;
    }

    public void setNotes(int notes) {
        this.notes = notes;
    }
}
