package ru.wcut.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.wcut.api.entity.ArticleEntity;
import ru.wcut.api.exception.ArticleNotFoundException;
import ru.wcut.api.service.ArticleService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:30000")
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
}
