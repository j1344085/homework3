//========================================
//연봉을 숫자로 입력받은후, 소득세를 출력한.
//연 봉 1천 만 원 미 만 : 연 봉 의 9.5%
//연 봉 1천 만 원 이 상 ~ 4천 만 원 미 만 : 연 봉 의 19%
//연 봉 4천 만 원 이 상 ~ 8천 만 원 미 만 : 연 봉 의 28%
//연 봉 8천 만 원 이 상 : 연 봉 의 37%
//========================================


import java.util.*;
import java.io.*;
class B04{
  void input(){
                Scanner s = new Scanner(System.in);
                System.out.print("연봉을 원단위로 입력하세요 ");
                int sal = s.nextInt();
                
                double tax;
                if(sal < 10000000) tax = (double)sal*0.95;
                else if(sal >= 10000000 && sal < 40000000) tax = (double)sal*0.19;
                else if(sal >= 40000000 && sal < 80000000) tax = (double)sal*0.28;
                else tax = (double)sal*0.37;
                
                System.out.print("연봉 금액에 대한 소득세는 " + tax + "입니다.");
        }

  public static void main(String [] args){
                new B04().input();
        }
}
