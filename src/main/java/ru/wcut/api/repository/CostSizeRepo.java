package ru.wcut.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.wcut.api.entity.CostSizeEntity;

import java.util.List;

public interface CostSizeRepo extends JpaRepository<CostSizeEntity, Long> {

    @Query("select m from CostSizeEntity m")
    List<CostSizeEntity> getAllCostSize();


}
