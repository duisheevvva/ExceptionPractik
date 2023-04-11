import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyException, MyException2 {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1=new Scanner(System.in);
        Creat creat = new Creat();
        try {
            System.out.println("    Please, enter data for registration   ");
            creat.setName(scanner.nextLine());
            creat.setLastName(scanner.nextLine());
            creat.setAge(scanner1.nextInt());
//            String s = new Scanner (System.in).nextLine();
//            creat.setEmail(s);
//            String a = new Scanner (System.in).nextLine();
//            creat.setPassword(a);
//            System.out.println(creat.toString());
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

            try {
                creat.setEmail(scanner.nextLine());
            } catch (MyException2 e1) {
                System.out.println(e1.getMessage());
            }

            try {
                creat.setPassword(new Scanner(System.in).nextLine());

            } catch (MyException3 e2) {
                System.out.println(e2.getMessage());
            }

        }


    }

