package ru.wcut.api.model;

import ru.wcut.api.entity.ArticleEntity;

import java.util.ArrayList;
import java.util.List;

public class ArticleMainPage {
    private long id;
    private int title_id;
    private String title;
    private String  titlelong;

    public ArticleMainPage() {
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
    public static ArticleMainPage toModel(ArticleEntity articleEntity) {
        ArticleMainPage model = new ArticleMainPage();
        model.setId(articleEntity.getId());
        model.setTitle_id(articleEntity.getTitle_id());
        model.setTitlelong(articleEntity.getTitlelong());
        model.setTitle(articleEntity.getTitle());
        return model;
    }

    public List<ArticleMainPage> toModelList(ArticleEntity articleEntity){
        ArticleMainPage article;
        List<ArticleMainPage> list = new ArrayList<>();
    }
}
