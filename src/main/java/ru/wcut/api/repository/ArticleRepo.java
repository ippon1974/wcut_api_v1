package ru.wcut.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.wcut.api.entity.ArticleEntity;
import ru.wcut.api.entity.MaterialEntity;

import java.util.List;

public interface ArticleRepo extends JpaRepository<ArticleEntity, Long> {
    @Query(value = "SELECT * FROM article ORDER BY dt DESC", nativeQuery = true)
    public List<ArticleEntity> findAllByOrderByIdDesc();

    @Query(value = "SELECT * FROM article WHERE title_id = '1' ORDER BY dt DESC", nativeQuery = true)
    public List<ArticleEntity> findAllMarket();

    @Query(value = "SELECT * FROM article WHERE title_id = '2' ORDER BY dt DESC", nativeQuery = true)
    public List<ArticleEntity> findAllCompany();

    @Query(value = "SELECT * FROM article WHERE title_id = '3' ORDER BY dt DESC", nativeQuery = true)
    public List<ArticleEntity> findAllShow();

    @Query(value = "SELECT * FROM article WHERE title_id = '4' ORDER BY dt DESC", nativeQuery = true)
    public List<ArticleEntity> findAllItem();

    @Query(value = "SELECT * FROM article WHERE title_id = '5' ORDER BY dt DESC", nativeQuery = true)
    public List<ArticleEntity> findAllVideo();

    @Query(value = "SELECT * FROM article WHERE is_published = 1 AND title_id = 1 ORDER BY id ASC LIMIT 2", nativeQuery = true)
    public List<ArticleEntity> getNewsMainPage();

    public static final String ITEM_MAIN = "SELECT * FROM article";
//    @Query(value = "SELECT * FROM article WHERE is_published = 1 AND title_id = 4 ORDER BY id ASC LIMIT 2", nativeQuery = true)
    @Query(value = ITEM_MAIN, nativeQuery = true)
    public List<ArticleEntity> getNewsItemMainPage();

    @Query(value = "SELECT * FROM article WHERE is_published = 1 AND title_id = 5 ORDER BY id ASC LIMIT 2", nativeQuery = true)
    public List<ArticleEntity> getNewsVideoMainPage();
}
