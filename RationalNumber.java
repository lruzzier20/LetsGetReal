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
}
