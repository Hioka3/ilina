package list2;

public class list2_10 {
        public static void  main(String [] args) {

            // Эти перемененые иницилизуруется константами
            double radius = 4; // радиус цилиндра
            double height = 5; // высота цилиндра

            // переменная volume иницилизируется динамически
            // вычисленным значением выражения
            double volume = 3.1416 * radius * radius * height;
            System.out.println("Объем цилиндра равен " + volume);

        } // main (String [] ) method
} // CylinderVolume class
