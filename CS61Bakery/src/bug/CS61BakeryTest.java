package bug;

import org.junit.Test;

import java.util.ArrayList;

import static com.google.common.truth.Truth.assertWithMessage;
import static com.google.common.truth.Truth.assertThat;
import static org.junit.Assert.*;

public class CS61BakeryTest {

    @Test
    public void restock() {
        CS61Bakery CS61B = new CS61Bakery(5, 4);
        CS61B.restock(2);
        assertWithMessage("incorrect stock").that(CS61B.getStock()).isEqualTo(7);
        assertThat(CS61B.getStock()).isEqualTo(7);
    }

    @Test
    public void buy() {
        CS61Bakery CS61B = new CS61Bakery(5, 4);
        assertThat(CS61B.buy(20)).isEqualTo(5);
    }

    @Test
    public void restockAndBuy() {
        CS61Bakery CS61B = new CS61Bakery(5, 4);
        assertThat(CS61B.restockAndBuy(5, 40)).isEqualTo(10);
    }

    @Test
    public void getMaxPurchase() {
        CS61Bakery CS61B = new CS61Bakery(10, 4);
        ArrayList<Integer> purchaseRecord = new ArrayList<>();
        CS61B.buy(4);
        purchaseRecord.add(1);
        assertEquals(purchaseRecord, CS61B.getPurchaseRecord());
        CS61B.restock(100);
        CS61B.buy(64);
        CS61B.buy(33);
        assertThat(CS61B.getMaxPurchase()).isEqualTo(16);
    }
}
