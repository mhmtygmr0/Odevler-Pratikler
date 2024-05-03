package week2.OgrenciNotSistemi;
public class Student {
    String name;
    String stuNo;
    String classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    double ortMat;
    double ortFizik;
    double ortKimya;
    boolean isPass;

    Student(String name , String stuNo , String classes , Course mat , Course fizik , Course kimya){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.avarage = 0.0;
        this.isPass = false;
    }

    public void courseNote(int matnotu , int fiziknotu , int kimyanotu){
        if(matnotu <= 100 && matnotu > 0){
            mat.note = matnotu * 0.8;
        }
        if(fiziknotu <= 100 && fiziknotu > 0){
            fizik.note = fiziknotu * 0.75;
        }
        if(kimyanotu <= 100 && kimyanotu > 0){
            kimya.note = kimyanotu * 0.7;
        }
    }

    public void verbalNote(int matnotu , int fiziknotu , int kimyanotu){
        if(matnotu <= 100 && matnotu > 0) {
            mat.verbalNote = matnotu * 0.2;
        }
        if(fiziknotu <= 100 && fiziknotu > 0) {
            fizik.verbalNote = fiziknotu * 0.25;
        }
        if(kimyanotu <= 100 && kimyanotu > 0) {
            kimya.verbalNote = kimyanotu * 0.3;
        }
    }

    public void noteAvarage(){
        this.ortMat = mat.note + mat.verbalNote;
        this.ortFizik = fizik.note + fizik.verbalNote;
        this.ortKimya = kimya.note + kimya.verbalNote;
        this.avarage = (this.ortMat + this.ortFizik + this.ortKimya) / 3.0;
    }

    public void isPass() {
        printNote();
        if (this.avarage > 55) {
            System.out.println(" \t Sınıfı Geçti. ");
            this.isPass = true;
        } else {
            System.out.println(" \t Sınıfta Kaldı.");
            this.isPass = false;
        }
    }

    public void printNote(){
        this.noteAvarage();
        System.out.println("\t ÖĞRENCİ NOT SİSTEMİ");
        System.out.println("=============================");
        System.out.println("Öğrenci Adı : " + this.name);
        System.out.println("=============================");
        System.out.println(mat.name + " Sınav Notu(%80) = " + mat.note);
        System.out.println(mat.name + " Sözlü Notu(%20) = " + mat.verbalNote);
        System.out.println(mat.name + " Notu = " + this.ortMat + "\n");
        System.out.println(fizik.name + " Sınav Notu(%75) = " + fizik.note);
        System.out.println(fizik.name + " Sözlü Notu(%25) = " + fizik.verbalNote);
        System.out.println(fizik.name + " Notu = " + this.ortFizik + "\n");
        System.out.println(kimya.name + " Sınav Notu(%70) = " + kimya.note);
        System.out.println(kimya.name + " Sözlü Notu(%30) = " + kimya.verbalNote);
        System.out.println(kimya.name + " Notu = " + this.ortKimya + "\n");
        System.out.println("Ortalama = " + this.avarage);
        System.out.println("=============================");
    }
}
