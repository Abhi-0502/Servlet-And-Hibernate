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
@Table(name = "messhodetails")

public class MesshoDto {

    @Id
    @GenericGenerator(name = "abhi",strategy = "increment")
    @GeneratedValue(generator = "abhi")

    private int id;
    @Column(name = "userName")
    private String userName;
    @Column(name = "gender")
    private String gender;
    @Column(name = "number")
    private int number;
    @Column(name = "address")
   private  String address;


}
