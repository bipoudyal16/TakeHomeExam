import java.util.ArrayList;
public class ExamQ3Abstract {
    public static void main(String[] args) {
         ArrayList<SpaceShip> list = new ArrayList<SpaceShip> ();
         StarWarsShips s = new StarWarsShips();
         s.name = "StarWarsShips";
         s.tonnage = 1000;
         list.add(s);
         
         StarTrekShips s2 = new StarTrekShips();
         s2.name = "StarTrekShips";
         s2.tonnage = 8000;
         list.add(s2);
         
         OtherSciFiSpaceShips s3= new OtherSciFiSpaceShips();
         s3.name = "OtherSciFiSpaceShips";
         s3.tonnage = 5000;
         list.add(s3);
         
         for(int i=0;i<3;i++) {
             SpaceShip s4 = list.get(i);
             System.out.println("Name: "+ s4.getName());
             System.out.println("Tonnage: "+ s4.getTonnage());
             System.out.println("getFranchise: "+s4.getFranchise());
             System.out.println("");
         }
    }
}