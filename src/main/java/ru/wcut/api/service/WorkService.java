package ru.wcut.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.wcut.api.entity.WorkEntity;
import ru.wcut.api.exception.ArticleNotFoundException;
import ru.wcut.api.exception.WorkNotFoundException;
import ru.wcut.api.model.Work;
import ru.wcut.api.repository.WorkRepo;

import java.util.List;

@Service
public class WorkService {
    @Autowired
    private WorkRepo workRepo;

    public List<WorkEntity> findAllElements() {
        return workRepo.findAllByOrderByIdDesc();
    }

    public Work getOne(Long id) throws WorkNotFoundException {
        WorkEntity work = workRepo.findById(id).get();
        if(work == null) {
            throw new WorkNotFoundException("Работы с таким ID не найдено ...");
        }
        return Work.toModel(work);
    }

}
