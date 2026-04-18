package OOPS;

interface Phone {
    void call();

    void sms();
}

interface SmartPhone {
    void torch();

    void sms();

    void camera();
}

class SamsungSmartPhone implements Phone, SmartPhone {
    public void sms() {

    }

    public void call() {

    }

    public void torch() {

    }

    public void camera() {

    }
}

public class Interface {
    public static void main(String[] args) {

    }
}
