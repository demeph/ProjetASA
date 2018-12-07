package cosaM1.interfaces;

import enums.Action;

public interface State {
    Action getAction();
    String getPayload();

    void setAction(Action action);
    void setPayload(String payload);
}
