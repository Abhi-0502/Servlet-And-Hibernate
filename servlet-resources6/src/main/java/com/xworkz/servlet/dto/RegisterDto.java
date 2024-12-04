package com.xworkz.servlet.dto;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table( name="register")

public class RegisterDto {

    @Id
    @GenericGenerator(name = "id",strategy = "increment")
    @GeneratedValue(generator = "id")
    private int id;
    @Column(name = "userName")
    private String userName;
    @Column(name = "email")
    private String email;
    @Column(name= "place")
    private String place;
}
