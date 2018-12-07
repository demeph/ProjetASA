package cosa.interfaces;

import cosaM1.interfaces.State;

public interface Subject {
    State getState();
    void attach(Observer observer);
    void dettach(Observer observer);
    void notifyAllObserver();
}
