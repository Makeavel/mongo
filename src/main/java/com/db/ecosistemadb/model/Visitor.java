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
@Document(collection = "visitors")
public class Visitor {

    private Integer id;
    //not null
    private String name;
    private String escorts;
    private String whoInvited;
    private String phone;
    private Boolean sendNotification;
    private String gender;
    private String receivedBy;
    @DBRef
    private Congregation congregation;
    private Date createdAt;
}
