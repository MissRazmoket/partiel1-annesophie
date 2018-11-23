package fr.formation.partiel1;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class TransfertTest {

    void ShoulConstruct() {
	Transfer transfer1 = new Transfer(425876.98, null, null);
	assertNotNull(transfer1);
    }

}

//void shoulNotConstruct() {
//    Transfer transfer1 = new Transfer(234.45,  )
//}