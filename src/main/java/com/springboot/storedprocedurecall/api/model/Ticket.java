package com.springboot.storedprocedurecall.api.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
@NamedStoredProcedureQueries({@NamedStoredProcedureQuery(name = "firstProcedure", procedureName = "getTicketDetails"),
        @NamedStoredProcedureQuery(name = "secondProcedure", procedureName = "getTicketByCategory",
                parameters = {@StoredProcedureParameter(mode = ParameterMode.IN, name = "tcategory", type = String.class)})})
public class Ticket {

    @Id
    private int id;
    private int amount;
    private String category;
}
