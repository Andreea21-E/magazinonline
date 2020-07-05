package com.andreea.magazinonline.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Entity
public class Stock {
    private String stockType;// ce tip de stoc avem adica rezerva ...
    // mai trebuie adaugate si alte filduri


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int stockId;
}
