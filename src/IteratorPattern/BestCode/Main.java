package IteratorPattern.BestCode;


public class Main {

    // we dont want client to create any instance of iterator as well
    public static void main(String[] args) {
        YoutubePlaylist playlist = new YoutubePlaylist();
        playlist.addVideo(new Video("Design Patterns in Java"));
        playlist.addVideo(new Video("Understanding Iterator Pattern"));
        playlist.addVideo(new Video("Java Streams and Lambdas"));

        //let the playlist tell me what traversal they are using.
        PlaylistIterator iterator = playlist.createIterator();
        while (iterator.hasNext()) {
            Video video = iterator.next();
            System.out.println("Playing video: " + video.getTitle());
        }

    }
}


/*
* When do we use it?
*
* When we want to traverse any collection without exposing its internal structure.
* you need multiple ways to traverse a collection.
*
* */
