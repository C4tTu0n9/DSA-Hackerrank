package Day9;

import java.util.*;

public class JavaMap_PhoneBook {

    public static void main(String[] args) {
        Map<String,Integer> phoneBook = new HashMap<String,Integer>();
        Scanner in = new Scanner(System.in);
        System.out.println("Number of people: ");
        int n=in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            System.out.println("People "+(i+1)+": ");
            System.out.print("Name: ");
            String name=in.nextLine();
            System.out.print("Phone: ");
            int phone=in.nextInt();
            phoneBook.put(name,phone);
            in.nextLine();
        }
        for(Map.Entry<String,Integer> entry:phoneBook.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        List<String> list = new ArrayList<>();
        while(in.hasNext())
        {
            System.out.println("Search Phone by Name: (input exit for exiting!)");
            String s=in.nextLine();
            if(s.equals("exit")){
                break;
            }
            System.out.println("Result: ");
            if(phoneBook.containsKey(s)) {
                System.out.println(s+"="+phoneBook.get(s));
            }
            else{
                System.out.println("Not found");
            }

        }
    }
}
