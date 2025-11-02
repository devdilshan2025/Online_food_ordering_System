package edu.icet.ecom.Model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class CustomerEntity {

    @Id
    private long id;
    private String name;
    private String address;
    private int number;
    private String email;
}
