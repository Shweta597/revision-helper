package com.shwetashaw.revisionhelper.service;

import com.shwetashaw.revisionhelper.model.RevisionItem;
import com.shwetashaw.revisionhelper.repository.RevisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class RevisionService {

    @Autowired
    private RevisionRepository repository;

    public RevisionItem addItem(RevisionItem item) {
        return repository.save(item);
    }

    public List<RevisionItem> getTodayRevisions(String email) {
        return repository.findByEmailAndRevisionDate(email,LocalDate.now());
    }
}
