public class BankAccount {
   private double amount;

    public double getAmount() {
        System.out.print("Ваш счет:");
        return amount;
    }

    public void deposit(double sum) throws LimitException {
        if (sum > 60000){
            throw new LimitException("Выше 60000 положить нельзя", amount);
        }else{
            amount+=sum;
        }
    }

    public void withDraw(int sum) throws LimitException {
        if (sum > amount){
            throw new LimitException("На счету не хватает денег!!!", amount);
        }else{
            amount-=sum;
        }
    }
}
