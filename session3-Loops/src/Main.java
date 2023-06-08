import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Loop
        //Vòng lặp for ...!
        for(int i = 0; i < 10;i++){
            System.out.println("gia tri cua i :" + i);
        }
        int[] arr = {1,2,3,4,5};
        for (int number: arr){
            System.out.println("number" + number);
        }
        //vong lặp while
        int so = 0;
        boolean check = true;
        while (check){
            System.out.println("vòng lặp vẫn hoạt động");
            if (so >= 10){
                check = false;
            }
            so++;
        }
        Scanner sc = new Scanner(System.in);
        //do...while
//        int number = 0;
//        do {
//            System.out.println("hay nhap vao 1 so tu nhien");
//            number = Integer.parseInt(sc.nextLine());
//            System.out.println("so ban vua nhap " + number);
////            if(number == 9){
////                break;
////            }
//            if (number > 5){
//                continue;
//            }
//
//        }while (number !=10);
        //các mệnh đề break / cpntinue

        //bài thực hành kiểm tra số nguyên tố
        System.out.println("hay nhap vao so nguyen to");
        int snt = Integer.parseInt(sc.nextLine());
        boolean flag = true;
        if(snt < 2){
            flag = false;

        }
        for(int i = 2; i<snt; i++){
            if(snt%i == 0){
                System.out.println("so" + snt + "khong phai so nguyen to");
                break;
            }

            }
        if (check) {
            System.out.println("");
        }
        }
    }

