package ru.wcut.api.model;

import ru.wcut.api.entity.ArticleEntity;

import java.util.Date;

public class Article {
    private long id;
    private String title;
    private String  titlelong;
    private String body;
    private Date dt;
    private Date dt_published;
    private Boolean is_published;

    public Article() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Boolean getIs_published() {
        return is_published;
    }

    public void setIs_published(Boolean is_published) {
        this.is_published = is_published;
    }

    public static Article toModel(ArticleEntity articleEntity) {
        Article model = new Article();
        model.setId(articleEntity.getId());
        model.setTitle(articleEntity.getTitle());
        model.setTitlelong(articleEntity.getTitlelong());
        model.setBody(articleEntity.getBody());
        model.setDt(articleEntity.getDt());
        model.setDt_published(articleEntity.getDt_published());
        model.setIs_published(articleEntity.getIs_published());
        return model;
    }
}
