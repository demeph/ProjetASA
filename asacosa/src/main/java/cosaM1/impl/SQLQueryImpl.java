package cosaM1.impl;

import cosa.interfaces.Configuration;
import cosa.interfaces.Glue;
import cosaM1.interfaces.SQLQuery;
import enums.Action;
import enums.Strategy;
import lombok.Getter;
import lombok.Setter;

public class SQLQueryImpl implements SQLQuery {
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

    public SQLQueryImpl(Configuration subject) {
        this.subject = subject;
        this.glue = new GlueImpl(this);
    }

    public void update() {
        switch (this.subject.getState().getAction()){
            case SEND_DB_QUERY:
                this.setCaller(this.subject.getState().getPayload());
                this.glue.someGlueThings(Strategy.DIRECT);
                break;
            case BACK_RESOLVE_SEND_DB_QUERY:
                this.setCalled(this.subject.getState().getPayload());
                this.glue.someGlueThings(Strategy.REVERSE);
                break;

        }
    }

    public void handleGlueDone() {
        switch (this.subject.getState().getAction()){
            case SEND_DB_QUERY:
                System.out.println("SecurityQueryImpl Done caller: "+ this.caller+ " called: "+this.called);
                this.subject.handleRequest(Action.RESOLVE_SEND_DB_QUERY, this.called);
                break;
            case BACK_RESOLVE_SEND_DB_QUERY:
                System.out.println("SecurityQueryImpl Done called: "+ this.called+ " caller: "+this.caller);
                this.subject.handleRequest(Action.BACK_SEND_DB_QUERY, this.caller);
                break;
        }

    }
}
