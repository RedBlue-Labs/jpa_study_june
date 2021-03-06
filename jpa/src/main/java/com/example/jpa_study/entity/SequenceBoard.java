package com.example.jpa_study.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@SequenceGenerator(
        name = "BOARD_SEQ_GENERATOR",
        sequenceName = "BOARD_SEQ", // 매핑할 DB 시퀀스 이름
        initialValue = 1,           // 시작 시퀀스 값
        allocationSize = 1          // 한번 호출에 증가하는 시퀀스 값
)
public class SequenceBoard {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BOARD_SEQ_GENERATOR")
    private Long id;

    private String name;
}
