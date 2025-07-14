package org.example.lesson04.service;


import org.example.lesson04.dto.KhoaDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class KhoaService {
    private final List<KhoaDTO> khoas = new ArrayList<>();

    public KhoaService() {
        khoas.add(new KhoaDTO("KH01", "Khoa Toán"));
        khoas.add(new KhoaDTO("KH02", "Khoa Lý"));
        khoas.add(new KhoaDTO("KH03", "Khoa Hóa"));
        khoas.add(new KhoaDTO("KH04", "Khoa Sinh"));
        khoas.add(new KhoaDTO("KH05", "Khoa Tin"));
    }

    public List<KhoaDTO> getAll() {
        return new ArrayList<>(khoas);
    }

    public List<KhoaDTO> getByMakh(String makh) {
        return khoas.stream()
                .filter(k -> k.getMakh().equalsIgnoreCase(makh))
                .collect(Collectors.toList());
    }

    public void addKhoa(KhoaDTO khoa) {
        khoas.add(khoa);
    }

    public void editKhoa(String makh, KhoaDTO updatedKhoa) {
        for (int i = 0; i < khoas.size(); i++) {
            if (khoas.get(i).getMakh().equalsIgnoreCase(makh)) {
                khoas.set(i, updatedKhoa);
                return;
            }
        }
    }

    public boolean deleteKhoa(String makh) {
        return khoas.removeIf(k -> k.getMakh().equalsIgnoreCase(makh));
    }
}
