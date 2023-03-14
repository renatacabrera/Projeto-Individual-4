public class Media {
    private String title;
    private int year;
    private String gender;


    public Media(String title, int year, String gender) {
        this.title = title;
        this.year = year;
        this.gender = gender;
    }

    // getters e setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}