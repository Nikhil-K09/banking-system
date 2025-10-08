package com.example.banking.entity;


import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "accounts")
@Entity
public class Account {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY) check reason depricate
    private Long id;

    @Column(name = "account_holder_name")
    private String accountHolderName;
    private double balance;
}
