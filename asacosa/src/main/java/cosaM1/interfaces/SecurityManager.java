package cosaM1.interfaces;

import cosa.interfaces.Component;
import cosaM1.impl.ServerDetailImpl;

public interface SecurityManager extends Component {

    void setServerDetail(ServerDetail serverDetail);

    String getSecurityAuth();
    void setSecurityAuth(String securityAuth);

    void setCredentialQuery(String login);
}
