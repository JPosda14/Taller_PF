import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        ArrayList<Integer> newarrayList=new ArrayList<>(CollectionUtils.filldata(()->new Random().nextInt(1,3),11));
        ArrayList<String> stringArrayList=new ArrayList<>(CollectionUtils.filldata(()-> randomwords (3),10));
        ArrayList<Integer>newlist=new ArrayList<>(CollectionUtils.transformdata(value->value*value,newarrayList));
        ArrayList<Integer>newlist2=new ArrayList<>(CollectionUtils.newlist(value->value*value,newarrayList));
        System.out.println(newlist2);
        ArrayList<Integer>newlist3=new ArrayList<>(CollectionUtils.filterlist(newarrayList,value->value%2==0));
        Integer less=CollectionUtils.nonlist(newarrayList,(value1,value2)->value1-value2);
        System.out.println(newarrayList);
        System.out.println(less);
    }

    private static <T> T randomwords(int n) {ArrayList randomwords =new ArrayList();
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the number of words");
        int m = read.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the word: ");
            String word = read.next();
            randomwords.add(word);

        }
        int a = (int) (Math.random() * n);
        System.out.println("Value of a is: "+randomwords.get(a));
        return (T) randomwords;
    }



}