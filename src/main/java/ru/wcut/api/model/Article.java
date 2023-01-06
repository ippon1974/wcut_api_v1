package ru.wcut.api.model;

import ru.wcut.api.entity.ArticleEntity;

import java.util.Date;

public class Article {
    private long id;
    private int title_id;
    private String title;
    private String  titlelong;
    private String body;
    private Date dt;
    private Date dt_published;

    public Article() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getTitle_id() {
        return title_id;
    }

    public void setTitle_id(int title_id) {
        this.title_id = title_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitlelong() {
        return titlelong;
    }

    public void setTitlelong(String titlelong) {
        this.titlelong = titlelong;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getDt() {
        return dt;
    }

    public void setDt(Date dt) {
        this.dt = dt;
    }

    public Date getDt_published() {
        return dt_published;
    }

    public void setDt_published(Date dt_published) {
        this.dt_published = dt_published;
    }

    public static Article toModel(ArticleEntity articleEntity) {
        Article model = new Article();
        model.setId(articleEntity.getId());
        model.setTitle_id(articleEntity.getTitle_id());
        model.setTitle(articleEntity.getTitle());
        model.setTitlelong(articleEntity.getTitlelong());
        model.setBody(articleEntity.getBody());
        model.setDt(articleEntity.getDt());
        model.setDt_published(articleEntity.getDt_published());
        return model;
    }
}
