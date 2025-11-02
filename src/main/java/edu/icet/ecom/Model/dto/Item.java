package edu.icet.ecom.Model.dto;

import lombok.*;

import java.time.LocalDate;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Item {

    private long id;
    private String name;
    private LocalDate manufacDate;
    private LocalDate expireDate;
    private Double price;


}
