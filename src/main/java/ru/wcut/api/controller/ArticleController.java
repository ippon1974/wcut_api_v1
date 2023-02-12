package ru.wcut.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.wcut.api.entity.ArticleEntity;
import ru.wcut.api.entity.MaterialEntity;
import ru.wcut.api.exception.ArticleNotFoundException;
import ru.wcut.api.model.ArticleMainPage;
import ru.wcut.api.service.ArticleService;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000", "http://23.105.246.179:3000"})
@RestController
@RequestMapping("/news")
public class ArticleController {
    @Autowired
    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<ArticleEntity> getAll(){
        return articleService.findAllElements();
    }

    @GetMapping("/market")
    @ResponseStatus(HttpStatus.OK)
    public List<ArticleEntity> getAllMarketNews(){
        return articleService.findAllMarketNews();
    }

    @GetMapping("/company")
    @ResponseStatus(HttpStatus.OK)
    public List<ArticleEntity> getAllCompanyNews(){
        return articleService.findAllCompany();
    }

    @GetMapping("/show")
    @ResponseStatus(HttpStatus.OK)
    public List<ArticleEntity> getAllShow(){
        return articleService.findAllShow();
    }

    @GetMapping("/item")
    @ResponseStatus(HttpStatus.OK)
    public List<ArticleEntity> getAllItem(){
        return articleService.findAlIItem();
    }

    @GetMapping("/video")
    @ResponseStatus(HttpStatus.OK)
    public List<ArticleEntity> getAllVideo(){
        return articleService.findAlIVideo();
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity getOneUser(@RequestParam long id){
        try {
            return ResponseEntity.ok(articleService.getOne(id));
        }catch (ArticleNotFoundException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body("Произщшла ошибка");
        }
    }

    @GetMapping("/main")
    @ResponseStatus(HttpStatus.OK)
    public List<ArticleEntity> getNewsMainPage(){
        return articleService.getNewsMainPage();
    }

    @GetMapping("/main/item")
    @ResponseStatus(HttpStatus.OK)
    public List<ArticleEntity> getNewsItemMainPage(){
        return articleService.getNewsItemMainPage();
    }

    @GetMapping("/main/video")
    @ResponseStatus(HttpStatus.OK)
    public List<ArticleEntity> getNewsVideoMainPage(){
        return articleService.getNewsVideoMainPage();
    }
}
