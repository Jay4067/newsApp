package com.learning.newsapp.Model;

import java.util.List;

public class mainNews {

    private String status;
    private String totalResults;
    private List<ModelClass> articles;

    public mainNews(String status, String totalResults, List<ModelClass> articles) {
        this.status = status;
        this.totalResults = totalResults;
        this.articles = articles;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public List<ModelClass> getArticles() {
        return articles;
    }

    public void setArticles(List<ModelClass> articles) {
        this.articles = articles;
    }
}
