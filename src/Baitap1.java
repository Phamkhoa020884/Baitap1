public class Baitap1 {
    public static void main(String[] args) {

//    int total =100000;
        //nếu total lớn hơn 100k=> giảm 10%
        //nếu total bé hơn 500k và lớn hơn 200k=> giảm 15%
        //nếu total lớn hơn 500k=> giảm 20%
        int total =80000 ;
        if( total>= 500000){
            System.out.println("Giảm giá 20%");
            System.out.println("Giá là:"+ total*0.8);
        }else if(total>=200000){
            System.out.println(" Giảm giá 15%");
            System.out.println(" Giá là: "+ total*0.85);
        }else if(total>=100000) {
            System.out.println("Giảm giá 10%");
            System.out.println("Giá là: " + total * 0.9);
    }
        else {
            System.out.println("Giá không giảm");
            System.out.println("Giá là:" + total);
        }
    }
}
