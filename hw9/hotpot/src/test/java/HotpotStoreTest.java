import static org.junit.jupiter.api.Assertions.*;

class HotpotStoreTest {
    @org.junit.jupiter.api.Test
    public static void main(String[] args) {
        HotpotStore CDStore = new CDHotpotStore();
        HotpotStore CQStore = new CQHotpotStore();

        Hotpot hotpot = CDStore.orderHotpot("鸳鸯火锅");
        System.out.println("Ethan ordered a " + hotpot.getName() + "\n");

        hotpot = CDStore.orderHotpot("红油火锅");
        System.out.println("Joel ordered a " + hotpot.getName() + "\n");

        hotpot = CDStore.orderHotpot("羊肉火锅");
        System.out.println("Ethan ordered a " + hotpot.getName() + "\n");

        hotpot = CQStore.orderHotpot("红油火锅");
        System.out.println("Joel ordered a " + hotpot.getName() + "\n");
    }
}
