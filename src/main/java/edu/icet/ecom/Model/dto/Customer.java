package edu.icet.ecom.Model.dto;

import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customer {

    private long id;
    private String name;
    private String address;
    private int number;
    private String email;
}
