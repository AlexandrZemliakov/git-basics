import java.util.Scanner;

public class SelectionArmatura {
        public static void main (String[] args){

            Scanner scan = new Scanner(System.in);
            System.out.println("Введите диаметр клапана ");
            int dn = scan.nextInt();
            System.out.println("Введите номинальное давление бар ");
            int pn = scan.nextInt();

            System.out.println("Для DN" + dn + ", PN " + pn + " назначение " + " выбюраны следующие позиции:");


        }
}
