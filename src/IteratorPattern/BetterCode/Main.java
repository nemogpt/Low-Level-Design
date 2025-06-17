package IteratorPattern.BetterCode;

public class Main {
    public static void main(String[] args) {
        /*
        * It is a behavioural design pattern that allows sequential access to elements of a collection without exposing the underlying representation.
        * it extracts out the traversal logic from the collection itself, allowing for different types of collections to be traversed in a consistent way.
        *
        * */

        YoutubePlaylist playlist = new YoutubePlaylist();
        playlist.addVideo(new Video("Design Patterns in Java"));
        playlist.addVideo(new Video("Understanding Iterator Pattern"));
        playlist.addVideo(new Video("Java Streams and Lambdas"));

        PlaylistIterator iterator= new YoutubePlaylistIterator(playlist.getVideos());

        while(iterator.hasNext()){
            Video video = iterator.next();
            System.out.println("Playing video: " + video.getTitle());
        }

    }
}
