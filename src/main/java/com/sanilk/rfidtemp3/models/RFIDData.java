package com.sanilk.rfidtemp3.models;

import javax.persistence.*;

@Entity
public class RFIDData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String data;

    @Column
    private String date;

    public RFIDData(){}

    public int getId() {
        return id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
