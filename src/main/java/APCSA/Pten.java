package APCSA;
import java.util.*;
import java.util.Random;
import java.util.ArrayList;
public class Pten{

    private ArrayList<Integer> array1;
    private ArrayList<Integer> array2;
    private Random num;
    public Pten()
    {
        num = new Random();
        array1 = new ArrayList<Integer>(10);
        array2 = new ArrayList<Integer>(10);
    }
    public ArrayList getArr()
    {
        for(int i = 1; i < array1.size()+1 ; i++)
        {
            array1.add(i);
        }
        return array1;
    }
    public ArrayList randArr()
    {
        for(int i = 0 ; i < 10 ; i++)
        {
            int randNum = num.nextInt(array1.size())+1;
            array1.add(array1.get(randNum));
            array1.remove(array1.get(randNum));
        }
        return array2;
    }

    public String toString()
    {
        String output = "The Randomized Array is";
        output+=array2;
        return output;
    }


    public static void main(String[] args) {
        Pten seqObj = new Pten();
        seqObj.getArr();
        seqObj.randArr();
        System.out.println(seqObj.toString());


    }
}

