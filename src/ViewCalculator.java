import java.util.Scanner;

public class ViewCalculator{
    private IntСomputingСenter calculableFactory;

    public ViewCalculator(IntСomputingСenter calculableFactory) {
        this.calculableFactory = calculableFactory;
    }
    public void run() {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите первый аргумент: ");
            int primaryDEIArg = promptInt("Введите действительную часть: ");
            String primarZnak= promptString("Введите знак мнимой части: ");
            int primaryMnimArgs= promptInt("Введите мнимую часть: ");
            Calculable calculator = calculableFactory.create(primaryDEIArg,primaryMnimArgs,primarZnak, true);
            while (true) {
                String cmd = prompt("Введите команду (*, +, =) : ");
                if (cmd.equals("*")) {
                    System.out.println("Введите второй аргумент: ");
                    int DeiArg = promptInt("Введите действительную часть: ");
                    String argZnak=promptString("Введите знак мнимой части: ");
                    int MnimArg = promptInt("Введите мнимую часть: ");

                    calculator.multi(DeiArg,argZnak,MnimArg);
                    continue;
                }
                if (cmd.equals("+")) {
                    System.out.println("Введите второй аргумент: ");
                    int DeiArg = promptInt("Введите действительную часть: ");
                    String argZnak=promptString("Введите знак мнимой части: ");
                    int MnimArg = promptInt("Введите мнимую часть: ");

                    calculator.sum(DeiArg,argZnak,MnimArg);
                    continue;
                }
                if (cmd.equals("=")) {
                    String result = calculator.getResult();
                    System.out.println(result);
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
    private String promptString(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

}
