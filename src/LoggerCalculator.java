public class LoggerCalculator implements  Calculable{
    protected Calculable cals;
    Loggable calcLogger=new CalcLogger();

    public LoggerCalculator(Calculable cals){
        this.cals=cals;
        calcLogger.saveLog(""+cals.getResult());
    }
    public Calculable sum(int args){
        calcLogger.saveLog(cals.getResult()+"+"+args);
        return this.cals.sum(args);

    }
    public Calculable multi(int args){
        calcLogger.saveLog(cals.getResult()+"*"+args);
        return this.cals.multi(args);

    }
    public Calculable division(int args){
        calcLogger.saveLog(cals.getResult()+"/"+args);
        return this.cals.division(args);

    }
    @Override
    public int getResult(){
        int result = this.cals.getResult();
        calcLogger.saveLog("="+result);
        return result;
    }

}
