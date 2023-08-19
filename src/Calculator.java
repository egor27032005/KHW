public class Calculator implements Calculable {
    private int deiNumber;
    private int mnimNumber;

    private String numberZnak;
    private String result;

    public Calculator(int deiNumber, int mnimNumber, String numberZnak) {
        this.deiNumber = deiNumber;
        this.numberZnak = numberZnak;
        this.mnimNumber = mnimNumber;
        //this.result=result;
    }

    public void Calc(String result) {
        this.result = result;
    }

    @Override
    public Calculable sum(int DeiArgs, String znak, int MnimArgs) {
        deiNumber += DeiArgs;
        if (znak.equals("+") && numberZnak.equals("+")) {
            mnimNumber += MnimArgs;
        }
        if (znak.equals("-") && numberZnak.equals("-")) {
            mnimNumber += MnimArgs;
        }
        if (znak.equals("+") && numberZnak.equals("-")) {
            if (mnimNumber > MnimArgs)
                mnimNumber -= MnimArgs;
            else {
                mnimNumber = MnimArgs - mnimNumber;
                numberZnak = "-";
            }
        }
        if (znak.equals("-") && numberZnak.equals("+")) {
            if (mnimNumber > MnimArgs)
                mnimNumber -= MnimArgs;
            else {
                mnimNumber = MnimArgs - mnimNumber;
                numberZnak = "+";
            }
        }


        return this;
    }

    @Override
    public Calculable multi(int DeiArgs, String znak, int MnimArgs) {
        if (znak.equals(numberZnak)) {
            deiNumber = deiNumber * DeiArgs - mnimNumber * MnimArgs;
            mnimNumber = mnimNumber * DeiArgs + MnimArgs * deiNumber;
        } else {
            deiNumber = deiNumber * DeiArgs + mnimNumber * MnimArgs;
            if (numberZnak.equals("+")) {
                if (mnimNumber * DeiArgs > MnimArgs * deiNumber)
                    mnimNumber = mnimNumber * DeiArgs - MnimArgs * deiNumber;
                else {
                    mnimNumber = MnimArgs * deiNumber - mnimNumber * DeiArgs;
                    numberZnak = "-";
                }
            } else {
                if (mnimNumber * DeiArgs > MnimArgs * deiNumber)
                    mnimNumber = mnimNumber * DeiArgs - MnimArgs * deiNumber;
                else {
                    mnimNumber = MnimArgs * deiNumber - mnimNumber * DeiArgs;
                    numberZnak = "+";
                }
            }

        }
        return this;
    }

        @Override
        public String getResult () {
            String res1 = Integer.toString(deiNumber);
            String res2 = Integer.toString(mnimNumber);
            String result = res1 + numberZnak + res2 + "i";
            return result;


        }

    }

