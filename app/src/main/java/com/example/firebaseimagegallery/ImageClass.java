package com.example.firebaseimagegallery;

public class ImageClass {
    String caption, url;

    public ImageClass(){}

    public ImageClass(String caption, String url) {
        this.caption = caption;
        this.url = url;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
