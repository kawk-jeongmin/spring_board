package com.study.board.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String content;
}
