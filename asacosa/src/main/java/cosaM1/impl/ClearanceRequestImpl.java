package cosaM1.impl;

import cosa.interfaces.Configuration;
import cosa.interfaces.Glue;
import cosaM1.interfaces.ClearanceRequest;
import enums.Action;
import enums.Strategy;
import lombok.Getter;
import lombok.Setter;
import org.apache.log4j.Logger;

public class ClearanceRequestImpl implements ClearanceRequest {
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

    private static Logger logger = Logger.getLogger(ClearanceRequestImpl.class);

    public ClearanceRequestImpl(Configuration subject) {
        this.subject = subject;
        this.glue = new GlueImpl(this);
    }

    public void update() {
        switch (this.subject.getState().getAction()){
        case CLEARENCE_REQUEST:
            this.setCaller(this.subject.getState().getPayload());
            this.glue.someGlueThings(Strategy.DIRECT);
            break;
        case BACK_SECURITY_QUERY:
            this.setCalled(this.subject.getState().getPayload());
            this.glue.someGlueThings(Strategy.REVERSE);
            break;
        default:
            break;
        }
    }

    public void handleGlueDone() {
        switch (this.subject.getState().getAction()){
            case CLEARENCE_REQUEST:
                logger.info("ClearanceRequestImpl Done called: "+ this.called+ " caller: "+this.caller);
                this.subject.handleRequest(Action.RESOLVE_CLEARENCE_REQUEST, this.called);
                break;
            case BACK_SECURITY_QUERY:
                logger.info("ClearanceRequestImpl Done called: "+ this.called+ " caller: "+this.caller);
                this.subject.handleRequest(Action.BACK_RESOLVE_CLEARENCE_REQUEST, this.caller);
                break;
            default:
                break;
        }

    }
}
