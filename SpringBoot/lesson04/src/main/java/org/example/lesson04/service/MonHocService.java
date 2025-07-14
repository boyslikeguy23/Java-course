package org.example.lesson04.service;

import org.example.lesson04.dto.MonHocDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MonHocService {
    private final List<MonHocDTO> monHocs = new ArrayList<>();

    public MonHocService() {
        monHocs.add(new MonHocDTO("MH01", "Toán cao cấp", 45));
        monHocs.add(new MonHocDTO("MH02", "Vật lý đại cương", 46));
        monHocs.add(new MonHocDTO("MH03", "Hóa học hữu cơ", 34));
        monHocs.add(new MonHocDTO("MH04", "Sinh học tế bào", 48));
        monHocs.add(new MonHocDTO("MH05", "Lập trình cơ bản", 49));
    }

    public List<MonHocDTO> getAll() {
        return new ArrayList<>(monHocs);
    }

    public List<MonHocDTO> getByMamh(String mamh) {
        return monHocs.stream()
                .filter(m -> m.getMamh().equalsIgnoreCase(mamh))
                .toList();
    }

    public void addMonHoc(MonHocDTO monHoc) {
        monHocs.add(monHoc);
    }
    public void editMonHoc(String mamh, MonHocDTO updatedMonHoc) {
        for (int i = 0; i < monHocs.size(); i++) {
            if (monHocs.get(i).getMamh().equalsIgnoreCase(mamh)) {
                monHocs.set(i, updatedMonHoc);
                return;
            }
        }
    }

    public boolean deleteMonHoc(String mamh) {
        return monHocs.removeIf(m -> m.getMamh().equalsIgnoreCase(mamh));
    }
}
