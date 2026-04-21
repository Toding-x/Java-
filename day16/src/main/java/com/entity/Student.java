package com.entity;


import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private Integer id;
    @NotNull(message ="姓名不能为空")
    private String name;
    private Integer age;
    private String gender;
    private String classroom;
    private String address;


}
