import java.util.ArrayList;
public class ExamQ3Interface {
    public static void main(String[] args) {
         ArrayList<BakedGoods> list = new ArrayList<BakedGoods> ();
         Cookie s = new Cookie();
         s.description = "Cookie";
         s.price = 5;
         list.add(s);
         
         CinnamonRoll s2 = new CinnamonRoll();
         s2.description = "CinnamonRoll";
         s2.price = 3;
         list.add(s2);
         
         Brownie s3= new Brownie();
         s3.description = "Brownie";
         s3.price = 6;
         list.add(s3);
         
         for(int i=0;i<3;i++) {
        	 BakedGoods s4 = list.get(i);
        	 System.out.println("price: "+ s4.getPrice());
             System.out.println("description: "+ s4.getDescription());
             System.out.println("getSellByDate: "+s4.getSellByDate());
             System.out.println("");
         }
    }
}