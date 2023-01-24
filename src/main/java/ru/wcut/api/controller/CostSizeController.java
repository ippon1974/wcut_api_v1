package ru.wcut.api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.wcut.api.entity.CostSizeEntity;
import ru.wcut.api.entity.MaterialEntity;
import ru.wcut.api.exception.CostSizeNotFoundException;
import ru.wcut.api.exception.MaterialNotFoundException;
import ru.wcut.api.service.CostSizeService;
import ru.wcut.api.service.MaterialService;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000", "http://23.105.246.179:3000"})
@RestController
@RequestMapping("/costsize")
public class CostSizeController {
    @Autowired
    private final CostSizeService costSizeService;

    public CostSizeController(CostSizeService costSizeService) {
        this.costSizeService = costSizeService;
    }
    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<CostSizeEntity> getAll(){
        return costSizeService.findAllElements();
    }

//    @GetMapping(value = {""})
//    @ResponseStatus(HttpStatus.OK)
//    public CostSizeEntity getCostSize(@RequestParam(required = false) Long id, @RequestParam(required = false) int size){
//        return costSizeService.getCostSize(id, size);
//    }

    @GetMapping(value = {""})
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity getOneCostSize(@RequestParam long id, @RequestParam int size){
        try {
            return ResponseEntity.ok(costSizeService.getCostSizeById(id, size));
        }catch (CostSizeNotFoundException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body("Произщшла ошибка");
        }
    }





}
