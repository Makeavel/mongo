package com.db.ecosistemadb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "congregations")
public class Congregation {

    private Integer id;
    //not null
    private String name;
    //not null
    private String city;
    //not null
    private String state;
    @DBRef
    private Sector responsibleSector;
    @DBRef
    private User localPastor;
}
