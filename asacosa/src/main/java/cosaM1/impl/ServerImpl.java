package cosaM1.impl;

import cosaM1.interfaces.Server;
import cosaM1.interfaces.SimpleCS;
import enums.Action;
import lombok.Getter;
import lombok.Setter;

public class ServerImpl implements Server {

    // Port request
    private String provide;

    @Getter
    @Setter
    SimpleCS simpleCS;

    public ServerImpl() {
    }

    // Service reciveRequest
    public void reciveRequest(String request) {
        // User
        this.provide = request;
        this.simpleCS.handleRequest(Action.RESOLVE_SERVER_REQUEST, this.provide);
    }

    public String getProvide() {
        return this.provide;
    }

    public void setProvide(String provide) {
        this.provide = provide;
        this.simpleCS.handleRequest(Action.BACK_SERVER_REQUEST,this.provide);
    }
}
