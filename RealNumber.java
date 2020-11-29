public class RealNumber extends Number{
  private double value;

  public RealNumber(double v){
    value=v;
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+getValue();
  }

  public RealNumber add(RealNumber other){
    RealNumber a = new RealNumber(value + other.getValue());
    return a;
  }

  public RealNumber multiply(RealNumber other){
    RealNumber b = new RealNumber(value * other.getValue());
    return b;
  }

  public RealNumber divide(RealNumber other){
    RealNumber c = new RealNumber(value / other.getValue());
    return c;
  }

  public RealNumber subtract(RealNumber other){
    RealNumber d = new RealNumber(value - other.getValue());
    return d;
  }
}
