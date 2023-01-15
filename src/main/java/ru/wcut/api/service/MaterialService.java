package ru.wcut.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.wcut.api.entity.MaterialEntity;
import ru.wcut.api.repository.MaterialRepo;

import java.util.List;

@Service
public class MaterialService {
    @Autowired
    private MaterialRepo materialRepo;

    public List<MaterialEntity> findAllElements() {
        return materialRepo.mymymy();
    }



}
