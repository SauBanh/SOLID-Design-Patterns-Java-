package BEHAVIORALDESIGNPATTERNS.ObserverPattern.Example;

public interface Subject {
    public void addObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyAllObservers();
}
