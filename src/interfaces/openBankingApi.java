package interfaces;

public interface openBankingApi {
    void checkBalance();
    void transferMoney(String from, String to, double amount);
}
