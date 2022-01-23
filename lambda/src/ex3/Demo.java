package ex3;

class Demo implements NumbericTest {
    @Override
    public boolean test(int n, int d) {
        return ((n % d) == 0);
    }
}
