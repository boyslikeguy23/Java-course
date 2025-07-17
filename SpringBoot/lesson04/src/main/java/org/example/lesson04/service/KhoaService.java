package org.example.lesson04.service;


import org.example.lesson04.dto.KhoaDTO;
import org.example.lesson04.entity.Khoa;
import org.example.lesson04.entity.MonHoc;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class KhoaService {
    private final List<Khoa> khoas = new ArrayList<>();

    public KhoaService() {
        khoas.add(new Khoa("KH01", "Khoa Toán"));
        khoas.add(new Khoa("KH02", "Khoa Lý"));
        khoas.add(new Khoa("KH03", "Khoa Hóa"));
        khoas.add(new Khoa("KH04", "Khoa Sinh"));
        khoas.add(new Khoa("KH05", "Khoa Tin"));
    }

    public List<Khoa> getAll() {
        return khoas;
    }

    public Khoa getByMakh(String makh) {
        for (Khoa khoa : khoas) {
            if (khoa.getMakh().equalsIgnoreCase(makh)) {
                return khoa;
            }
        }
        return null;
    }

    public void addKhoa(KhoaDTO khoa) {

        Khoa newKhoa = new Khoa();
        newKhoa.setMakh(khoa.getMakh());
        newKhoa.setTenkh(khoa.getTenkh());
        khoas.add(newKhoa);

    }

    public void editKhoa(String makh, KhoaDTO updatedKhoa) {
        Khoa existingKhoa = getByMakh(makh);
        if (existingKhoa != null) {
            existingKhoa.setTenkh(updatedKhoa.getTenkh());
        }
        // Alternatively, you can use streams to find and update
        // khoas.stream().filter(k -> k.getMakh().equalsIgnoreCase(makh))
        //       .findFirst()
        //       .ifPresent(k -> k.setTenkh(updatedKhoa.getTenkh()));
    }

    public boolean deleteKhoa(String makh) {
        return khoas.removeIf(k -> k.getMakh().equalsIgnoreCase(makh));
    }
}
