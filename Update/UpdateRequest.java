package de.swr.oth.Update;

import java.io.Serializable;

public class UpdateRequest implements Serializable {

    private String name;
    private String passwort;
    private byte[] data;
    private String devId;

    public UpdateRequest() {
    }

    public UpdateRequest(String name, String passwort, byte[] data, String devId) {
        this.name = name;
        this.passwort = passwort;
        this.data = data;
        this.devId = devId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswort() {
        return passwort;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public String getDevId() {
        return devId;
    }

    public void setDevId(String devId) {
        this.devId = devId;
    }
}
