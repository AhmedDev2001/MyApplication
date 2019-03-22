package com.example.myapplication.model;

import java.util.List;

public class articles {
    private List<Sourcedata>sourseList;
    private String title;
    private String author;
    private String url;
    private String description;
    private String content;
    private String urlToImage;
    private String publishedAt;

    public articles(){

    }
    public articles(List<Sourcedata> sourseList, String title, String author, String url, String description, String content, String urlToImage, String publishedAt) {
        this.sourseList = sourseList;
        this.title = title;
        this.author = author;
        this.url = url;
        this.description = description;
        this.content = content;
        this.urlToImage = urlToImage;
        this.publishedAt = publishedAt;
    }

    public List<Sourcedata> getSourseList() {
        return sourseList;
    }

    public void setSourseList(List<Sourcedata> sourseList) {
        this.sourseList = sourseList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }
}
