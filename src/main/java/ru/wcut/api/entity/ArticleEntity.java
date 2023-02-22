package ru.wcut.api.entity;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "article")
public class ArticleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;

    @Column( nullable = true )
    private int title_id;
    private String  titlelong;

    @Column(columnDefinition = "TEXT")
    private String body;

    @Column(length = 15)
    private String img_1;
    @Column(length = 15)
    private String img_2;
    @Column(length = 15)
    private String img_3;
    private String iframe;
    @Column(length = 5)
    private String video;

    @Column( nullable = true )
    private int last_id;
    private Date dt;
    private Date dt_published;
    private Boolean is_published;

    public ArticleEntity() {
    }

    public ArticleEntity(long id, String title, int title_id, String titlelong, String img_1, Date dt, Date dt_published, Boolean is_published) {
        this.id = id;
        this.title = title;
        this.title_id = title_id;
        this.titlelong = titlelong;
        this.img_1 = img_1;
        this.dt = dt;
        this.dt_published = dt_published;
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

    public int getTitle_id() {
        return title_id;
    }

    public void setTitle_id(int title_id) {
        this.title_id = title_id;
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
