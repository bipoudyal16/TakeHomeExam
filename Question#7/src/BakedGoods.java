public abstract class BakedGoods {

    int price;

    String description;
    
    String SellByDate;

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
    

    public abstract String getSellByDate(); 
}