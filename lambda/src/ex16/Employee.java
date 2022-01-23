package ex16;

class Employee<T> {
    private T salary;

    Employee(T v) {
        salary = v;
    }

    Employee() {
        salary = null;
    }

    T getSalary() {
        return salary;
    }
}
