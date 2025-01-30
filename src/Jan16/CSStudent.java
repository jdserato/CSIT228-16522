package Jan16;

public class CSStudent extends Student{
    String name;
    public CSStudent(String name, int id) {
        super(name, id);
        this.name = name;
    }

    String dean() {
        return "Mam Cherry";
    }

    String greeting(String teacher) {
        if (teacher == "Jay Vince") {
            return "Hot Or Abnormal";
        }
        return "Hello " + super.name;
    }
}
