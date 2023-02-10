package ru.wcut.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.wcut.api.entity.ArticleEntity;
import ru.wcut.api.exception.ArticleNotFoundException;
import ru.wcut.api.model.Article;
import ru.wcut.api.model.ArticleMainPage;
import ru.wcut.api.repository.ArticleRepo;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleService {
    @Autowired
    private ArticleRepo articleRepo;

    public List<ArticleEntity> findAllElements() {
        return articleRepo.findAllByOrderByIdDesc();
    }

    public List<ArticleEntity> findAllMarketNews(){
        return articleRepo.findAllMarket();
    }

    public List<ArticleEntity> findAllCompany(){
        return articleRepo.findAllCompany();
    }

    public List<ArticleEntity> findAllShow(){
        return articleRepo.findAllShow();
    }

    public List<ArticleEntity> findAlIItem(){
        return articleRepo.findAllItem();
    }

    public List<ArticleEntity> findAlIVideo(){
        return articleRepo.findAllVideo();
    }

    public Article getOne(Long id) throws ArticleNotFoundException {
        ArticleEntity article = articleRepo.findById(id).get();
        if(article == null) {
            throw new ArticleNotFoundException("Пользователь с таким именем не нейден");
        }
        return Article.toModel(article);
    }

    public List<ArticleEntity> getNewsMainPage(){
        return articleRepo.getNewsMainPage();
    }

    public List<ArticleEntity> getNewsItemMainPage(){
        return articleRepo.getNewsItemMainPage();
    }

    public List<ArticleMainPage> getNewsItemMainPageToModel(){

    }

    public List<ArticleEntity> getNewsVideoMainPage(){
        return articleRepo.getNewsVideoMainPage();
    }

}
