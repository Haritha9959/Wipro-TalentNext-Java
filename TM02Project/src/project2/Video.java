package project2;

public class Video {

    private String videoName;
    private boolean checkedOut;
    private int rating;

    public Video(String videoName) {
        this.videoName = videoName;
        this.checkedOut = false;
        this.rating = 0;
    }

    public String getVideoName() {
        return videoName;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public int getRating() {
        return rating;
    }

    public void checkOut() {
        checkedOut = true;
    }

    public void returnVideo() {
        checkedOut = false;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}