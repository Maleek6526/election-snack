package AccountProject;

import java.util.ArrayList;

public class BankRegistry {
    private ArrayList<MyBank> registeredBanks;

    public BankRegistry() {
        registeredBanks = new ArrayList<>();
    }

    public void registerBank(MyBank bank) {
        for (MyBank registeredBank : registeredBanks) {
            if (registeredBank.getBankName().equals(bank.getBankName())) {
                throw new IllegalArgumentException("Bank with name " + bank.getBankName() + " is already registered.");
            }
        }
        registeredBanks.add(bank);
    }

    public MyBank getBank(String bankName) {
        for (MyBank bank : registeredBanks) {
            if (bank.getBankName().equals(bankName)) {
                return bank;
            }
        }
        throw new IllegalArgumentException("No bank found with name: " + bankName);
    }

    public ArrayList<MyBank> displayRegisteredBanks() {
        return new ArrayList<>(registeredBanks);
    }
}
