public class RationalNumber extends Number{
  private int numerator;
  private int denominator;

  public RationalNumber(int nume, int deno){
    numerator=nume;
    denominator=deno;
    if(nume==0){numerator=0; denominator=1;}
    if(deno==0){numerator=0; denominator=1;}
    if(deno<0){numerator=-nume; denominator=-deno;}
    this.reduce();
  }

  public double getValue(){
    return (numerator*1.0)/denominator;
  }

  public int getNumerator(){
    return numerator;
  }

  public int getDenominator(){
    return denominator;
  }

  public RationalNumber reciprocal(){
    if(numerator==0){RationalNumber e = new RationalNumber(0, 1); return e;}
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
    if(a==0||b==0){return 1;}
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
    if(denominator<0){numerator=-numerator; denominator=-denominator;}
  }

  public RationalNumber multiply(RationalNumber other){
    RationalNumber f = new RationalNumber(numerator*other.getNumerator(), denominator*other.getDenominator());
    f.reduce();
    return f;
  }

  public RationalNumber divide(RationalNumber other){
    RationalNumber g = multiply(other.reciprocal());
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
