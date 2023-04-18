package ru.wcut.api.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.wcut.api.entity.CostSizeEntity;
import ru.wcut.api.entity.MaterialEntity;
import ru.wcut.api.entity.WorkEntity;

import java.util.List;


public interface MaterialRepo extends JpaRepository<MaterialEntity, Long> {

    @Query("select m from MaterialEntity m  where m.is_published = 1 order by m.material asc")
    List<MaterialEntity> findByAllMaterial();

     @Query("select m from MaterialEntity m where m.id = :id")
     MaterialEntity findByMaterialById(Long id);

    @Query("select m from MaterialEntity m where m.is_published = 1 and m.translit = :material")
    MaterialEntity findMaterialByName(String material);

//    @Query(value = "SELECT * FROM mateiral WHERE is_published = 1 ORDER BY id ASC LIMIT 2", nativeQuery = true)
//    public List<MaterialEntity> getMaterialMainPage();

    @Query("select new MaterialEntity(m.id, m.material, m.is_published) from MaterialEntity m where m.is_published=1 order by m.id asc ")
    public List<MaterialEntity> getMaterialMainPage(Pageable pageable);


}
