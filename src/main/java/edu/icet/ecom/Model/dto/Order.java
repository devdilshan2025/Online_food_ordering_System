package edu.icet.ecom.Model.dto;

import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {

    private long id;
    private LocalDate date;
    private Double price;
}
