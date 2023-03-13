package ru.wcut.api.repository;

import org.springframework.data.domain.Pageable;
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

    @Query(value = "SELECT * FROM article WHERE is_published = 1 AND title_id = 4 ORDER BY id DESC LIMIT 2", nativeQuery = true)
    public List<ArticleEntity> getNewsItemMainPage();

    @Query(value = "SELECT * FROM article WHERE is_published = 1 AND title_id = 5 ORDER BY id ASC LIMIT 2", nativeQuery = true)
    public List<ArticleEntity> getNewsVideoMainPage();


//    @Query("select new ArticleEntity(a.id, a.title, a.title_id, a.titlelong, a.img_1, a.dt, a.dt_published, a.is_published) from ArticleEntity a where a.is_published=1 and a.title_id = 1 order by a.id desc")
//    public List<ArticleEntity> getNewsMainPage(Pageable pageable);
//
//    @Query("select new ArticleEntity(a.id, a.title, a.title_id, a.titlelong, a.img_1, a.dt, a.dt_published, a.is_published) from ArticleEntity a where a.is_published=1 and a.title_id = 4")
//    public List<ArticleEntity> getNewsItemMainPage(Pageable pageable);
//
//    @Query("select new ArticleEntity(a.id, a.title, a.title_id, a.titlelong, a.img_1, a.dt, a.dt_published, a.is_published) from ArticleEntity a where a.is_published=1 and a.title_id = 5")
//    public List<ArticleEntity> getNewsVideoMainPage(Pageable pageable);










}
