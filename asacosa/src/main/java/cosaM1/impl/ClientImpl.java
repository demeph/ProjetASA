package cosaM1.impl;

import cosaM1.interfaces.Client;
import cosaM1.interfaces.SimpleCS;
import enums.Action;
import lombok.Getter;
import lombok.Setter;
import org.apache.log4j.Logger;

public class ClientImpl implements Client {

    // Port request
    private String request;

    @Getter
    @Setter
    private SimpleCS simpleCS;

    private static Logger logger = Logger.getLogger(ClearanceRequestImpl.class);

    public ClientImpl() {

    }

    // Service sendRequest
    public void sendRequest(String request) {
        // Use
        this.request = request;
        logger.info("From client send a request : "+ this.request);
        this.simpleCS.handleRequest(Action.CLIENT_REQUEST, this.request);
    }

    public void sendResponse(String response){
        logger.info("J'ai recu la reponse : "+response);
    }
}
