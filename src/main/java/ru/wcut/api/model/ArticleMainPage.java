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

    public List<ArticleMainPage> toModel(List<ArticleEntity> articleEntity) {
        ArticleMainPage model = new ArticleMainPage();
        model.setId(new ArticleEntity().getId());
        model.setTitle_id(new ArticleEntity().getTitle_id());
        model.setTitlelong(new ArticleEntity().getTitlelong());
        model.setTitle(new ArticleEntity().getTitle());
        List<ArticleMainPage> articleMainPagesList = new ArrayList<>();
        articleMainPagesList.add(model);
        return articleMainPagesList;
    }

    private static ArticleMainPage toModelNew(ArticleEntity articleEntity){
        ArticleMainPage articleMainPage = new ArticleMainPage();
        articleMainPage.setId(articleEntity.getId());
        articleMainPage.setTitle(articleEntity.getTitle());
        articleMainPage.setTitle_id(articleEntity.getTitle_id());
        return  articleMainPage;
    }

    public static List<ArticleMainPage> test(List<ArticleEntity> articleEntities){
        List<ArticleEntity> art = articleEntities;
        List<ArticleMainPage> test = new ArrayList<>();


        //model.setTodos(entity.getTodos().stream().map(Todo::toModel).collect(Collectors.toList()));
        return test;
    }


}
