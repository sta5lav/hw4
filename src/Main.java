public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1 () {
        int age = 21;
        if (age >= 18){
            System.out.println("Если возраст человека равен " + age + " , то он совершеннолетний");
        }

    }

    public static void task2 () {
        int summer = 10;
        int winter = -5;
        if(summer > 5){
            System.out.println("На улице " + summer + " градусов, можно идти без шапки");
        } if (winter < 5){
            System.out.println("На улице " + winter + " градусов, нужно надеть шапку");
        }
    }
    public static void task3 () {
        int fastSpeed = 80;
        int lowSpeed = 40;
        if(fastSpeed > 60){
            System.out.println("Если скорось " + fastSpeed + " , то придется заплатить штраф");
        } if (lowSpeed < 60){
            System.out.println("Если скорость " + lowSpeed + " , то можно ездить спокойно");
        }
    }
    public static void task4 () {
        int arina = 22;
        int stas = 25;
        int anna = 3;
        int masha = 8;
        if(anna > 2 && anna < 6){
            System.out.println("Если возраст человека равен " + anna +", то ему нужно ходить в детский сад");
        } if (masha > 7 && masha < 18){
            System.out.println("Если возраст человека равен " + masha +", то ему нужно ходить в школу");
        } if(arina > 18 && arina < 24) {
            System.out.println("Если возраст человека равен " + arina +", то его место в универститете");
        } if(stas > 18) {
            System.out.println("Если возраст человека равен " + stas + ", то ему пора ходить на работу");
        } else {
            System.out.println("Ты еще совсем мал");
        }
    }
    public static void task5 () {
        int arina = 4;
        int stas = 7;
        int anna = 17;
        if(arina < 5){
            System.out.println("Если возраст ребенка равен " + arina +", то ему нельзя кататься на аттракционе");
        } if (stas > 5 && stas < 14){
            System.out.println("Если возраст ребенка равен " + stas +", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        } if(anna > 14) {
            System.out.println("Если возраст ребенка равен " + anna +", то он может кататься без сопровождения взрослого");
        } else {
            System.out.println("Ты еще совсем мал");
        }
    }
    public static void task6 () {
        int trainWagon = 102;
        int placePerWagon = 60;
        int placePerWagonStand = trainWagon - placePerWagon;
        if(placePerWagon < 60 && placePerWagonStand == 42){
            System.out.println("В вагоне есть сидячие места");
        } else if(placePerWagon == 60 && placePerWagonStand < 42){
            System.out.println("В вагоне есть стоячие места");
        } else if(placePerWagon < 60 && placePerWagonStand < 42){
            System.out.println("В вагоне есть и сидячие места,  и стоячие места");
        } else {
            System.out.println("Вагон забит полностью");
        }
    }
    public static void task7 () {
        int one = 25;
        int two = 50;
        int three = 75;
        if(one > two && one > three){
            System.out.println(one);
        } if(two > one && two > three){
            System.out.println(two);
        }  else {
            System.out.println(three);
        }
    }
}