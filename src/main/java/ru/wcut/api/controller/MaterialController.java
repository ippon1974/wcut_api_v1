package ru.wcut.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.wcut.api.entity.MaterialEntity;
import ru.wcut.api.exception.ArticleNotFoundException;
import ru.wcut.api.exception.MaterialNotFoundException;
import ru.wcut.api.service.MaterialService;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000", "http://23.105.246.179:3000"})
@RestController
@RequestMapping("/materials")
public class MaterialController {
    @Autowired
    private final MaterialService materialService;

    public MaterialController(MaterialService materialService) {
        this.materialService = materialService;
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<MaterialEntity> getAll(){
        return materialService.findAllElements();
    }

//    @GetMapping(value = {""})
//    @ResponseStatus(HttpStatus.OK)
//    public MaterialEntity getMatCostSize(@RequestParam Long id){
//            return materialService.getCostSizeMaterial(id);
//    }

    @GetMapping(value = {""})
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity getOneMaterial(@RequestParam long id){
        try {
            return ResponseEntity.ok(materialService.getCostSizeMaterial(id));
        }catch (MaterialNotFoundException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body("Произщшла ошибка");
        }
    }


}
