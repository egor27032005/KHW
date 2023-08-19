public class LoggerCalculator implements  Calculable{
    protected Calculable cals;
    Loggable calcLogger=new CalcLogger();

    public LoggerCalculator(Calculable cals){
        this.cals=cals;
        calcLogger.saveLog(""+cals.getResult());
    }
    public Calculable sum(int DeiArgs,String znak,int MnimArgs){
        calcLogger.saveLog(cals.getResult()+"+"+DeiArgs+znak+MnimArgs+"i");
        return this.cals.sum(DeiArgs,znak, MnimArgs);

    }
    public Calculable multi(int DeiArgs,String znak,int MnimArgs){
        calcLogger.saveLog(cals.getResult()+"+"+DeiArgs+znak+MnimArgs+"i");
        return this.cals.multi(DeiArgs,znak, MnimArgs);

    }
    public String getRes(int DeiArgs,String znak,int MnimArgs){
        String res1=Integer.toString(DeiArgs);
        String res2=Integer.toString(MnimArgs);
        String result=res1+znak+res2+"i";
        return result;
    }
    @Override
    public String getResult(){
        String result = this.cals.getResult();
        calcLogger.saveLog("="+result);
        return result;
    }

}
