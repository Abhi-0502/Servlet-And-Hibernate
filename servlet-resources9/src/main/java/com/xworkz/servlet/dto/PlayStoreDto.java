package com.xworkz.servlet.dto;


import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "playstoreapp")
public class PlayStoreDto {

    @Id
    @GenericGenerator(name = "abhi",strategy = "increment")
    @GeneratedValue(generator = "abhi")
    @Column(name = "id")
    private int id;

    @Column(name = "userName")
    private String userName;
    @Column(name = "surName")
    private String surName;
    @Column(name = "gender")
    private String gender;
    @Column(name="dob")
    private String dob;
    @Column(name = "email")
    private String email;
    @Column(name = "number")
    private int  number;
    @Column(name = "pwd")
    private String pwd;
    @Column(name = "confirmPwd")
    private String confirmPwd;
    @Column(name = "hideAns")
    private String hideAns;
    @Column(name = "captcha")
    private String captcha;


}
