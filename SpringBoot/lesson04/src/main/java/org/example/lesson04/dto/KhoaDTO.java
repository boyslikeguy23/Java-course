package org.example.lesson04.dto;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class KhoaDTO {
    @Size(min = 2, message = "Mã khoa phải có ít nhất 2 ký tự")
    private String Makh;
    @Size(min = 5, max = 25, message = "Tên khoa phải có độ dài từ 5 đến 25 ký tự")
    private String Tenkh;

}
