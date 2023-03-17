public class FlourPacker {
    public static void main(String [] args){
        System.out.println(canPack(1,0,4));

    }


    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }

        int bigKilo = (bigCount * 5);
        int smallKilo = (smallCount * 1);
        int sumOfCount = ((bigCount * 5) + (smallCount * 1));
        int remainderOfCount = goal % 5;

        if ( sumOfCount >= goal && smallKilo >= remainderOfCount){
            return true;
        }else
//            return false;


        System.out.println("remainder of bag " + remainderOfCount);
        return false;
    }
}
