package cosaM1.impl;

import cosaM1.interfaces.SecurityManager;
import cosaM1.interfaces.ServerDetail;
import enums.Action;
import lombok.Data;
import lombok.Getter;
import org.apache.log4j.Logger;

@Data
public class SecurityManagerImpl implements SecurityManager {

    // Provided Port
    private String securityAuth;
    private String credentialQuery;


    private ServerDetail serverDetail;

    private static Logger logger = Logger.getLogger(SecurityManagerImpl.class);

    public void setServerDetail(ServerDetail serverDetail) {
        this.serverDetail = serverDetail;
    }

    public void setSecurityAuth(String securityAuth) {
        this.securityAuth = securityAuth;
        this.serverDetail.handleRequest(Action.SECURITY_QUERY, this.securityAuth);
    }

    public void setCredentialQuery(String credentialQuery) {
        this.credentialQuery = credentialQuery;
        logger.info("Got credential for access to data base : "+ this.credentialQuery);
        this.serverDetail.handleRequest(Action.BACK_SECURITY_QUERY, this.credentialQuery);
    }
}
