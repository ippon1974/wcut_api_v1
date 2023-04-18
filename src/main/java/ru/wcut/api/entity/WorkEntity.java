package ru.wcut.api.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "work")
public class WorkEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 155)
    private String title;

    @Column(length = 275)
    private String titlelong;

    @Column(length = 75)
    private String materialname;

    @Column(columnDefinition = "TEXT")
    private String body;

    @Column(length = 15)
    private String img_1;

    @Column(length = 15)
    private String img_2;

    @Column(length = 15)
    private String img_3;

    @Column(length = 15)
    private String img_4;

    @Column(length = 15)
    private String img_5;

    @Column(length = 5)
    private String video;

    @Column( nullable = true )
    private int last_id;

    private Date dt;

    private Date dt_published;

    private Boolean is_published;

    public WorkEntity() {
    }

    public WorkEntity(long id, String title, String titlelong, String img_1, String img_2, Boolean is_published) {
        this.id = id;
        this.title = title;
        this.titlelong = titlelong;
        this.img_1 = img_1;
        this.img_2 = img_2;
        this.is_published = is_published;
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

    public Boolean getIs_published() {
        return is_published;
    }

    public void setIs_published(Boolean is_published) {
        this.is_published = is_published;
    }
}
