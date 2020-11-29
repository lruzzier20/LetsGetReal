public class Tester{
  public static void main(String[] args){
    RealNumber a = new RealNumber(100.0);
    RealNumber b = new RealNumber(101.0);
    System.out.println(a.equals(b));
    System.out.println(a.add(b));
    System.out.println(a.multiply(b));
    System.out.println(a.divide(b));
    System.out.println(a.subtract(b));
    RationalNumber c = new RationalNumber(11, 33);
    System.out.println(c);
    System.out.println(c.getDenominator());
    System.out.println((c.reciprocal()).getNumerator());
    RationalNumber d = new RationalNumber(33, 11);
    System.out.println(c.equals(d));
    System.out.println(c.equals(d.reciprocal()));
    System.out.println(d);
    System.out.println(RationalNumber.gcd(20123132, 25632234));
    RationalNumber e = new RationalNumber(17, 100);
    RationalNumber f = new RationalNumber(2,5);
    System.out.println(e.multiply(f));
    System.out.println(f.divide(e));
    System.out.println(e.add(f));
    System.out.println(f.add(e));
    System.out.println(e.subtract(f));
    System.out.println(f.subtract(e));
    RationalNumber g = new RationalNumber(1, 0);
    System.out.println(e.multiply(g));
    a = new RealNumber(-Math.PI);
    b = new RealNumber(Math.PI);
    System.out.println("\n"+a.equals(b));
  }
}
