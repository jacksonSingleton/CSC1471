public class CalcArea{
    public double triangleArea(double height, double base){
        return (0.5 * height * base);    
    }
    public double rectArea(double width, double height){
        return (width * height);
    }
    public double circArea(double radius){
        return (Math.PI * radius * radius);
    }
}
