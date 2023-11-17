package collections;

public class loops {
    static int[] tablicaliczb;
    public static void main(String[] args) {
        tablicaliczb = new int[3];
        tablicaliczb[0] = 10;
        tablicaliczb[1] = 20;
        tablicaliczb[2] = 30;
        /*for(int number : tablicaliczb) {
            System.out.println("Liczba: "+ number);
        }
        for(int i = 0; i < 3; i++){
            System.out.println("Liczba: "+ tablicaliczb[i]);
        }*/
        int liczba = 1;
        for(int i = 0; i < 100; i++ ){
            System.out.println("Counter: " + liczba);
            liczba++;
            if (liczba > 90){
                break;
            }
            else{
                System.out.println("To jest liczba");
            }
        }
        liczba = 0;
        while(liczba < 100){
            System.out.print("text ");
            ++liczba;
        }
    }
}
