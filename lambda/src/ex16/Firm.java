package ex16;

class Firm {
    static final float averageSalary = 128.378f;
    String name;

    Firm(String s) {
        name = s;
    }

    Firm() {
        name = " ";
    }

    String getName() {
        return name;
    }
}
