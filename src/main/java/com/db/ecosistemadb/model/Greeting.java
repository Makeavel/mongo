package com.db.ecosistemadb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "greetings")
public class Greeting {

    private Integer id;
    //not null
    private String name;
    private String description;
    private Date createdAt;
    private Boolean sendNotification;
    private String reciveidBy;
    @DBRef
    private Congregation congregation;

}
