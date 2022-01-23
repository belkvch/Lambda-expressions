package ex1;

class LambdaDemo {
    public static void main(String[] args) {
        Recalculable myNum;
        myNum = () -> 123.45f;
        System.out.println("Константное значение: " + myNum.getValue());
        myNum = () -> (float) Math.rint(Math.random() * 100);
        System.out.println("Случайное значение: " + myNum.getValue());
        System.out.println("Еще одно случайное значение: " + myNum.getValue());
    }
}
