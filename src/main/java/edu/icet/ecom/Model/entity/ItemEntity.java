package edu.icet.ecom.Model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class ItemEntity {

    @Id
    private long id;
    private String name;
    private LocalDate manufacDate;
    private LocalDate expireDate;
    private Double price;
}
