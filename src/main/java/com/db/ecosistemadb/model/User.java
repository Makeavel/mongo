package com.db.ecosistemadb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "users")
public class User {

    @Id
    private Integer id;
    private Boolean verifiedEmail;
    //not null
    private String name;
    private Boolean allowLateSubmission;
    private Date birthDate;
    private String phone;
    private String profileImg;
    //not null
    private String rg;
    //not null
    private String login;
    //not null
    private String cpf;
    //not null
    private String password;
    //not null
    private String email;
    @DBRef
    private Profile profile;
    @DBRef
    private Office office;

}

