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
@Document(collection = "prayers")
public class Prayer {

    private Integer id;
    private String person;
    private String description;
    private Date createdAt;
    private Boolean sendNotification;
    private String receivedBy;
    @DBRef
    private Congregation congregation;
    @DBRef
    private PrayerType prayerType;
}
