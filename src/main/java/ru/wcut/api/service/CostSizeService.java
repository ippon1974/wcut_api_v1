package ru.wcut.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.wcut.api.entity.CostSizeEntity;
import ru.wcut.api.repository.CostSizeRepo;

import java.util.List;

@Service
public class CostSizeService {
    @Autowired
    private CostSizeRepo costSizeRepo;

    public List<CostSizeEntity> findAllElements() {
        return costSizeRepo.getAllCostSize();
    }
}
