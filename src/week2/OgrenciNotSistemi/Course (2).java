package week2.OgrenciNotSistemi;
public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note;
    double verbalNote;

    Course(String name , String code , String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbalNote = 0;
    }

    public void addTeacher(Teacher t){
        this.teacher = t;
        if(teacher.branch.equals(this.prefix)){
            printTeacher();
        }else{
            System.out.println("Öğretmen ve Ders Bölümleri Uyuşmuyor");
        }
    }

    public void printTeacher() {
        System.out.println("Adı : " + teacher.name);
        System.out.println("Telefonu : " + teacher.mpno);
        System.out.println("Bölümü : " + teacher.branch);
        System.out.println("========================");
    }
}
