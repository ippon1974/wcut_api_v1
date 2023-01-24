package ru.wcut.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.wcut.api.entity.CostSizeEntity;
import ru.wcut.api.entity.MaterialEntity;

import java.util.List;


public interface MaterialRepo extends JpaRepository<MaterialEntity, Long> {

    @Query("select m from MaterialEntity m")
    List<MaterialEntity> findByAllMaterial();

     @Query("select m from MaterialEntity m where m.id = :id")
     MaterialEntity findByMaterialById(Long id);

    @Query("select m from MaterialEntity m where m.translit = :material")
    MaterialEntity findMaterialByName(String material);


}
