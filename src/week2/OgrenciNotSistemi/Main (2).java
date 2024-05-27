package week2.OgrenciNotSistemi;
public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Graham Bell", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Hoca", "90550000002", "KMY");

        Course Matematik = new Course("Matematik" , "101" , "MAT");
        Course Fizik = new Course("Fizik" , "102" , "FZK");
        Course Kimya = new Course("Kimya" , "103" , "KMY");

        Student s1 = new Student("Mehmet" , "0001" , "4" , Matematik ,Fizik , Kimya);
        Student s2 = new Student("Alican" , "0002" , "4" , Matematik ,Fizik , Kimya);
        Student s3 = new Student("Zehra" , "0003" , "4" , Matematik ,Fizik , Kimya);


        s1.courseNote(75,80,65);
        s1.verbalNote(80,80,80);
        s1.isPass();

        /*

        s2.courseNote(100,100,100);
        s2.verbalNote(100,100,100);
        s2.isPass();

        s3.courseNote(100,100,100);
        s3.verbalNote(100,100,100);
        s3.isPass();

         */
    }
}
