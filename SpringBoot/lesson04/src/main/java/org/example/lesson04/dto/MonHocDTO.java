package org.example.lesson04.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MonHocDTO {

    @Size(min = 2, message = "Mã môn học phải có ít nhất 2 ký tự")
    private String Mamh;
    @Size(min = 5, max = 50, message = "Tên môn học phải có độ dài từ 5 đến 50 ký tự")
    private String Tenmh;
    @Min(value = 45, message = "Số tín chỉ phải lớn hơn hoặc bằng 45")
    @Max(value = 75, message = "Số tín chỉ phải nhỏ hơn hoặc bằng 75")
    private int Sotiet; // số tín chỉ
}
