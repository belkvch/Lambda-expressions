package ex10;

class MethodRefDemo {
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-выражения повышают эффективность Java";
        String outStr;
        outStr = stringOp(MyStringOps::strReverse, inStr); //ссылка на метод strReverse() передается методу stringOp()
        System.out.println("Иcxoднaя строка: " + inStr);
        System.out.println("Строка в обратном порядке: " + outStr);
    }
}
