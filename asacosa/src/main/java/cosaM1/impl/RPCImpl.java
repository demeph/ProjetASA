package cosaM1.impl;

import cosa.interfaces.Configuration;
import cosa.interfaces.Glue;
import cosaM1.interfaces.RPC;
import enums.Action;
import enums.Strategy;
import lombok.Getter;
import lombok.Setter;
import org.apache.log4j.Logger;


public class RPCImpl implements RPC {

    // Role called
    @Getter
    @Setter
    private String called;

    // Role caller
    @Getter
    @Setter
    private String caller;

    private Configuration subject;

    private Glue glue;

    private static Logger logger = Logger.getLogger(RPCImpl.class);

    public RPCImpl(Configuration subject) {
        this.subject = subject;
        this.glue = new GlueImpl(this);
    }

    public void update() {
        switch (this.subject.getState().getAction()){
            case CLIENT_REQUEST:
                this.setCaller(this.subject.getState().getPayload());
                this.glue.someGlueThings(Strategy.DIRECT);
                break;
            case BACK_SERVER_REQUEST:
                this.setCalled(this.subject.getState().getPayload());
                this.glue.someGlueThings(Strategy.REVERSE);
                break;
        }

    }

    public void handleGlueDone() {
        switch (this.subject.getState().getAction()){
            case CLIENT_REQUEST:
                logger.info("RPCImpl Done caller: "+ this.caller+ " called: "+this.called);
                this.subject.handleRequest(Action.SERVER_REQUEST, this.called);
                break;
            case BACK_SERVER_REQUEST:
                logger.info("RPCImpl Done called: "+ this.called+ " caller: "+this.caller);
                this.subject.handleRequest(Action.SERVER_RESPONSE, this.caller);
                break;
        }
    }
}
