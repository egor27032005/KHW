public class СomputingСenter implements IntСomputingСenter{
    public Calculable create(int deiNumber,int mnimNumber, String numberZnak, boolean logFlag) {
        if (logFlag) {
            Calculable calculator =  new Calculator(deiNumber,mnimNumber,numberZnak);
            return new LoggerCalculator(calculator);
        }
        return new Calculator(deiNumber,mnimNumber,numberZnak);
    }
}
