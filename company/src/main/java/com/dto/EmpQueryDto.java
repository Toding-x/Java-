package com.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpQueryDto {
    private Integer page;
    private Integer pageSize;
    private String name;
    private  Integer gender;
    private LocalDate begin;
    private LocalDate end;

}
