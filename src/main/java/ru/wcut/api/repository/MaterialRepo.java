package ru.wcut.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.wcut.api.entity.CostSizeEntity;
import ru.wcut.api.entity.MaterialEntity;
import ru.wcut.api.entity.WorkEntity;

import java.util.List;


public interface MaterialRepo extends JpaRepository<MaterialEntity, Long> {

    @Query("select m from MaterialEntity m order by m.material asc")
    List<MaterialEntity> findByAllMaterial();

     @Query("select m from MaterialEntity m where m.id = :id")
     MaterialEntity findByMaterialById(Long id);

    @Query("select m from MaterialEntity m where m.translit = :material")
    MaterialEntity findMaterialByName(String material);

    @Query(value = "SELECT id, material, material_en, translit FROM mateiral ORDER BY id ASC LIMIT 2", nativeQuery = true)
    public List<MaterialEntity> getMaterialMainPage();


}
