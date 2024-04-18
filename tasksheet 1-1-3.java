public class Main {
    public static void main(String[] args) {
        // Let's check numbers from 1 to 10
        for(int i = 1; i <= 10; i++){
            System.out.println(i + " is " + ((i%2==0) ? "even" : "odd"));
        }
    }
}
