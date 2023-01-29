package ru.wcut.api.model;

import ru.wcut.api.entity.ArticleEntity;

import java.util.Date;

public class Article {
    private long id;
    private int title_id;
    private String title;
    private String  titlelong;
    private String body;
    private String img_1;
    private String img_2;
    private String img_3;
    private String iframe;
    private String video;
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

    public String getImg_1() {
        return img_1;
    }

    public void setImg_1(String img_1) {
        this.img_1 = img_1;
    }

    public String getImg_2() {
        return img_2;
    }

    public void setImg_2(String img_2) {
        this.img_2 = img_2;
    }

    public String getImg_3() {
        return img_3;
    }

    public void setImg_3(String img_3) {
        this.img_3 = img_3;
    }

    public String getIframe() {
        return iframe;
    }

    public void setIframe(String iframe) {
        this.iframe = iframe;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
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
        model.setImg_1(articleEntity.getImg_1());
        model.setImg_2(articleEntity.getImg_2());
        model.setImg_3(articleEntity.getImg_3());
        model.setIframe(articleEntity.getIframe());
        model.setVideo(articleEntity.getVideo());
        model.setDt(articleEntity.getDt());
        model.setDt_published(articleEntity.getDt_published());
        return model;
    }
}
