public class Main {
    public static void main(String[] args) {

        for (int i =1 ; i < 5; i++){
            System.out.println(i);
        }

        int j =1;
        while (j <= 5){
            if (j >5){
                break;
            }
            System.out.println(j + " is while loop");
            j++;
        }

    }
}