package ru.wcut.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.wcut.api.entity.MaterialEntity;
import ru.wcut.api.exception.MaterialNotFoundException;
import ru.wcut.api.repository.MaterialRepo;

import java.util.List;

@Service
public class MaterialService {
    @Autowired
    private MaterialRepo materialRepo;

    public List<MaterialEntity> findAllElements() {
        return materialRepo.findByAllMaterial();
    }

    public MaterialEntity getMaterialById(Long id) throws MaterialNotFoundException {
        MaterialEntity material = materialRepo.findByMaterialById(id);
        if(material == null){
            throw new MaterialNotFoundException("Материал не найден");
        }
        return materialRepo.findByMaterialById(id);
    }

    public MaterialEntity getMaterialByName(String material) throws MaterialNotFoundException {
        MaterialEntity materialName = materialRepo.findMaterialByName(material);
        if(materialName == null){
            throw new MaterialNotFoundException("Материал не найден");
        }
        return materialRepo.findMaterialByName(material);
    }
}
