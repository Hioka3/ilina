package list2;

public class list2_7 {
    // вычисление длины гипотенузы по теореме Пифагора
        public static void main(String[] args) {
            double cathetus1, cathetus2, hypot;
            cathetus1=3; //длина первого катета
            cathetus2=4; //длина второго катета
            hypot=Math.sqrt((cathetus1*cathetus1)+(cathetus2*cathetus2));
            System.out.println(" длинна гипотенузы равна "+hypot);
        }//main(String[])
}//class HypotDemo
