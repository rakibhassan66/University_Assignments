package Lab_06_2;

public class test {

    public static void main(String[] args) {
        student s1 = new student();
        s1.setName("Tarek");
        s1.setId(1157);
        s1.setCgpa(2.54);
        s1.displayRecord();

        student s2 = new student();
        s2.setName("darek");
        s2.setId(1167);
        s2.setCgpa(3.54);
        s2.displayRecord();

        student s3 = new student();
        s3.setName("Karek");
        s3.setId(1457);
        s3.setCgpa(2.84);
        s3.displayRecord();

    }

}
