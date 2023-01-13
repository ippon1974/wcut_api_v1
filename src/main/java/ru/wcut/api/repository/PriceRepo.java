package ru.wcut.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.wcut.api.entity.PriceEntity;
import ru.wcut.api.entity.WorkEntity;

import java.util.List;

public interface PriceRepo extends JpaRepository<PriceEntity, Long> {
    @Query(value = "SELECT * FROM price WHERE is_published = '1' ORDER BY id ASC", nativeQuery = true)
    public List<PriceEntity> findAllByOrderByIdAsc();
}
