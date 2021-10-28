package s15_L35_36.threading;

public class Application {
    public static void main(String[] args) {

        System.out.println("Starting Tread 1");
        //Task taskRunner = new Task("Tread - A");
        //taskRunner.start();
        //taskRunner.run();
//        Thread t1 = new Thread(new Task("Tread - A"));
//        t1.start();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("number: " + i + " - " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t1.start();


        System.out.println("Starting Tread 2");
        //Task taskRunner2 = new Task("Tread - B");
        //taskRunner2.start();
        //taskRunner2.run();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("number: " + i + " - " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        t2.start();

    }
}

//class Task extends Thread {
//    String name;
//
//    public Task(String name) {
//        this.name = name;
//    }
//
//    public void run() {
//
//        Thread.currentThread().setName(name);
//
//        for (int i = 0; i < 500; i++) {
//            System.out.println("number: " + i + " - " + Thread.currentThread().getName());
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//        }
//    }
//}

class Task implements Runnable {
    String name;

    public Task(String name) {
        this.name = name;
    }

    public void run() {

        Thread.currentThread().setName(name);

        for (int i = 0; i < 5; i++) {
            System.out.println("number: " + i + " - " + Thread.currentThread().getName());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}