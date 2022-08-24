package com.bookstore.demo.model;


import lombok.Data;

import javax.persistence.*;
@Data
@Entity(name = "tbl_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "musteri_id")
    private long musteriId;
    @Column(name = "tc")
    private long tc;
    @Column(name = "adi")
    private String adi;
    @Column(name = "soyadi")
    private String soyadi;
    @Column(name = "mail")
    private String mail;
    @Column(name = "telefon")
    private int telefon;
    @Column(name = "adres")
    private String adres;


}
