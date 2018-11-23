package fr.formation.partiel1;

import java.util.Objects;

public class BankAccount {

    private String countryCode;

    private String controlKey;

    private String bankCode;

    private String bankCounter;

    private String accountNumber;

    private String bankAccountDetailsKey;

    public BankAccount(String countryCode, String controlKey, String bankCode, String bankCounter, String accountNumber,
	    String bankAccountDetailsKey) {
	this.countryCode = countryCode;
	this.controlKey = controlKey;
	this.bankCode = bankCode;
	this.bankCounter = bankCounter;
	this.accountNumber = accountNumber;
	this.bankAccountDetailsKey = bankAccountDetailsKey;
    }

    public String getBankCode() {
	return bankCode;
    }

    public void setBankCode(String bankCode) {
	Objects.requireNonNull(bankCode);
	this.bankCode = bankCode;
    }

    public String getBankCounter() {
	return bankCounter;
    }

    public void setBankCounter(String bankCounter) {
	Objects.requireNonNull(bankCounter);
	this.bankCounter = bankCounter;
    }

    public String getAccountNumber() {
	return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
	Objects.requireNonNull(accountNumber);
	this.accountNumber = accountNumber;
    }

    public String getBankAccountDetailsKey() {
	return bankAccountDetailsKey;
    }

    public void setBankAccountDetailsKey(String bankAccountDetailsKey) {
	Objects.requireNonNull(bankAccountDetailsKey);
	this.bankAccountDetailsKey = bankAccountDetailsKey;
    }

    public String getCountryCode() {
	return countryCode;
    }

    public void setCountryCode(String countryCode) {
	Objects.requireNonNull(countryCode);
	this.countryCode = countryCode;
    }

    public String getControlKey() {
	return controlKey;
    }

    public void setControlKey(String controlKey) {
	Objects.requireNonNull(controlKey);
	this.controlKey = controlKey;
    }

    public static boolean add(BankAccount bankAccount) {
	return false;
    }

}
