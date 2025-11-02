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
public class OrderEntity {

    @Id
    private long id;
    private LocalDate date;
    private Double price;
}
