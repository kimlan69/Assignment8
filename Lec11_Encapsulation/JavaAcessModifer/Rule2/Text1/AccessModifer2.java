
package Lec11_Encapsulation.JavaAcessModifer.Rule2.Text1;


public class AccessModifer2 extends AccessModifer  {
    public void display() {

        System.out.println(df);
        System.out.println(pro);
        System.out.println(pbl);
    }

    public static void main(String[] args) {
        AccessModifer2 b = new AccessModifer2();
        b.display();
    }
}


