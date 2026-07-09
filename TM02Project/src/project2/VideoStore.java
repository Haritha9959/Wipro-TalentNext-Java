package project2;

import java.util.ArrayList;

public class VideoStore {

    private ArrayList<Video> videos;

    public VideoStore() {
        videos = new ArrayList<>();
    }

    public void addVideo(String name) {

        videos.add(new Video(name));

        System.out.println("Video \"" + name + "\" added successfully.");
    }

    private Video searchVideo(String name) {

        for (Video video : videos) {

            if (video.getVideoName().equalsIgnoreCase(name)) {

                return video;
            }
        }

        return null;
    }

    public void doCheckout(String name) {

        Video video = searchVideo(name);

        if (video != null) {
            video.checkOut();
            System.out.println("Video checked out successfully.");
        } else {
            System.out.println("Video not found.");
        }

    }

    public void doReturn(String name) {

        Video video = searchVideo(name);

        if (video != null) {
            video.returnVideo();
            System.out.println("Video returned successfully.");
        } else {
            System.out.println("Video not found.");
        }

    }

    public void receiveRating(String name, int rating) {

        Video video = searchVideo(name);

        if (video != null) {
            video.setRating(rating);
            System.out.println("Rating updated successfully.");
        } else {
            System.out.println("Video not found.");
        }

    }

    public void listInventory() {

        System.out.println("--------------------------------------------");
        System.out.printf("%-20s %-12s %-8s%n",
                "Video Name",
                "Checkout",
                "Rating");
        System.out.println("--------------------------------------------");

        for (Video video : videos) {

            System.out.printf("%-20s %-12b %-8d%n",
                    video.getVideoName(),
                    video.isCheckedOut(),
                    video.getRating());

        }

        System.out.println("--------------------------------------------");
    }

}