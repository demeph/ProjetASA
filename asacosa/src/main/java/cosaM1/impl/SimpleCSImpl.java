package cosaM1.impl;

import cosaM1.interfaces.*;
import enums.Action;
import cosa.interfaces.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


public class SimpleCSImpl implements SimpleCS {

    @Getter
    @Setter
    private State state;

    private List<Observer> observers;

    private Client client;

    private Server server;

    private ServerDetail serverDetail;

    public SimpleCSImpl(Client client, Server server, ServerDetail serverDetail) {
        this.state = new ConfigurationState();
        this.observers = new ArrayList<Observer>();
        this.client = client;
        this.server = server;
        this.client.setSimpleCS(this);
        this.server.setSimpleCS(this);
        this.serverDetail = serverDetail;
        this.serverDetail.setSimpleCS(this);
    }

    // Attachements & Bindings
    public void handleRequest(Action action, String payload) {
        this.state.setAction(action);
        this.state.setPayload(payload);

        switch (this.state.getAction()){
            case CLIENT_REQUEST:
                System.out.println("Attachement from client to rpc");
                this.notifyAllObserver();
                break;
            case SERVER_REQUEST:
                System.out.println("Attachement from rpc to server");
                this.server.reciveRequest(this.state.getPayload());
                break;
            case RESOLVE_SERVER_REQUEST:
                System.out.println("Binging from server to serverDetails");
                this.serverDetail.setExternalSocket(this.server.getProvide());
                this.serverDetail.handleRequest(Action.RESOLVE_SERVER_REQUEST, this.serverDetail.getExternalSocket());
                break;
            case BACK_RESOLVE_SERVER_REQUEST:
                System.out.println("Binging from serverDetails to server");
                this.server.setProvide(this.serverDetail.getExternalSocket());
                break;
            case BACK_SERVER_REQUEST:
                System.out.println("Attachement from server to rpc");
                this.notifyAllObserver();
                break;
            case SERVER_RESPONSE:
                System.out.println("Attachement from rpc to client");
                this.client.sendResponse(this.getState().getPayload());
                break;
            default:
                
                break;
        }
    }

    public void handleResponse(Action action, String payload) {

    }

    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    public void dettach(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyAllObserver() {
        for(Observer observer: this.observers){
            observer.update();
        }
    }
}
