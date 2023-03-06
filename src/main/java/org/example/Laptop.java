package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.security.PrivateKey;

@Data
@AllArgsConstructor
public class Laptop {
    private String name;
    private Integer screen_diagonal; // в дюймах
    private Double weight; // в килограммах
    private Integer ram; // в ГБ

    private Integer disk_storage; // в ГБ
    private Integer battery; // мА/ч
    private String os;
    private String colour;

}
