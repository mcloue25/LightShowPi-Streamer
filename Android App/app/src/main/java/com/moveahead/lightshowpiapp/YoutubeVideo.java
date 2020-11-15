package com.moveahead.lightshowpiapp;

public class YoutubeVideo {

    private String title;
    private Long id;
    private String videoID;
    private String imageUrl;

    public YoutubeVideo(){

    }

    public YoutubeVideo(String title, Long id, String videoID, String imageUrl){
        this.title = title;
        this.id = id;
        this.videoID = videoID;
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVideoID() {
        return videoID;
    }

    public void setVideoID(String videoID) {
        this.videoID = videoID;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
