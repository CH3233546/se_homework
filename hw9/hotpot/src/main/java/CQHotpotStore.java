public class CQHotpotStore extends HotpotStore{
    Hotpot createHotpot(String item){
        if(item.equals("鸳鸯火锅")){
            return new CQStyleYYHotpot();
        }else if(item.equals("红油火锅")){
            return new CQStyleHYHotpot();
        }else if(item.equals("羊肉火锅")){
            return new CQStyleYRHotpot();
        }else return null;
    }


}
