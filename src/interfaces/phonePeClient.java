package interfaces;

public class phonePeClient {

    public static void main(String[] args) {
        openBankingApi openBankingApi = new iciciBankApi();

        openBankingApi.checkBalance();

        openBankingApi.transferMoney("Alok", "Aswin", 1000);
    }
}