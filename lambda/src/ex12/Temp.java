package ex12;

class Temp {
    private int hTemp;

    Temp(int hTemp) {
        this.hTemp = hTemp;
    }

    boolean same(Temp ht2) {
        return hTemp == ht2.hTemp;
    }

    boolean lessThan(Temp ht2) {
        return hTemp < ht2.hTemp;
    }
}
