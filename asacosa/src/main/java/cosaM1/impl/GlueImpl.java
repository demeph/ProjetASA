package cosaM1.impl;

import cosa.interfaces.Connector;
import cosa.interfaces.Glue;
import enums.Strategy;
import org.apache.log4j.Logger;

public class GlueImpl implements Glue {

    Connector connector;

    private static Logger logger = Logger.getLogger(GlueImpl.class);

    public GlueImpl(Connector connector) {
        this.connector = connector;
    }

    public void someGlueThings(Strategy strategy) {
        switch (strategy){
            case REVERSE:
                logger.info("someGlueThings Begin called: "+ this.connector.getCalled()+ " caller: "+this.connector.getCaller());
                this.connector.setCaller(this.connector.getCalled());
                logger.info("someGlueThings Done called: "+ this.connector.getCalled()+ " caller: "+this.connector.getCaller());
                this.connector.handleGlueDone();
                break;
            case DIRECT:
                logger.info("someGlueThings Begin caller: "+ this.connector.getCaller()+ " called: "+this.connector.getCalled());
                this.connector.setCalled(this.connector.getCaller());
                logger.info("someGlueThings Done caller: "+ this.connector.getCaller()+ " called: "+this.connector.getCalled());
                this.connector.handleGlueDone();
                break;
            default:
                break;
        }

    }
}
