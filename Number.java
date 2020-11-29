public abstract class Number{
  public abstract double getValue();

  public boolean equals(Number other){
    if(this.getValue()==0&&other.getValue()==0){return true;}
    if((Math.abs((other.getValue()-this.getValue())/this.getValue()))>0.00001){return false;}else{return true;}
  }

  public int compareTo(Number other){
    if(this.equals(other)){return 0;}
    if(this.getValue()<other.getValue()){return -1;}
    if(this.getValue()>other.getValue()){return 1;}
    return 2;
  }
}
