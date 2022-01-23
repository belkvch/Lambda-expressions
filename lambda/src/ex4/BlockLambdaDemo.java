package ex4;

class BlockLambdaDemo {
    public static void main(String[] args) {
        NumbericFunc factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };
        System.out.println("Фaктopиaл числа 3 = " + factorial.func(3));
        System.out.println("Фaктopиaл числа 5 = " + factorial.func(5));
    }
}
