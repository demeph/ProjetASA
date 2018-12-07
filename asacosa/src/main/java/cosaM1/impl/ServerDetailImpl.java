package cosaM1.impl;

import cosa.interfaces.Observer;
import cosaM1.interfaces.*;
import cosaM1.interfaces.SecurityManager;
import enums.Action;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class ServerDetailImpl implements ServerDetail {

    // Port external Socket
    @Getter
    @Setter
    private String externalSocket;


    @Getter
    @Setter
    private State state;

    private List<Observer> observers;

    @Getter
    @Setter
    private SimpleCS simpleCS;

    private ConnectionManager connectionManager;

    private SecurityManager securityManager;

    private DataBase dataBase;

    public ServerDetailImpl() {
        this.state = new ConfigurationState();
        this.connectionManager = new ConnectionManagerImpl();
        this.connectionManager.setServerDetail(this);
        this.securityManager = new SecurityManagerImpl();
        this.securityManager.setServerDetail(this);
        this.dataBase = new DataBaseImpl();
        this.dataBase.setServerDetail(this);
        this.observers = new ArrayList<Observer>();
    }

    public void handleRequest(Action action, String payload) {
        this.state.setAction(action);
        this.state.setPayload(payload);

        switch (this.state.getAction()){
            case RESOLVE_SERVER_REQUEST:
                System.out.println("Binging from server details to connectionManager");
                this.connectionManager.setExternalSocket(this.externalSocket);
                break;
            case CLEARENCE_REQUEST:
                System.out.println("Attachement From Connection manager to Clearence request");
                this.notifyAllObserver();
                break;
            case RESOLVE_CLEARENCE_REQUEST:
                System.out.println("Attachement From Clearence request to Security manager");
                this.securityManager.setSecurityAuth(this.getState().getPayload());
                break;
            case SECURITY_QUERY:
                System.out.println("Attachement From Security manager to Security Query");
                this.notifyAllObserver();
                break;
            case RESOLVE_SECURITY_QUERY:
                System.out.println("Attachement From Security Query to DataBase");
                this.dataBase.login();
                break;
            case ACCESS_GRANTED:
                System.out.println("Attachement DataBase to Security Query");
                this.notifyAllObserver();
                break;
            case BACK_RESOLVE_SECURITY_QUERY:
                System.out.println("Attachement Security  to SecurityManager");
                this.securityManager.setCredentialQuery(this.getState().getPayload());
                break;
            case BACK_SECURITY_QUERY:
                System.out.println("Attachement SecurityManager  to ClearanceRequest");
                this.notifyAllObserver();
                break;
            case BACK_RESOLVE_CLEARENCE_REQUEST:
                System.out.println("Attachement ClearanceRequest  to ConnectionManager");
                this.connectionManager.setBdQuery(this.connectionManager.getExternalSocket());
                break;
            case SEND_DB_QUERY:
                System.out.println("Attachement ConnectionManager  to SQL_Query");
                this.notifyAllObserver();
                break;
            case RESOLVE_SEND_DB_QUERY:
                System.out.println("Attachement SQL_Query  to Database");
                this.dataBase.setQuery(this.getState().getPayload());
                break;
            case BACK_RESOLVE_SEND_DB_QUERY:
                System.out.println("Attachement Database  to SQL_Query");
                this.notifyAllObserver();
                break;
            case BACK_SEND_DB_QUERY:
                System.out.println("Attachement SQL_Query  to ConnectionManager");
                this.connectionManager.setResponseDB(this.getState().getPayload());
                break;
            case RESOLVE_SERVER_RESPONSE:
                System.out.println("Binging from connectionManager to server details");
                this.setExternalSocket(this.connectionManager.getExternalSocket());
                this.simpleCS.handleRequest(Action.BACK_RESOLVE_SERVER_REQUEST, this.getExternalSocket());
                break;
            default:
                System.out.println("From ServerDetail No Action needed");
                break;
        }
    }

    public void handleResponse(Action action, String payload) {

    }

    public State getState() {
        return this.state;
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


    public void setExternalSocket(String externalSocket) {
        this.externalSocket = externalSocket;
    }
}
