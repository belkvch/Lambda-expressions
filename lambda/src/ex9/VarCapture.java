package ex9;

class VarCapture {
    public static void main(String[] args) {
        int num = 10;
        MyFunc myLambda = (n) -> {
            int v = num + n;
            //num++; - нельзя, так как пытаемся изменить значение num
            return v;
        };
        //num = 9; - нарушается действительно завершенное состояние переменной num
    }
}
