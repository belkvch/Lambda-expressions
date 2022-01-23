package ex6;

class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {
        Modifiable<String> reverse = (str) -> {
            String result = " ";
            for (int j = str.length() - 1; j >= 0; j--)
                result += str.charAt(j);
            return result;
        };
        System.out.println("Слово «лямбда-выражение» в обратном порядке:"
                + reverse.func("лямбда-выражение"));
        System.out.println("Слово «новое лямбда-выражение» в обратном порядке:"
                + reverse.func("новое лямбда-выражение"));

        Modifiable<Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };
        System.out.println("Фaктopиaл " + factorial.func(3));
        System.out.println("Фaктopиaл " + factorial.func(5));
    }
}
