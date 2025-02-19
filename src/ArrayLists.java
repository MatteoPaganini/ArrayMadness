import java.util.ArrayList;


public class ArrayLists {

    int total;
    int averageNum;

    public static void main(String[] args) {
        System.out.println("Hello World");
        new ArrayLists();
    }

    ArrayList<Integer> list = new ArrayList<>();

    public ArrayLists(){
        System.out.println("Welcome to the world of ArrayLists!");

        list.add(0,1);
        list.add(1,1);
        list.add(2,1);
        list.add(3,45);

        for (int x = 0; x < 10; x++){
            list.add(52);
        }

        for (int x = 0; x <= 43; x++){
            list.add((int)(Math.random()*75)+7);
        }

        //list.clear();

        if (list.contains(2)){
            System.out.println("Boogaloo");
        }
        //todo : add 43 random numbers to the ArrayList from 7 to 81 inclusive
        //todo : create a method that gets the average element value


        printArrayList();

        //System.out.println(list.indexOf(52));


        System.out.println(avgArrayList());
    }

    public void printArrayList (){
        for (int a = 0; a < list.size(); a++){
            System.out.println(a + ":" + list.get(a));
        }
    }

    public double avgArrayList(){
        for (int b = 0; b < list.size(); b++){
            //System.out.println(list.get(b));
            total = total + list.get(b);
        }

        //System.out.println(total);
        averageNum = total/(list.size());

        return averageNum;
    }
}
