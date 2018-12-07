package cosaM1.interfaces;

import cosa.interfaces.Component;
import cosaM1.impl.ServerDetailImpl;

public interface ConnectionManager extends Component {
    void setServerDetail(ServerDetail serverDetail);

    void executeBdQuery(String payload);

    String getExternalSocket();

    void setExternalSocket(String externalSocket);

    void setSecurityCheck(String payload);

    void setBdQuery(String bdQuery);

    String getBdQuery();

    void setResponseDB(String response);
}
