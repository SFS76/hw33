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
        int paperPerOne = Math.round (paper / (ludPal + annSer + ekaAnd));
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
        float wheitMilk = 105f / 100;
        byte icecream  = 2;
        int wheitIcecream = 100;
        byte egg  = 4;
        int wheitEgg = 70;
        float wheitBreakfast = (bananas * wheitBanan + milk * wheitMilk + icecream * wheitIcecream + egg * wheitEgg) / 1000;
        System.out.println("Общий вес спортизавтрака " + wheitBreakfast + " килограмм");
        //7
        float targetWheit  = 7.0f;
        float lostWheit1 = 0.25f;
        float lostWheit2 = 0.5f;
        float lostDay1 = targetWheit/lostWheit1;
        float lostDay2 = targetWheit/lostWheit2;
        float lostDayAvg = (lostDay1 + lostDay2) / 2;
        System.out.println("Если диета " + lostWheit1 + " кг в день, то потребуется " + lostDay1 + " дней");
        System.out.println("Если диета " + lostWheit2 + " кг в день, то потребуется " + lostDay2 + " дней");
        System.out.println("ЕИли в среднем потребуется " + lostDayAvg + " дней");
        //8
        float salaryMasha  = 67760f;
        float salaryDenis = 83690f;
        float salaryKris = 76230f;
        float growSalary = 0.1f;
        float salsryGrowYearMashsa = salaryMasha * 12 * growSalary;
        float salsryGrowYearDenis = salaryDenis * 12 * growSalary;
        float salsryGrowYearKris = salaryKris * 12 * growSalary;
        int salsryYearMashsa = Math.round (salaryMasha * 12 + salsryGrowYearMashsa);
        int salsryYearDenis = Math.round (salaryDenis * 12 + salsryGrowYearDenis);
        int salsryYearKris = Math.round (salaryKris * 12 + salsryGrowYearKris);
        System.out.println("Маша теперь получает " + salsryYearMashsa + " рублей. Годовой доход вырос на " + salsryGrowYearMashsa + " рублей");
        System.out.println("Денис теперь получает " + salsryYearDenis + " рублей. Годовой доход вырос на " + salsryGrowYearDenis + " рублей");
        System.out.println("Кристина теперь получает " + salsryYearKris + " рублей. Годовой доход вырос на " + salsryGrowYearKris + " рублей");
    }
}