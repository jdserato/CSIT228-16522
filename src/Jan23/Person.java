package Jan23;

public class Person {
    int age;
    int balance;
    public void setAge(int age) throws WrongAgeException {
        if (age < 0) {
            throw new WrongAgeException("Age must not be negative");
        }
        this.age = age;
    }

    void deposit(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Negative");
        }
        int oldBalance = balance;
        balance += amount; // !
        assert balance > oldBalance : "You cannot have lower balance after deposit";
    }
}
