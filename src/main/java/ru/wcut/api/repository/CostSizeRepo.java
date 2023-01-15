package ru.wcut.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.wcut.api.entity.MaterialEntity;

public interface CostSizeRepo extends JpaRepository<MaterialEntity, Long> {

}
