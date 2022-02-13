public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || extraBuckets < 0||areaPerBucket<=0) {
            return -1;
        }
        double arearemaining = width * height - areaPerBucket * extraBuckets;
        if (arearemaining <= 0) {
            return 0;
        } else {
            int bucketsNeeded = (int) Math.ceil(arearemaining / areaPerBucket);
            return bucketsNeeded;
        }
    }
    public static int getBucketCount(double width,double height, double areaPerBucket) {
        if (width <=0 || height<=0||areaPerBucket<=0) {
            return -1;
        }
        int bucketsNeeded = (int) Math.ceil((width*height)/areaPerBucket);
        return bucketsNeeded;
    }
    public static int getBucketCount(double area,double areaPerBucket) {
        if (area<=0||areaPerBucket<=0) {
            return -1;
        }
        int bucketsNeeded = (int)Math.ceil(area/areaPerBucket) ;
        return bucketsNeeded;

    }
}
