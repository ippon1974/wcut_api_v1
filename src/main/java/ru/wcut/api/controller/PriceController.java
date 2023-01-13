package ru.wcut.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.wcut.api.entity.PriceEntity;
import ru.wcut.api.entity.WorkEntity;
import ru.wcut.api.exception.PriceNotFoundException;
import ru.wcut.api.exception.WorkNotFoundException;
import ru.wcut.api.service.PriceService;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000", "http://23.105.246.179:3000"})
@RestController
@RequestMapping("/price")
public class PriceController {
    @Autowired
    private final PriceService priceService;

    public PriceController(PriceService priceService) {
        this.priceService = priceService;
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<PriceEntity> getAllPrice(){
        return priceService.findAllElements();
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity getOneUser(@RequestParam long id){
        try {
            return ResponseEntity.ok(priceService.getOne(id));
        }catch (PriceNotFoundException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body("Произщшла ошибка");
        }
    }
}
