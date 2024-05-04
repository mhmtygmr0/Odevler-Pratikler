package week2.MaasHesaplayıcı;

public class Employee {
    String name;       //  Çalışanın adı ve soyadı
    double salary;     //  Çalışanın maaşı
    int workHours;     //  Haftalık çalışma saati
    int hireYear;      //  İşe başlangıç yılı
    double totalSalary; //  Güncel maasları hesaplama


    Employee(String name , double salary , int workHours , int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.totalSalary = salary;
    }

    // Vergi hesaplar ve güncel maaştan keser
    public void tax(){
        double vergi = 0.0;

        if(this.salary >= 1000){
            vergi = this.salary * 0.03;
        }

        System.out.println("Vergi : " + vergi + " TL");

        this.totalSalary -= vergi;
    }

    // Bonus hesaplar ve güncel maaşa ekler
    public void bonus(){
        double bonus = 0.0;

        if(this.workHours > 40){
            this.workHours -= 40;
            this.workHours *= 30;
            bonus = this.workHours;
        }

        System.out.println("Bonus : " + bonus + " TL");

        this.totalSalary += bonus;
    }

    // Maaş artışı hesaplar ve güncel maaşa ekler
    public void raiseSalary(){
        double zam = this.salary;

        if((2021 - hireYear) < 10){
            zam *= 0.05;
        }
        if((2021 - hireYear) < 20 && (2021 - hireYear) > 9){
            zam *= 0.10;
        }
        if((2021 - hireYear) > 19){
            zam *= 0.15;
        }

        System.out.println("Maaş Artışı : " + zam + " TL");

        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + this.totalSalary + " TL");

        this.totalSalary += zam;
        System.out.println("Toplam Maaş : " + this.totalSalary + " TL");

    }

    public void tostring(){
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary + " TL");
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        this.tax();
        this.bonus();
        this.raiseSalary();
    }
}
