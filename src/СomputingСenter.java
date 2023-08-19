public class СomputingСenter implements IntСomputingСenter{
    public Calculable create(int number, boolean logFlag) {
        if (logFlag) {
            Calculable calculator =  new Calculator(number);
            return new LoggerCalculator(calculator);
        }
        return new Calculator(number);
    }
}
