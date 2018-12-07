package cosa;

import cosaM1.impl.EnumAction;

public interface Subject {
	
	void register(Observer obs);
	
	void removeObs(Observer obs);
	
	void notifyObs();

	EnumAction getAction();

	String getPayLoad();

	void setPayLoad(String request);

}
