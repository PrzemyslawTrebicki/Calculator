package calctorepo.calctorepo;

public class Calculator {
    int firstNumber;
    int secondNumber;

    public Calculator(int firstNumber, int secondNumber){
        this.firstNumber=firstNumber;
        this.secondNumber=secondNumber;
    }
    public int Add(){
        return firstNumber+secondNumber;
    }
    public int Subtract(){
        return firstNumber-secondNumber;
    }
    public static void main(String args[]){
        Calculator calc = new Calculator(3,2);
        System.out.println("Suma liczb to: "+calc.Add());
    }
}
