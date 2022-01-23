package ex12;

class InstanceMethWithObjectRefDemo {
    static <T> int counter(T[] vals, MyFunc<T> f, T v) {
        int count = 0;
        for (int i = 0; i < vals.length; i++) {
            if (f.func(vals[i], v)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int count;
        Temp[] weekDayHighs = {
                new Temp(89), new Temp(82),
                new Temp(90), new Temp(89),
                new Temp(89), new Temp(91),
                new Temp(84), new Temp(83)};
        count = counter(weekDayHighs, Temp::same, new Temp(89));
        System.out.println("Количество дней, когда максимальная температура была 89:" + count);

        Temp[] weekDayHighs2 = {
                new Temp(32), new Temp(12),
                new Temp(24), new Temp(19),
                new Temp(18), new Temp(12),
                new Temp(-1), new Temp(13)};
        count = counter(weekDayHighs2, Temp::same, new Temp(12));
        System.out.println("Количество дней, когда максимальная температура была равна 12:" + count);

        count = counter(weekDayHighs, Temp::lessThan, new Temp(89));
        System.out.println("Количество дней, когда максимальная температура была меньше 89:" + count);
        count = counter(weekDayHighs2, Temp::lessThan, new Temp(19));
        System.out.println("Количество дней, когда максимальная температура была меньше 19:" + count);
    }
}
