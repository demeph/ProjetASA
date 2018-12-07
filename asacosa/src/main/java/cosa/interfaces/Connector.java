package cosa.interfaces;

public interface Connector extends Observer {
    String getCalled();
    String getCaller();
    void setCalled(String called);
    void setCaller(String caller);

    void handleGlueDone();
}
