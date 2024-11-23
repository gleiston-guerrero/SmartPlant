package com.app.tddt4iots.controller;

import com.app.tddt4iots.entities.Report;
import com.app.tddt4iots.repository.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/report")
public class ReportController {

    @Autowired
    private ReportRepository reportRepository;

    @GetMapping
    public ResponseEntity<List<Report>> getReport() {
        List<Report> listReport = reportRepository.findAll();
        return ResponseEntity.ok(listReport);
    }

    @PostMapping
    public ResponseEntity<Report> insertReport(@RequestBody Report report) {
        Report newReport = reportRepository.save(report);
        return ResponseEntity.ok(newReport);
    }

    @PutMapping
    public ResponseEntity<Report> updateReport(@RequestBody Report report) {
        Report upReport = reportRepository.save(report);
        if (upReport != null) {
            return ResponseEntity.ok(upReport);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<Report> deletePersons(@PathVariable("id") Long id) {
        reportRepository.deleteById(id);
        return ResponseEntity.ok(null);
    }

}
