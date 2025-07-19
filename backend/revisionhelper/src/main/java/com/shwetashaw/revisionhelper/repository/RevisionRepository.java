package com.shwetashaw.revisionhelper.repository;

import com.shwetashaw.revisionhelper.model.RevisionItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface RevisionRepository extends JpaRepository<RevisionItem, Long> {

    List<RevisionItem> findByEmailAndRevisionDate(String email, LocalDate revisionDate);

    List<RevisionItem> findByRevisionDateAndNotified(LocalDate revisionDate, boolean notified);
}
