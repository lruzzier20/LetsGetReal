public class Tester{
  public static void main(String[] args){
    RealNumber a = new RealNumber(100.0);
    RealNumber b = new RealNumber(101.0);
    System.out.println(a.equals(b));
    System.out.println(a.add(b));
    System.out.println(a.multiply(b));
    System.out.println(a.divide(b));
    System.out.println(a.subtract(b));
    RationalNumber c = new RationalNumber(0, 1);
    System.out.println(c);
  }
}
