package Charity_Donation_Platform;
public class Charity {
    private int id;
    private String title;
    public Charity() {
    }
    public Charity(int id, String title) {
        this.id = id;
        this.title = title;
    }
    public String info() {
        return "Charity: " + title;
    }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String toString() {
        return "Charity{id=" + id + ", title='" + title + "'}";
    }
    public boolean isSameAs(Charity other) {
        return this.id == other.id;
    }
}