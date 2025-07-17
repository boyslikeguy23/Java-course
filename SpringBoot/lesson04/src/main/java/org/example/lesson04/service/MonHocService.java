package org.example.lesson04.service;

import org.example.lesson04.dto.MonHocDTO;
import org.example.lesson04.entity.MonHoc;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MonHocService {
    private final List<MonHoc> monHocs = new ArrayList<>();

    public MonHocService() {
        monHocs.add(new MonHoc("MH01", "Toán cao cấp", 45));
        monHocs.add(new MonHoc("MH02", "Vật lý đại cương", 46));
        monHocs.add(new MonHoc("MH03", "Hóa học hữu cơ", 34));
        monHocs.add(new MonHoc("MH04", "Sinh học tế bào", 48));
        monHocs.add(new MonHoc("MH05", "Lập trình cơ bản", 49));
    }

    public List<MonHoc> getAllMonHoc() {
        return monHocs;
    }

    public MonHoc getByMamh(String mamh) {
        for (MonHoc monHoc : monHocs) {
            if (monHoc.getMamh().equalsIgnoreCase(mamh)) {
                return monHoc;
            }
        }
        return null;
    }

    public void addMonHoc(MonHocDTO monHocDTO) {
        MonHoc monHoc = new MonHoc();
        monHoc.setMamh(monHocDTO.getMamh());
        monHoc.setTenmh(monHocDTO.getTenmh());
        monHoc.setSotiet(monHocDTO.getSotiet());
        monHocs.add(monHoc);
    }
    public void editMonHoc(String mamh, MonHocDTO updatedMonHoc) {
       MonHoc editedMonHoc = getByMamh(mamh);
        if (editedMonHoc != null) {
            editedMonHoc.setTenmh(updatedMonHoc.getTenmh());
            editedMonHoc.setSotiet(updatedMonHoc.getSotiet());
        }
//        for (int i = 0; i < monHocs.size(); i++) {
//            if (monHocs.get(i).getMamh().equalsIgnoreCase(mamh)) {
//                monHocs.set(i, updatedMonHoc);
//                return;
//            }
//        }
    }

    public boolean deleteMonHoc(String mamh) {
        return monHocs.removeIf(m -> m.getMamh().equalsIgnoreCase(mamh));
    }
}
