//火锅店
public abstract class HotpotStore{
    abstract Hotpot createHotpot(String item);

    public Hotpot orderHotpot(String type) {
        Hotpot hotpot = createHotpot(type);
        System.out.println("===Making a"+hotpot.getName()+"===");
        hotpot.prepare();
        hotpot.boilSoup();
        hotpot.prepareCuisine();
        hotpot.serve();
        return hotpot;
    }

}

