package com.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
    @NotBlank(message = "姓名不能为空")
    private String name;
    @NotBlank(message = "性别不能为空")
    private String gender;

}
