package ru.wcut.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.wcut.api.entity.PriceEntity;
import ru.wcut.api.exception.PriceNotFoundException;
import ru.wcut.api.exception.WorkNotFoundException;
import ru.wcut.api.model.Price;
import ru.wcut.api.repository.PriceRepo;

import java.util.List;

@Service
public class PriceService {
    @Autowired
    private PriceRepo priceRepo;

    public List<PriceEntity> findAllElements() {
        return priceRepo.findAllByOrderByIdAsc();
    }

    public Price getOne(Long id) throws PriceNotFoundException {
        PriceEntity price = priceRepo.findById(id).get();
        if(price== null) {
            throw new PriceNotFoundException("Прайс с таким ID не найден ...");
        }
        return Price.toModel(price);
    }

}
