package Jan16;

public class Main {

    public static void main(String[] args) {
        Student vince = new CSStudent("Jay Vince", 204003448);
        Student.MAX_YEARS = 4;
        CSStudent karl = new CSStudent("Karl", 213742283);
        Student studentngakarl = karl;
        Student[] list = {karl, vince};
        for (Student s : list) {
            System.out.println(s.greeting("Cathy"));
        }
        System.out.println(karl);
        System.out.println(studentngakarl.greeting("Jay Vince"));
        System.out.println(Student.MAX_YEARS + " vs " + Student.MAX_YEARS);
        System.out.println(karl.takeTest(4, "CS244"));
        System.out.println(Math.abs(-13));
        System.out.println(Character.toLowerCase('J'));
    }
}
