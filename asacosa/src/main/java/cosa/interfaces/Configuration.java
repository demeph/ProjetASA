package cosa.interfaces;

import cosaM1.interfaces.State;
import enums.Action;

public interface Configuration extends Subject{

    void handleRequest(Action action, String payload);
    void handleResponse(Action action, String payload);
}
