package cosaM1.interfaces;

public interface Client {

    SimpleCS getSimpleCS();
    void setSimpleCS(SimpleCS simpleCS);
    void sendRequest(String rquest);

    void sendResponse(String response);
}
