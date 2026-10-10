package obs;

import java.util.ArrayList;
import java.util.List;

public class ObserverImpl2 implements Observer {
    private List<Integer> history = new ArrayList<>();

    public ObserverImpl2() {
    }

    @Override
    public void update(Observable observable) {
        ObservableImpl o = (ObservableImpl) observable;
        history.add(o.getState());
        System.out.println("ObserverImpl2 -> history: " + history);
    }
}