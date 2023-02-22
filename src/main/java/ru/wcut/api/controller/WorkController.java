package ru.wcut.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.wcut.api.entity.WorkEntity;
import ru.wcut.api.exception.WorkNotFoundException;
import ru.wcut.api.service.WorkService;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000", "http://23.105.246.179:3000", "http://wcut.ru", "https://wcut.ru", "https://www.wcut.ru"})
@RestController
@RequestMapping("/works")
public class WorkController {
    @Autowired
    private final WorkService workService;

    public WorkController(WorkService workService) {
        this.workService = workService;
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<WorkEntity> getAll(){
        return workService.findAllElements();
    }

//    @GetMapping(value = {"prev/"})
    @GetMapping("/prev")
    @ResponseStatus(HttpStatus.OK)
    public List<WorkEntity> pagePrev(@RequestParam Long id){
        return workService.prevPage(id);
    }

    @GetMapping(value = {"/next"})
    @ResponseStatus(HttpStatus.OK)
    public List<WorkEntity> pageNext(@RequestParam Long id){
        return workService.nextPage(id);
    }


//    @GetMapping(value = {"next/{id}"})
//    @ResponseStatus(HttpStatus.OK)
//    public List<WorkEntity> pageNext(@PathVariable Long id){
//        return workService.nextPage(id);
//    }

    @GetMapping(value = {"/max"})
    @ResponseStatus(HttpStatus.OK)
    public int getMaxId(){
        return workService.getMaxId();
    }

    @GetMapping(value = {"/min"})
    @ResponseStatus(HttpStatus.OK)
    public int getMinId(){
        return workService.getMinId();
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity getOneUser(@RequestParam long id){
        try {
            return ResponseEntity.ok(workService.getOne(id));
        }catch (WorkNotFoundException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body("Произщшла ошибка");
        }
    }

    @GetMapping("/main")
    @ResponseStatus(HttpStatus.OK)
    public List<WorkEntity> getWorkMainPage(){
        return workService.getWorkMainPage();
    }

}
