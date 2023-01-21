package ru.wcut.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.wcut.api.entity.CostSizeEntity;

import java.util.List;

public interface CostSizeRepo extends JpaRepository<CostSizeEntity, Long> {

//    @Query("select m from CostSizeEntity m order by m.id asc, m.size desc")
    @Query("select m from CostSizeEntity m where m.is_published = 1 order by m.size asc")
    List<CostSizeEntity> getAllCostSize();

    //SELECT p FROM Person p ORDER BY p.firstName ASC, p.lastName DESC

}
