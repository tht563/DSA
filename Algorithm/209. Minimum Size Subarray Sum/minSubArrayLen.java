import java.util.Scanner;
class Main {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        int targer = scanner.nextInt();
        String str =  scanner.nextLine();
        String[] array = str.split(" ");
        for (String i: array){
            System.out.println(i);
        }
        
    }

}