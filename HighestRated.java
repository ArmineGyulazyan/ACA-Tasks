import java.util.ArrayList;
public abstract class HighestRated {
 public abstract String getTitle();
 public abstract double getRate();

 public static double maxRate(ArrayList<HighestRated> h){
     double max = 11;
     int i= 0;
     while(i< h.size()){
         if(h.get(i) instanceof Movie){
             if(h.get(i).getRate()>max)
                 max = h.get(i).getRate();
         }
         i++;
     } return max;
 }
    public static void printmaxRate(ArrayList<HighestRated> h){
     System.out.println("The Movies and Cartoons that have the highest rates are ");
     double maxrate = maxRate(h);
     int j = 1;
     int i = 0;
        while(i< h.size()){
            if(h.get(i) instanceof Movie){
                if(h.get(i).getRate() == maxrate)
                    System.out.println(j++ + "  " + h.get(i).getTitle());
            }
            i++;
        }
    }


public static void main(String args[]){
    ArrayList<HighestRated> list = new ArrayList<>();
    list.add(new Cartoon("Beauty and the Beast", 10));
    list.add(new Cartoon("Lorax", 10));
    list.add(new Cartoon("Dispicable Me", 9));
    list.add(new Cartoon("The Little Mermaid", 7));
    list.add(new Cartoon("Coco", 8));
    list.add(new Cartoon("Zootopia", 6));
    list.add(new Movie("Hunger Games", 7));
    list.add(new Movie("Secret", 10));
    list.add(new Movie("Mona Lisa Smile", 9));
    list.add(new Movie("Philadelphia", 8));
    list.add(new Movie("Welcome", 6));
 }
}
