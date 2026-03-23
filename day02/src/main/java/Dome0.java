import java.beans.DesignMode;

public class Dome0 {
    public static void main(String[] arg){
        int size =10;
        double [] myList = new double[size];
        myList[0]=1.1;
        myList[1]=1.1;
        myList[2]=1.1;
        myList[3]=1.1;
        myList[4]=1.2;
        myList[5]=1.1;
        myList[6]=1.1;
        myList[7]=1.1;
        myList[8]=1.1;
        myList[9]=1.1;
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += myList[i];
        }
        System.out.println("总和为： "+total);
    }

}
