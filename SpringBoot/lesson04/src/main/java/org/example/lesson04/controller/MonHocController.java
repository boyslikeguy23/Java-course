package org.example.lesson04.controller;

import jakarta.validation.Valid;
import org.example.lesson04.dto.MonHocDTO;
import org.example.lesson04.entity.MonHoc;
import org.example.lesson04.service.MonHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MonHocController {
    private final MonHocService monHocService;

    @Autowired
    public MonHocController(MonHocService monHocService) {
        this.monHocService = monHocService;
    }

    // Define endpoints for MonHocController here
    // For example:
    @GetMapping("/monhoc-list")
    public ResponseEntity<List<MonHoc>> getAllMonHoc() {
        List<MonHoc> monHocList = monHocService.getAllMonHoc();
        if (monHocList.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(monHocList);
    }

    @GetMapping("/monhoc/{mamh}")
    public ResponseEntity<MonHoc> getMonHocByMamh(String mamh) {
        MonHoc monHoc = monHocService.getByMamh(mamh);
        if (monHoc == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(monHoc);
    }

    @PostMapping("/monhoc-add")
    public ResponseEntity<String> addMonHoc(@RequestBody @Valid MonHocDTO monHocDTO) {
        monHocService.addMonHoc(monHocDTO);
        return ResponseEntity.ok("MonHoc added successfully");
    }

    @PostMapping("/monhoc-edit/{mamh}")
    public ResponseEntity<String> editMonHoc(@PathVariable String mamh, @RequestBody @Valid MonHocDTO updatedMonHoc) {
        monHocService.editMonHoc(mamh, updatedMonHoc);
        return ResponseEntity.ok("MonHoc updated successfully");
    }

    @DeleteMapping("/monhoc-delete/{mamh}")
    public ResponseEntity<String> deleteMonHoc(@PathVariable String mamh) {
        boolean deleted = monHocService.deleteMonHoc(mamh);
        if (deleted) {
            return ResponseEntity.ok("MonHoc deleted successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
