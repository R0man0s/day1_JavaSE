package s15_L37.threadSafety;

public class Sequence {

    private int value = 0;

//    public int getNext() {
//        synchronized (this) {
//            value = value + 1;
//            return value;
//        }
//    }

    public synchronized int getNext() {
        value = value + 1;
        return value;
    }
}
