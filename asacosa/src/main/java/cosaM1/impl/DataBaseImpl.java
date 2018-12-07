package cosaM1.impl;

import cosaM1.interfaces.DataBase;
import cosaM1.interfaces.ServerDetail;
import enums.Action;
import lombok.Getter;
import lombok.Setter;

public class DataBaseImpl implements DataBase {

    // Provided Port
    @Getter
    @Setter
    private String query;

    // Required Port
    @Getter
    @Setter
    private String securityManagement;


    private ServerDetail serverDetail;

    public void setServerDetail(ServerDetail serverDetail) {
        this.serverDetail = serverDetail;
    }

    public void login() {
        this.serverDetail.handleRequest(Action.ACCESS_GRANTED, "OK");
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
        this.serverDetail.handleRequest(Action.BACK_RESOLVE_SEND_DB_QUERY,"voici la donnee");
    }
}
