package ru.wcut.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.wcut.api.entity.MaterialEntity;

import java.util.List;


public interface MaterialRepo extends JpaRepository<MaterialEntity, Long> {
    @Query(value = "SELECT * FROM mateiral", nativeQuery = true)
    public List<MaterialEntity> findAllByOrderByIdDesc();


    @Query(value = "SELECT * FROM mateiral", nativeQuery = true)
    List<MaterialEntity> mymymy();





}
