package ru.wcut.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.wcut.api.entity.ArticleEntity;
import ru.wcut.api.entity.WorkEntity;

import java.util.List;

public interface WorkRepo extends JpaRepository<WorkEntity, Long> {
    @Query(value = "SELECT * FROM work WHERE is_published = '1' ORDER BY dt DESC", nativeQuery = true)
    public List<WorkEntity> findAllByOrderByIdDesc();
}
