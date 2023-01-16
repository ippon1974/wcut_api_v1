package ru.wcut.api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.wcut.api.entity.CostSizeEntity;
import ru.wcut.api.entity.MaterialEntity;
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
}