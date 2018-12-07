package cosaM1.impl;

import cosa.interfaces.Configuration;
import cosa.interfaces.Glue;
import cosaM1.interfaces.SecurityQuery;
import enums.Action;
import enums.Strategy;
import lombok.Getter;
import lombok.Setter;
import org.apache.log4j.Logger;

public class SecurityQueryImpl implements SecurityQuery {
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

    private static Logger logger = Logger.getLogger(SecurityManagerImpl.class);

    public SecurityQueryImpl(Configuration subject) {
        this.subject = subject;
        this.glue = new GlueImpl(this);
    }

    public void update() {
        switch (this.subject.getState().getAction()){
            case SECURITY_QUERY:
                this.setCaller(this.subject.getState().getPayload());
                this.glue.someGlueThings(Strategy.DIRECT);
                break;
            case ACCESS_GRANTED:
                this.setCalled(this.subject.getState().getPayload());
                this.glue.someGlueThings(Strategy.REVERSE);
                break;
        }
    }

    public void handleGlueDone() {
        switch (this.subject.getState().getAction()){
            case SECURITY_QUERY:
                logger.info("SecurityQueryImpl Done called: "+ this.called+ " caller: "+this.caller);
                this.subject.handleRequest(Action.RESOLVE_SECURITY_QUERY, this.called);
                break;
            case ACCESS_GRANTED:
                logger.info("SecurityQueryImpl Done caller: "+ this.caller+ " called: "+this.called);
                this.subject.handleRequest(Action.BACK_RESOLVE_SECURITY_QUERY, this.caller);
                break;
        }

    }
}
