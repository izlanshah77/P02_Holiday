package sg.edu.rp.c346.p02_holiday;

public class Holiday {

    private String Title, Date;
    private int image;

    public Holiday(String title, String date, int image) {
        Title = title;
        Date = date;
        this.image = image;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
