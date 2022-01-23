package ex15;

class ConstructorRefDemo {
    public static void main(String[] args) {
        MyFunc myClassCons = MyClass::new;
        MyClass mc = myClassCons.func(100);
        System.out.println("Знaчeниe val в объекте mc равно " + mc.getVal());
    }
}
