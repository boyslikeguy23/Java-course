package org.example.lesson04.controller;

import jakarta.validation.Valid;
import org.example.lesson04.dto.KhoaDTO;
import org.example.lesson04.entity.Khoa;
import org.example.lesson04.service.KhoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class KhoaController {

    private final KhoaService khoaService;

    @Autowired
    public KhoaController(KhoaService khoaService) {
           // Constructor logic if needed
        this.khoaService = khoaService;
    }

    @GetMapping("/khoa-list")
    public ResponseEntity<List<Khoa>> getKhoaList() {
        return ResponseEntity.ok(khoaService.getAll());
    }

    @GetMapping("/khoa-list/{makh}")
    public ResponseEntity<Khoa> getKhoaByMakh(@PathVariable String makh) {
        Khoa khoa = khoaService.getByMakh(makh);
        if (khoa != null) {
            return ResponseEntity.ok(khoa);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/khoa-add")
    public ResponseEntity<String> addKhoa(@RequestBody @Valid KhoaDTO khoa) {
        khoaService.addKhoa(khoa);
        return ResponseEntity.ok("Khoa added successfully");
    }

    @PutMapping("/khoa-edit/{makh}")
    public ResponseEntity<String> editKhoa(@PathVariable String makh, @RequestBody @Valid KhoaDTO updatedKhoa) {
        khoaService.editKhoa(makh, updatedKhoa);
        return ResponseEntity.ok("Khoa updated successfully");
    }

    @DeleteMapping("/khoa-delete/{makh}")
    public ResponseEntity<String> deleteKhoa(@PathVariable String makh) {
        boolean deleted = khoaService.deleteKhoa(makh);
        if (deleted) {
            return ResponseEntity.ok("Khoa deleted successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
