package ru.wcut.api.model;

import ru.wcut.api.entity.ArticleEntity;

import java.util.Date;

public class Article {
    private long id;
    private int type_id;
    private String title;
    private String lead;

    public Article() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLead() {
        return lead;
    }

    public void setLead(String lead) {
        this.lead = lead;
    }

    public static Article toModel(ArticleEntity articleEntity) {
        Article model = new Article();
//        model.setTitle(articleEntity.getTitle());
        return model;
    }
}
