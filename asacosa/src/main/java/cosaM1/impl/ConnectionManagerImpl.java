package cosaM1.impl;

import cosaM1.interfaces.ConnectionManager;
import cosaM1.interfaces.ServerDetail;
import cosaM1.interfaces.SimpleCS;
import enums.Action;
import lombok.Getter;
import lombok.Setter;

public class ConnectionManagerImpl implements ConnectionManager {
    // Provided Port
    @Getter
    @Setter
    private String externalSocket;


    @Getter
    @Setter
    private String bdQuery;

    // Required Port
    @Getter
    @Setter
    private String securityCheck;

    private ServerDetail serverDetail;

    public void setServerDetail(ServerDetail serverDetail) {
        this.serverDetail = serverDetail;
    }

    public void executeBdQuery(String payload) {

    }

    public String getExternalSocket() {
        return this.externalSocket;
    }

    public void setExternalSocket(String externalSocket) {
        this.externalSocket = externalSocket;
        this.serverDetail.handleRequest(Action.CLEARENCE_REQUEST, this.externalSocket);
    }

    public String getSecurityCheck() {
        return securityCheck;
    }

    public void setSecurityCheck(String securityCheck) {
        this.securityCheck = securityCheck;
        if (this.securityCheck.equals("OK")){
            this.serverDetail.handleRequest(Action.SEND_DB_QUERY,this.bdQuery);
        }
    }

    public String getBdQuery() {
        return bdQuery;
    }

    public void setBdQuery(String bdQuery) {
        this.bdQuery = bdQuery;
        this.serverDetail.handleRequest(Action.SEND_DB_QUERY,this.bdQuery);
    }

    public void setResponseDB(String response){
        this.externalSocket = response;
        this.serverDetail.handleRequest(Action.RESOLVE_SERVER_RESPONSE,this.externalSocket);

    }
}
