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
public class Article {
    private String name;
    private int weight;
    private int length;
    private int width;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int articleId;



}
