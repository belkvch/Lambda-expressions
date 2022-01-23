package ex5;

class BlockLambdaDemo {
    public static void main(String[] args) {
        StringFunc reverse = (str) -> {
            String result = " ";
            for (int j = str.length() - 1; j >= 0; j--) {
                result += str.charAt(j);
            }
            return result;
        };
        System.out.println("Слово «лямбда-выражение» в обратном порядке:"
                + reverse.func("лямбда-выражение"));
        System.out.println("Слово «новое лямбда-выражение» в обратном порядке:"
                + reverse.func("новое лямбда-выражение"));
    }
}
