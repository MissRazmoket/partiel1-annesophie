package fr.formation.partiel1;

import java.time.LocalDateTime;
import java.util.Objects;

public class Transfer {

    private double amount;

    private LocalDateTime tranferAskedDate;

    private LocalDateTime transfertExécution;

    private BankAccount accountBankEmitter;

    private BankAccount accountCollector;

    public Transfer(double amount, BankAccount accountBankEmitter, BankAccount accountCollector) {
	this.amount = amount;
	this.accountBankEmitter = accountBankEmitter;
	this.accountCollector = accountCollector;
    }

    public double getAmount() {
	return amount;
    }

    public void setAmount(double amount) {
	this.amount = amount;
    }

    public LocalDateTime getTranferAskedDate() {
	return tranferAskedDate;
    }

    public void setTranferAskedDate(LocalDateTime tranferAskedDate) {
	Objects.requireNonNull(tranferAskedDate);
	this.tranferAskedDate = tranferAskedDate;
    }

    public LocalDateTime getTransfertExécution() {
	return transfertExécution;
    }

    public void setTransfertExécution(LocalDateTime transfertExécution) {
	Objects.requireNonNull(transfertExécution);
	this.transfertExécution = transfertExécution;

    }

    public boolean addBankAccount(BankAccount bankAccount) {
	Objects.requireNonNull(bankAccount);
	return BankAccount.add(bankAccount);
    }

}
