package com.example.stline.entity;

import lombok.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;

@RequiredArgsConstructor
@Setter
@ToString
@EqualsAndHashCode
public class Order implements BaseEntity {

    @Getter private Long idUser;
    @Getter private String phone;
    @Getter private String address;
    @Getter private String description;
    @Getter @Setter private boolean action;
    @Getter @Setter private Timestamp create_at;
    @Getter @Setter private Timestamp close_at;

    public Order(Long idUser, String phone, String address){
        this.idUser=idUser;
        this.phone=phone;
        this.address=address;
        this.action=true;
    }
}
