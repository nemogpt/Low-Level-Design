package IteratorPattern.ProblematicCode;

public class Main {
    public static void main(String[] args) {
        YoutubePlaylist playlist = new YoutubePlaylist();
        playlist.addVideo(new Video("Design Patterns in Java"));
        playlist.addVideo(new Video("Understanding Iterator Pattern"));
        playlist.addVideo(new Video("Java Streams and Lambdas"));

       // We want to hide the traversal logic and what data structure is used to store the videos.
        for (Video video : playlist.getVideos()) {
            System.out.println("Playing video: " + video.getTitle());
        }
    }
}
