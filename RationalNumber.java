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

  public int getNumerator(){
    return numerator;
  }

  public int getDenominator(){
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

  public String toString(){
    return ""+numerator+"/"+denominator;
  }

  public static int gcd(int a, int b){
    int bigger=0;
    int smaller=0;
    int ans=0;
    int r=0;
    boolean limiter=true;
    if(a>b){bigger=a; smaller=b;}else{bigger=b; smaller=a;}
    for(int i=0;limiter;i++){
      r=bigger%smaller;
      if(r==0){ans=smaller; limiter=false;}else{
        bigger=smaller;
        smaller=r;
      }
    }
    return ans;
  }

  private void reduce(){
    int gcd=gcd(numerator, denominator);
    numerator=numerator/gcd;
    denominator=denominator/gcd;
  }

  public RationalNumber multiply(RationalNumber other){
    RationalNumber f = new RationalNumber(numerator*other.getNumerator(), denominator*other.getDenominator());
    f.reduce();
    return f;
  }

  public RationalNumber divide(RationalNumber other){
    RationalNumber g = multiply(other.reciporical());
    return g;
  }

  public RationalNumber add(RationalNumber other){
    int d=denominator*other.getDenominator();
    int n=(numerator*other.getDenominator()) + (other.getNumerator()*denominator);
    RationalNumber h = new RationalNumber(n, d);
    h.reduce();
    return h;
  }

  public RationalNumber subtract(RationalNumber other){
    int d=denominator*other.getDenominator();
    int n=(numerator*other.getDenominator()) - (other.getNumerator()*denominator);
    RationalNumber i = new RationalNumber(n, d);
    i.reduce();
    return i;
  }
}
