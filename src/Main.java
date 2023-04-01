public class Main {
        public static void main(String[] args) {
            System.out.println("Hello world!");
            task1();
            task2();
            task3();
            task4();
            task5();
            task6();
            task7();
            task8();


        }

    private static void task8() {
            System.out.println("Задача 8");
            int cometYear = 79;
            int currentYear = 2023;
            int previaus = 200;
            int next = 100;

            int start = currentYear - previaus;
            int finish = currentYear + next;

            for (int i = start; i <= finish; i++)
                if (i % cometYear ==0){
                    System.out.println(i);
                }
    }

    private static void task7() {
            System.out.println("Задача 7");
            int days = 31;
            int currentDay = 1;
            while (currentDay <= days) {
                System.out.println("Сегодня пятница" + currentDay + "Небходимо подготовить отчеи");
            }
        }

        private static void task6() {
            System.out.println("Задача 6");
            int years = 9;
            int percent =7;
            int deposit = 15000;
            int counter = 0;

            while (counter <= years *12){
                deposit = deposit + percent * deposit/100;
                counter++;
                if (counter % 6 == 0){
                    System.out.println("Месяц" + counter + "сумма накоплений равна" + deposit + "рублей");
                }

            }
        }

        private static void task5() {
            System.out.println( " Задача 5");
            int total = 12000000;
            int percet = 7;
            int deposit = 15000;
            int counter = 0;

            while (deposit <= total){
                deposit = deposit + percet * deposit/100;
                counter++;
                if (counter % 6 ==0){
                    System.out.println(" Месяц " + counter + "Сумма накоплений равна" + deposit + "рублей");
                }
            }
        }

        private static void task4() {
            System.out.println(" Задача 4");
            int total = 12000000;
            int percent = 7;
            int deposit = 15000;
            int couter = 0;

            while (deposit < total) {
                deposit = deposit + percent + deposit/100;
                couter++;
                System.out.println("месяц" + couter + "сумма накоплейний равна" + deposit + " рублей ");;
            }
        }


        private static void task3() {
            System.out.println(" Задача 3");{
                System.out.println(" Задача 4");
            }
            int population = 12000000;
            int birtRate = 17;
            int deatRate = 8;
            int period = 10;
            int counter = 5;

            while ( counter <= period){
                population = population + (birtRate - deatRate) * population /1000;
                System.out.println("Год " + counter + "численность населения составляет" + population);
            }
        }

        private static void task2() {
            System.out.println("Задача 2");
            int i = 1;
            while (i<=10){
                System.out.println(i + " ");
                i++;
            }
            System.out.println();
            for (i = 10; i > 0 ; i --){
                System.out.println(i + " ");
            }
        }

        private static void task1() {
            System.out.println(" Задача 1");
            int mani = 15000;
            int total = 0;
            int i = 0;
            total = 0;
            while ( total < 2_459_000) {
                System.out.println(i);
                i++;
                total = total + mani;
                System.out.println(" месяц " + i + "сумма накоплений равна" + total + "рублей");
            }
        }
    }
