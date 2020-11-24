public class RationalNumber extends RealNumber{
  private int numerator;
  private int denominator;

  public RationalNumber(int nume, int deno){
    super(0.0);
    numerator=nume;
    denominator=deno;
    if(deno==0){numerator=0; denominator=1;}
    if(deno<0){numerator=-nume; denominator=-deno;}
  }

  public double getValue(){
    return 0.0;
  }

  public double getNumerator(){
    return numerator;
  }

  public double getDenominator(){
    return denominator;
  }

  public RationalNumber reciporical(){
    RationalNumber e = new RationalNumber(denominator, numerator);
    return e;
  }

  public boolean equals(RationalNumber other){
    if(numerator==other.getNumerator()&&denominator==other.getDenominator()){return true;}
    return false;
  }
}
