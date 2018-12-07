package cosaM1.impl;

import cosa.interfaces.Connector;
import cosa.interfaces.Glue;
import enums.Strategy;

public class GlueImpl implements Glue {

    Connector connector;

    public GlueImpl(Connector connector) {
        this.connector = connector;
    }

    public void someGlueThings(Strategy strategy) {
        switch (strategy){
            case REVERSE:
                System.out.println("someGlueThings Begin called: "+ this.connector.getCalled()+ " caller: "+this.connector.getCaller());
                this.connector.setCaller(this.connector.getCalled());
                System.out.println("someGlueThings Done called: "+ this.connector.getCalled()+ " caller: "+this.connector.getCaller());
                this.connector.handleGlueDone();
                break;
            case DIRECT:
                System.out.println("someGlueThings Begin caller: "+ this.connector.getCaller()+ " called: "+this.connector.getCalled());
                this.connector.setCalled(this.connector.getCaller());
                System.out.println("someGlueThings Done caller: "+ this.connector.getCaller()+ " called: "+this.connector.getCalled());
                this.connector.handleGlueDone();
                break;
            default:
                break;
        }

    }
}
