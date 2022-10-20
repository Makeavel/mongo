package com.db.ecosistemadb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "sectors")
public class Sector {

    private Integer id;
    //not null
    private String name;
    @DBRef
    private User financialResponsible;
}
