package com.example.myapplication.model;

import java.util.List;

public class Wibesite {
    private String Status;
    private int totalresult;
    private List<articles> articlesList;



    public Wibesite(String status, int totalresult, List<articles> articlesList) {
        Status = status;
        this.totalresult = totalresult;
        this.articlesList = articlesList;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public int getTotalresult() {
        return totalresult;
    }

    public void setTotalresult(int totalresult) {
        this.totalresult = totalresult;
    }

    public List<articles> getArticlesList() {
        return articlesList;
    }

    public void setArticlesList(List<articles> articlesList) {
        this.articlesList = articlesList;
    }
}
