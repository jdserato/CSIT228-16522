package Jan16;

import java.util.Date;

public abstract class Student {

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return name + " age: " + age;
    }

    public Student(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    String name;
    final int id;
    int age;
    Date birthday;
    static int MAX_YEARS = 10;

    public String getName() {
        return name;
    }

    int takeTest(String subject) {
        if (subject == "CSIT228") {
            return 94;
        }
        return 40;
    }

    int takeTest(String subject, int sleep) {
        if (subject == "CSIT228" || sleep > 8) {
            return 94;
        }
        return 40;
    }

    int takeTest(int study, String subject) {
        if (subject == "CSIT228" || study > 12) {
            return 94;
        }
        return 40;
    }

    String greeting(String teacher) {
        if (teacher == "Jay Vince") {
            return "Cool & Normal";
        }
        return "Hi";
    }
}