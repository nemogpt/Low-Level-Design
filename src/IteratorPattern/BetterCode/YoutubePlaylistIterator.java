package IteratorPattern.BetterCode;

import java.util.List;

public class YoutubePlaylistIterator implements PlaylistIterator {
    List<Video> videos;
    private int position;

    public YoutubePlaylistIterator(List<Video> videos) {
        this.videos = videos;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < videos.size();
    }

    @Override
    public Video next() {
        return hasNext() ? videos.get(position++) : null;
    }

}
