

public class Point {
 private double x;
 private double y;

 public Point(double x, double y){
 this.x = x;
 this.y = y;
 }
    public double getX(){

     return x;
    }
    public double getY(){

     return y;
    }
    public void setX(double x){
     this.x = x;
    }
    public void setY(double y){
     this.y = y;
    }
    public double distance(Point secondPoint){
      double distance = 0;
      double xDifference = getX() - secondPoint.getX();
      double yDifference = getY() - secondPoint.getY();
      distance = Math.sqrt(Math.pow( xDifference, 2) + Math.pow(yDifference, 2));
      return distance;
 }
 public double distance(){
     double distance = 0;
     distance = Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2));
     return distance;
 }
    public static void main(String []args)
    {
        Point point1 = new Point(3,11);
        Point point2 = new Point(7, 5);
        System.out.println(point1.distance(point2));
    }
}

