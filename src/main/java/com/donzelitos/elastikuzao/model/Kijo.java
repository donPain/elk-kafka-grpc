package com.donzelitos.elastikuzao.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "kijins")
public class Kijo {



    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public String getDateUTC() {
        return dateUTC;
    }

    public void setDateUTC(String dateUTC) {
        this.dateUTC = dateUTC;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    @Id
    private String uuid;
    private String msgType;
    private String dateUTC;
    private String msg;
    private String owner;
    private String equipment;



    public Kijo(){};


}
