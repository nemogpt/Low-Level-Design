package IteratorPattern.BestCode;

import java.util.List;

public class YoutubePlaylist implements Playlist{
    private List<Video> videos;
    public void addVideo(Video video) {
        videos.add(video);
    }

    @Override
    public PlaylistIterator createIterator() {
        //this will internally creates whatever traversal algo it wants so client dont want to take care of the algos
        return new YoutubePlaylistIterator(videos);
    }
}
