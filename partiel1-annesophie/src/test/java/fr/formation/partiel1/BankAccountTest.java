package fr.formation.partiel1;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class BankAccountTest {

    @Test
    void ShoulConstruct() {
	BankAccountTest BankAccountTest1 = new BankAccountTest();
	assertNotNull(BankAccountTest1);
    }
}
