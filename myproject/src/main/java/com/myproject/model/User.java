package com.myproject.model;


import lombok.Data;


import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Data
@Entity
@Table

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    @NotEmpty(message = "Username is required")
    private String userName;
    @Column(nullable = false)
    @NotEmpty(message = "Password is required")
    private String password;
    @Column(unique = true,nullable = false)
    @Email
    @NotEmpty(message = "Email is required")
    private String email;
    @Column
    private String dateAccountCreation = new SimpleDateFormat("yyyy:MM:dd:_HH:mm:ss").format(Calendar.getInstance().getTime());@Column
    @Lob

    private byte [] data;


}
