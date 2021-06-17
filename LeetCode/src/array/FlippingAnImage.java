package array;

public class FlippingAnImage {

    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        flipAndInvertImage(image);
    }

//    public static int[][] flipAndInvertImage(int[][] image) {
//        for(int i=0; i<image.length; i++) {
//
//            int[] currentArray = image[i];
//
//            int start = 0;
//            int end = currentArray.length-1;
//            while (start<end) {
//                int startElement = currentArray[start];
//                currentArray[start] = currentArray[end];
//                currentArray[end] = startElement;
//                start++;
//                end--;
//            }
//
//            for(int x=0; x<currentArray.length; x++) {
//                if(currentArray[x]==0){
//                    currentArray[x] = 1;
//                } else {
//                    currentArray[x] = 0;
//                }
//            }
//        }
//        return image;
//    }

    public static int[][] flipAndInvertImage(int[][] image) {
        for(int i=0; i<image.length; i++) {
            int[] currentArray = image[i];
            int start = 0;
            int end = currentArray.length-1;
            while (start<end) {
                int startElement = currentArray[start];
                int endElement = currentArray[end];
                if(startElement == 0) {
                    currentArray[end] = 1;
                } else {
                    currentArray[end] = 0;
                }
                if(endElement == 0) {
                    currentArray[start] = 1;
                } else {
                    currentArray[start] = 0;
                }
                start++;
                end--;
            }
            if(currentArray.length % 2 == 1) {
                int mid = (start+end) / 2;
                if(currentArray[mid]==0){
                    currentArray[mid] = 1;
                } else {
                    currentArray[mid] = 0;
                }
            }
        }

        return image;
    }








}
