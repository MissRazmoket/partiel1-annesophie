package fr.formation.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import fr.formation.partiel1.BankAccount;
import fr.formation.partiel1.Transfer;

@Path("/transfer")
@Produces(MediaType.APPLICATION_JSON)

public class TransferController {

    private static BankAccount accountBankEmitter1 = new BankAccount("FR", "33", "34765", "00657", "4356794532T", "25");
    private static BankAccount accountBankCollector1 = new BankAccount("FR", "33", "74895", "10657", "4896794532B",
	    "25");
    private static Transfer transferOne = new Transfer(456983.98, accountBankEmitter1, accountBankCollector1);

    private static BankAccount accountBankEmittert2 = new BankAccount("FR", "33", "34765", "00657", "5356794532Z",
	    "25");
    private static BankAccount accountBankCollector2 = new BankAccount("FR", "33", "14895", "18657", "8896794532B",
	    "25");

    private static Transfer transferTwo = new Transfer(6983.13, accountBankEmittert2, accountBankCollector2);

    private static BankAccount accountBankEmittert3 = new BankAccount("FR", "33", "34765", "00657", "5356794532Z",
	    "25");
    private static BankAccount accountBankCollector3 = new BankAccount("FR", "33", "14895", "18657", "8896794532B",
	    "25");

    private static Transfer transferThree = new Transfer(983.68, accountBankEmittert3, accountBankCollector3);

    private static List<Transfer> transfers = new ArrayList<>();

    static {
	transfers.add(transferOne);
	transfers.add(transferTwo);
	transfers.add(transferThree);
    }

    @Path("/lasttransfer")
    @GET
    // Display last transfer
    public Transfer lastTransfert() {
	return transferOne;
    }

    @Path("/transferlist")
    @GET
    // Display last transfer
    public List<Transfer> displayTransfers() {
	return transfers;
    }

}
