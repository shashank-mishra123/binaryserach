package dsa.java;

 class  binarysearch {
    public static void main(String[] args) {
        int [] arr={1,2,3,9,5,6};
        int mid =0;
        int srt=0;
        int end = arr.length-1;
        int target=5;
        for (int i=1;i<end-1;i++)
        {
            mid =(srt+end)/2;
                if (arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]) {
                    System.out.println(arr[mid]);
                    break;
                }
             else if (arr[mid]>arr[mid-1]&&arr[mid]<arr[mid+1])
                {   srt=mid;
            }
            else end=mid;
        }
    }
}
