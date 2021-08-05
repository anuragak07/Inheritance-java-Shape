public class Rectangle {
   private int Length;
   private int breadth;
    public Rectangle(int Length,int breadth){
        this.Length = Length;
        this.breadth=breadth;
    }
    public void calculateArea(){
        int area =Length*breadth;
        System.out.println(area);
    }
    public void calculatePerimeter(){
        int perimeter = 2*(Length + breadth);
        System.out.println(perimeter);
    }

}
