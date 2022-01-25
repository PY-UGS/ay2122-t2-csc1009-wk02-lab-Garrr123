//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
package Week1;
import java.util.Scanner;


public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("This is Garrick Low");
        String Input = myObj.nextLine();
        byte var4 = -1;
        switch(Input.hashCode()) {
            case 1772807352:
                if (Input.equals("CSC1006")) {
                    var4 = 1;
                }
                break;
            case 1772807353:
                if (Input.equals("CSC1007")) {
                    var4 = 3;
                }
                break;
            case 1772807354:
                if (Input.equals("CSC1008")) {
                    var4 = 4;
                }
                break;
            case 1772807355:
                if (Input.equals("CSC1009")) {
                    var4 = 0;
                }
                break;
            case 1772807377:
                if (Input.equals("CSC1010")) {
                    var4 = 2;
                }
        }

        switch(var4) {
            case 0:
                System.out.println("Object Oriented Programming");
                break;
            case 1:
                System.out.println("Mathematics2");
                break;
            case 2:
                System.out.println("Computer Networking");
                break;
            case 3:
                System.out.println("Operating System");
                break;
            case 4:
                System.out.println("Data Structure and Algorithm");
        }

        for(int i = 102; i >= 66; --i) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        myObj.close();

    }
}
