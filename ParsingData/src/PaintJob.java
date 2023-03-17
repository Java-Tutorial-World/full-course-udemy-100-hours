public class PaintJob {

    public static void main(String[] args) {

    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBucketss){
        if (width <= 0 || height<=0 || areaPerBucket <=0 || extraBucketss < 0){
            return -1;
        }
            double toBuy = ( ((width * height) - (extraBucketss * areaPerBucket)) / areaPerBucket );
            return (int) Math.round(Math.ceil(toBuy));
    }

    public static int getBucketCount (double width, double height, double areaPerBucket){
        if( (width <= 0) || (height<= 0) || (areaPerBucket <= 0) ){
            return -1;
        }
        double toBuy = (width * height) / areaPerBucket;
        return (int) Math.round(Math.ceil(toBuy));
    }

    public static int getBucketCount (double area, double areaPerBucket){
        if ((area <= 0) || (areaPerBucket <=0)){
            return -1;
        }
        return (int) Math.round(Math.ceil(area / areaPerBucket));

    }
}
