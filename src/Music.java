public class Music extends Media {
    private double duration;
    private String artist;
    private String album;
    private int notes;

    public Music(String title, int year, String gender, double duration, String artist, String album, int notes) {
        super(title, year, gender);
        this.duration = duration;
        this.artist = artist;
        this.album = album;
        this.notes = notes;
    }

    //getters e setters
    public double getDuration() {

        return duration;
    }

    public void setDuration(double duration) {

        this.duration = duration;
    }

    public String getArtist() {

        return artist;
    }

    public void setArtist(String artist) {

        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getNotes() {

        return notes;
    }

    public void setNotes(int notes) {

        this.notes = notes;
    }
}
