public class RealNumber{
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

  public boolean equals(RealNumber other){
    if(value==0&&other.getValue()==0){return true;}
    if((Math.abs((other.getValue()-value))/value)>0.00001){return false;}else{return true;}
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
