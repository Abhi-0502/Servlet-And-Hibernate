package com.xworkz.servlet.dto;


import lombok.*;
import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "login")
public class UserDto {

    @Id
    @GenericGenerator(name = "abhi",strategy = "increment")
    @GeneratedValue(generator = "abhi")
   @Column(name = "id")
    private int id;
    @Column(name="userName")
    private String userName;
    @Column(name="email")
    private String email;
    @Column(name="number")
    private  String number;
    @Column(name="address")
    private String address;
}
