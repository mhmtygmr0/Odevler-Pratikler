package week2.BoksMaciOyunu;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;


    Match(Fighter f1 , Fighter f2 , int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }


    public void run(){
        if(isCheck()){
            determineFirstAttacker();
            while(this.f1.health > 0 && this.f2.health > 0){
                System.out.println("====YENİ ROUND====");
                this.f2.health = f1.hit(this.f2);
                if(isWin()){
                    break;
                }
                this.f1.health = f2.hit(this.f1);
                if(isWin()){
                    break;
                }
                System.out.println(this.f1.name + " Sağlık : " + this.f1.health);
                System.out.println(this.f2.name + " Sağlık : " + this.f2.health);
            }
        } else {
            System.out.println("Sporcuların sikletleri uymuyor.");
        }
    }


    boolean isCheck(){
        return ((this.f1.weight >= minWeight && this.f1.weight <= this.maxWeight) &&
                (this.f2.weight >= minWeight && this.f2.weight <= this.maxWeight));
    }


    boolean isWin(){
        if(this.f1.health == 0){
            System.out.println(this.f2.name + " kazandı !");
            return true;
        }

        if(this.f2.health == 0){
            System.out.println(this.f1.name + " kazandı !");
            return true;
        }
        return false;

    }

    public Fighter determineFirstAttacker() {
        double randValue = Math.random();
        return randValue < 0.5 ? f1 : f2;
    }

}