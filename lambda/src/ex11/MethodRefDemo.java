package ex11;

class MethodRefDemo {
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-выражения повышают эффективность Java";
        String outStr;
        MyStringOps strOps = new MyStringOps();
        outStr = stringOp(strOps::strReverse, inStr);//ссылка на метод экземпляра strReverse() передается методу stringOp()
        System.out.println("Иcxoднaя строка:" + inStr);
        System.out.println("Строка в обратном порядке:" + outStr);
    }
}
