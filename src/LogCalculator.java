public class LogCalculator  implements Loggable{
    @Override
    public void saveLog(String message){
        System.out.println("Log"+message);
    }
}
