package cosaM1.interfaces;

public interface Server {
    SimpleCS getSimpleCS();
    void setSimpleCS(SimpleCS simpleCS);
    void reciveRequest(String request);
    String getProvide();
    void setProvide(String provide);
}
