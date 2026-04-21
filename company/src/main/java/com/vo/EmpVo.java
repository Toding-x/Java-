package com.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpVo {
    private Integer id;
    private String username;
//    就少个密码
    private String name;
    private Integer gender;
    private String phone;
    private Integer deptId;
    private BigDecimal salary;
    private LocalDate entryDate;
    private LocalDateTime createTime;
}
