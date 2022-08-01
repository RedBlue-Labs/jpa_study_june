package com.example.jpa_study.onetomany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "member_one_to_many")
@Entity(name = "member_one_to_many")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "memberId")
    private Long id;

    private String userName;

    public Member(String userName) {
        this.userName = userName;
    }
}