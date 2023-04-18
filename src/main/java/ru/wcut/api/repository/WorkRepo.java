package ru.wcut.api.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.wcut.api.entity.ArticleEntity;
import ru.wcut.api.entity.WorkEntity;

import java.util.List;

public interface WorkRepo extends JpaRepository<WorkEntity, Long> {
    @Query(value = "SELECT * FROM work WHERE is_published = '1' ORDER BY id DESC", nativeQuery = true)
    public List<WorkEntity> findAllByOrderByIdDesc();

    @Query(value = "SELECT * FROM work WHERE id < ? AND  is_published = '1' ORDER BY id DESC LIMIT 1", nativeQuery = true)
    List<WorkEntity> findPrevPagesAll(Long id);

    @Query(value = "SELECT * FROM work WHERE id > ? AND  is_published = '1' ORDER BY id ASC LIMIT 1", nativeQuery = true)
    List<WorkEntity> findNextPagesAll(Long id);

    @Query(value = "SELECT MAX(id) FROM work", nativeQuery = true)
    int getMaxTransactionId();

    @Query(value = "SELECT MIN(id) FROM work", nativeQuery = true)
    int getMinTransactionId();

//    @Query(value = "SELECT * FROM work WHERE is_published = '1' ORDER BY id DESC LIMIT 2", nativeQuery = true)
//    public List<WorkEntity> getWorksMainPage();


    @Query("select new WorkEntity(w.id, w.title, w.titlelong, w.img_1, w.img_1, w.is_published) from WorkEntity w where w.is_published=1 order by w.id desc")
    public List<WorkEntity> getWorksMainPage(Pageable pageable);





}
