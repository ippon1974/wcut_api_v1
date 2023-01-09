package ru.wcut.api.model;

import ru.wcut.api.entity.ArticleEntity;
import ru.wcut.api.entity.WorkEntity;

import javax.persistence.Column;
import java.util.Date;

public class Work {
    private long id;
    private String title;
    private String titlelong;
    private String materialname;
    private String body;
    private String img_1;
    private String img_2;
    private String img_3;
    private String img_4;
    private String img_5;
    private String video;
    private int last_id;
    private Date dt;
    private Date dt_published;

    public Work() {
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

    public String getMaterialname() {
        return materialname;
    }

    public void setMaterialname(String materialname) {
        this.materialname = materialname;
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

    public String getImg_4() {
        return img_4;
    }

    public void setImg_4(String img_4) {
        this.img_4 = img_4;
    }

    public String getImg_5() {
        return img_5;
    }

    public void setImg_5(String img_5) {
        this.img_5 = img_5;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public int getLast_id() {
        return last_id;
    }

    public void setLast_id(int last_id) {
        this.last_id = last_id;
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

    public static Work toModel(WorkEntity workEntity) {
        Work model = new Work();
        model.setId(workEntity.getId());
        model.setTitle(workEntity.getTitle());
        model.setTitlelong(workEntity.getTitlelong());
        model.setMaterialname(workEntity.getMaterialname());
        model.setBody(workEntity.getBody());
        model.setImg_1(workEntity.getImg_1());
        model.setImg_2(workEntity.getImg_2());
        model.setImg_3(workEntity.getImg_3());
        model.setImg_4(workEntity.getImg_4());
        model.setImg_5(workEntity.getImg_5());
        model.setVideo(workEntity.getVideo());
        model.setDt(workEntity.getDt());
        model.setDt_published(workEntity.getDt_published());
        return model;
    }
}

