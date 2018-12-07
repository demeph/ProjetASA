package cosaM1.interfaces;

import cosa.interfaces.Configuration;

public interface ServerDetail extends Configuration {
    void setSimpleCS(SimpleCS simpleCS);

    String getExternalSocket();

    void setExternalSocket(String externalSocket);
}
