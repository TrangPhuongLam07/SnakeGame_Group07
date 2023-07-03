package vn.edu.nlu.interfaceSnake;

public interface Subject {
	public void register(Observer obs);
	public void unRegister(Observer obs);
	public void notifyObs();
	public void setChange();
	public void setScore(int apples, int mushrooms, int stars);
}

