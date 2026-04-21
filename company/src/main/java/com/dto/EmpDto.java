package com.dto;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpDto {
    private Integer id;
    @NotBlank(message = "用户名不能为空")
    private String username;
    private String password;
    @NotBlank(message = "姓名不能为空")
    private String name;
    private Integer gender;
    @Pattern(regexp = "^1[3-9]\\d{9}$",message = "手机号格式不对")
    private String phone;
    private Integer deptId;
    @DecimalMin(value = "0",message = "薪资不能为负数")
    private BigDecimal salary;
    private LocalDate entryDate;
    private LocalDateTime createTime;
}
