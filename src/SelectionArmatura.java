import java.util.Scanner;

public class SelectionArmatura {
        public void main(String[] args){

            Scanner scan = new Scanner(System.in);
            System.out.println("Введите диаметр клапана ");
            int dn = scan.nextInt();
            System.out.println("Введите номинальное давление бар ");
            int pn = scan.nextInt();

            System.out.println("Для DN" + dn + ", PN " + pn + " назначение " + " выбюраны следующие позиции:");


            System.out.println(car(1,2,5));
        }
        public int car (int a, int b, int c){
              return car(a + b, b = c, c = 1);
        }
}

