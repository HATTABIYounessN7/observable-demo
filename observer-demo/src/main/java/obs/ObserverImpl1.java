package obs;

public class ObserverImpl1 implements Observer {
    public ObserverImpl1() {
    }

    @Override
    public void update(Observable observable) {
        ObservableImpl o = (ObservableImpl) observable;
        System.out.println("ObserverImpl1 -> new state: " + o.getState());
    }
}
