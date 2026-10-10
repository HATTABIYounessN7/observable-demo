package hattabi.youness;

import obs.ObservableImpl;
import obs.ObserverImpl1;
import obs.ObserverImpl2;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();

        ObserverImpl1 o1 = new ObserverImpl1();
        ObserverImpl2 o2 = new ObserverImpl2();

        observable.subscribe(o1);
        observable.subscribe(o2);

        observable.setState(10);
        observable.setState(20);

        observable.unsubscribe(o1);
        observable.setState(30);
    }
}