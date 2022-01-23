package ex2;

class LambdaDemo {
    public static void main(String[] args) {
        NumbericTest isEven = (n) -> (n % 2) == 0;
        if (isEven.test(10)) System.out.println("Число 10 четное");
        if (!isEven.test(9)) System.out.println("Число 9 нечетное");
        NumbericTest isNonNeg = (n) -> (n >= 0);
        if(isNonNeg.test(1)) System.out.println("Число 1 не отрицательное");
        if(!isNonNeg.test(-1)) System.out.println("Число -1 отрицательное");
    }
}
