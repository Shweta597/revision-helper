package com.shwetashaw.revisionhelper.controller;

import com.shwetashaw.revisionhelper.model.RevisionItem;
import com.shwetashaw.revisionhelper.service.RevisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/revision")
@CrossOrigin(origins = "*")
public class RevisionController {

    @Autowired
    private RevisionService service;

    @PostMapping
    public RevisionItem addRevision(@RequestBody RevisionItem item) {
        return service.addItem(item);
    }

    @GetMapping("/{email}")
    public List<RevisionItem> getTodayRevisions(@PathVariable String email) {
        return service.getTodayRevisions(email);
    }
}
