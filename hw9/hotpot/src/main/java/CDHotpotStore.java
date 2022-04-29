public class CDHotpotStore extends HotpotStore{
    Hotpot createHotpot(String item){
        if(item.equals("鸳鸯火锅")){
            return new CDStyleYYHotpot();
        }else if(item.equals("红油火锅")){
            return new CDStyleHYHotpot();
        }else if(item.equals("羊肉火锅")){
            return new CDStyleYRHotpot();
        }else return null;
    }
}
