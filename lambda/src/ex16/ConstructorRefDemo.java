package ex16;

class ConstructorRefDemo {
    public static <R, T> R myFactory(Createable<R, T> cons, T v) {
        return cons.create(v);
    }

    public static void main(String[] args) {
        Createable<Employee<Double>, Double> employeeCons = Employee<Double>::new;
        Employee<Double> employee = myFactory(employeeCons, 100.1);
        System.out.println("Зарплата в объекте employee равна " + employee.getSalary());
        Createable<Firm, String> firmCons = Firm::new;
        Firm firm = myFactory(firmCons, "Juniper Networks");
        System.out.println("Имя в объекте firm равно " + firm.getName());
        System.out.println("Зарплата в объекте firm равно " + firm.averageSalary);
    }
}
