package ru.wcut.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.wcut.api.entity.ArticleEntity;

import java.util.List;

public interface ArticleRepo extends JpaRepository<ArticleEntity, Long> {
    @Query(value = "SELECT * FROM article ORDER BY id DESC", nativeQuery = true)
    public List<ArticleEntity> findAllByOrderByIdDesc();
}
