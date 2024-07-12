package hw33;
public class Main {
    public static void main(String[] args) {
        //1
        byte dog = 8;
        float cat = 3.6f;
        int papy = 763789;
        double friend = 1924342.34142;
        short frog = 232;
        long fox = 46464645645L;
        //2
        byte val1 = 67;
        short val2 = -159;
        short val3 = 569;
        int val4 = 27897;
        long val5 = 987678965549L;
        float val6 = 27.12f;
        double val7 = 2.786;
        //3
        byte ludPal = 23;
        byte annSer = 27;
        byte ekaAnd = 30;
        int paper = 480;
        float paperPerOne = (float) (ludPal + annSer + ekaAnd) / paper;
        System.out.println("На каждого ученика рассчитано " + paperPerOne + " листов бумаги");
        //4
        byte efficiencyPerTwoMinutes  = 16;
        int efficiencyPer20Minutes = efficiencyPerTwoMinutes * 20 / 2;
        System.out.println("За 20 минут машина произвела " + efficiencyPer20Minutes + " штук бутылок");
        int efficiencyPerDay = efficiencyPerTwoMinutes * 60 * 24 / 2;
        System.out.println("За сутки машина произвела " + efficiencyPerDay + " штук бутылок");
        int efficiencyPer3Day = efficiencyPerTwoMinutes * 60 * 24 * 3 / 2;
        System.out.println("За 3 дня машина произвела " + efficiencyPer3Day + " штук бутылок");
        int efficiencyPerMonth = efficiencyPerTwoMinutes * 60 * 24 * 30 / 2;
        System.out.println("За месяц машина произвела " + efficiencyPerMonth + " штук бутылок");
        //5
        byte allPots  = 120;
        int klasses = allPots / 6;
        int whitePots  = klasses * 2;
        int brownPots  = klasses * 4;
        System.out.println("В школе, где " + klasses + " классов, нужно " + whitePots + " банок белой краски и " + brownPots + " банок коричневой краски");
        //6
        byte bananas  = 5;
        int wheitBanan = 80;
        int milk  = 200;
        float wheitMilk = 105 / 100;
        byte icecream  = 2;
        int wheitIcecream = 100;
        byte egg  = 4;
        int wheitEgg = 70;
        float wheitBreakfast = (bananas * wheitBanan + milk * wheitMilk + icecream * wheitIcecream + egg * wheitEgg) / 1000;
        System.out.println("Общий вес спортизавтрака " + wheitBreakfast + " килограмм");

    }
}