package com.ln.Thread;


import java.text.SimpleDateFormat;
import java.util.Date;

//模拟计时器。。
public class TestSleep2 {


   public static void main(String[] args) {
        try {
            tendown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


//        //打印当前系统时间
//        Date startTime = new Date(System.currentTimeMillis());
//
//        while (true) {
//            try {
//                Thread.sleep(1000);
//                System.out.println(new SimpleDateFormat("HH:mm:ss").format(startTime));
//                startTime = new Date(System.currentTimeMillis());//更新时间
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }

        public static void tendown() throws InterruptedException {
        int num = 30;
        while (true) {
            Thread.sleep(1000);
            System.out.println(num--);
                if (num<=30&&num>=15){
                    System.out.println("给我听个歌单，您考虑好没？=？");

                }else if(num>=1&&num<=14){
                    System.out.println("额  应该好了吧=_=");
                }else if(num==0){
                    System.out.println("那。。。。算了吧=_=||");
                }else{
                    break;
                }
        }
    }
}
