package edu.mum.cs.cs525.labs.exercises.project.ui.framework.observer;

public interface Observable {
    void notifyObserver();
    void add(EmailObserver observer);
    void remove(EmailObserver observer);
}
