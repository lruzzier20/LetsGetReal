public abstract class Number{
  public abstract double getValue();

  public boolean equals(Number other){
    if(this.getValue()==0&&other.getValue()==0){return true;}
    if((Math.abs((other.getValue()-this.getValue()))/this.getValue())>0.00001){return false;}else{return true;}
  }
}
