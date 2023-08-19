public class Calculator implements Calculable{
    private int number;

    public Calculator(int number) {
        this.number = number;
    }

    @Override
    public Calculable sum(int args){
        number+=args;
        return this;
    }
    @Override
    public Calculable multi(int args){
        number *=args;
        return this;

    }
    @Override
    public Calculable division(int args){
        number=(int)Math.floor(number/args);
        return this;
    }
    @Override
    public int getResult(){
        return number;
    }

}
