package com.xworkz.servlet.dto;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity

@Table (name="userdetails")
public class UserDto {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  int Id;
    @Column(name = "userName")
    private String userName;
    @Column(name="phone_number")
    private int phoneNumber;
    @Column(name="email")
    private String email;
    @Column(name="dob")
    private int dob;
    @Column(name="pass_word")
    private long password;
}
