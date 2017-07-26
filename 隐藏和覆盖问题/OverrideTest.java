class AAA {
    int ivar = 6;
     
    public void noise() {
        System.out.println("a a a ....");
    }
}
 
class BBB extends AAA {
    int ivar = 8;    //没有这句，main()里边打印出来的是 6
     
    public void noise() {
        System.out.println("b b b ....");
    }
}
 
public class OverrideTest {
     
    public static void main(String args[]) {
        BBB b = new BBB();
         
        b.noise();
        System.out.println("ivar = " + b.ivar);
		
		System.out.println("------------");
		AAA c = new BBB();
		BBB a = (BBB)c;
		c.noise();
		System.out.println("ivar = " + a.ivar);
    }
 
}