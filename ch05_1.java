package Ch05;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ch05_1 {
	public static void main(String[] args) {
		
	}
}

// -------------------------------------------------------------------------------------
// Ch5_Question 1.一維陣列 {84.0, 94, 79.9, 90.5, 82.4, 65,7, 72.8, 99.0, 85.2, 100}

// double a[] = { 84.0, 94, 79.9, 90.5, 82.4, 65.7, 72.8, 99.0, 85.2, 100 };//
// 10
//
// double sum = 0, avg = 0, m = 0;
// for (int i = 0; i < a.length; i++) {
// sum += a[i];
// avg = sum / a.length;
// }
//
// System.out.println("陣列a加總:" + sum);
// System.out.println("陣列a平均:" + avg);
// System.out.print("大於平均的有:");
//
// for (double x : a) {
// if (x > avg) {
//
// System.out.print(x + " ");
// }
//
// }
// -------------------------------------------------------------

//// Question 2 隨機產生1~42個數 隨機取6個 不重複
// int a[] = new int[6];
//
// int max = 6;
// for (int i = 0; i < a.length; i++) {
// int x = (int) (Math.random() * max) + 1;
// boolean keepRandom = true;
// while (keepRandom) {
// boolean isNotSame = true;
// x = (int) (Math.random() * max) + 1;
//
//
// for (int j = 0; j < a.length; j++) {
// if (a[j] == x) {
// isNotSame = false; // 因為這行在break之前 還會做
// break;
// }
// System.out.println("");// break發生的話 不做這行
// }
// // 問程式 這次的亂數 有沒有一樣的
// if (isNotSame) {
// // 表示本次長出來的數沒有一樣的 就中斷專門生產亂數的while迴圈
// keepRandom = false;
// }
// }
//
// a[i] = x;
// }
//
// for (int q = 0; q < a.length; q++) {
//
// System.out.println(a[q] + " ");
// }
// -----------------------------------------------------
//Ch5_Question.3	
//int  yyyy=2100, mm=12, dd=31;
//
//Scanner scan = new Scanner(System.in);
//
//System.out.println("請輸入年、月、日");
//if(scan.hasNextInt()){
//	yyyy = scan.nextInt();
//}
//if(scan.hasNextInt()){
//	mm = scan.nextInt();
//}
//if(scan.hasNextInt()){
//	dd = scan.nextInt();
//}
//
//Calendar calIn = Calendar.getInstance();
//Calendar cal = Calendar.getInstance();
//calIn.set(yyyy, mm-1, dd);
//cal.set(yyyy, 0, 0);
//
//long day = (calIn.getTimeInMillis()-cal.getTimeInMillis())/(1000*3600*24) ;
//
//System.out.println("haha= "+ day);
//------------------------------------------------------
// Question 4 有a,e,i,o,u的有幾個
//
// String[] ca = { "snoopy", "micky", "lucky", "kitty", "derby" };
// int sum = 0;
// for (int i = 0; i < ca.length; i++) {
// for (int j = 0; j < ca[i].length(); j++) {
// switch (ca[i].charAt(j)) {
//
// case 'a':
// case 'e':
// case 'i':
// case 'o':
// case 'u':
//
// sum++;
// break;
//
// }
// }
// }
//
// System.out.println(sum);
// ----------------------------------------------------
// Q5 計算計算每一橫 加總 每一行家總
// int [][] test = {
// {10,35,40,100,90,85,75,70}, //length 6
// {37,75,77,89,64,75,70,95},
// {100,70,79,90,75,70,79,90},
// {77,95,70,89,60,75,85,89},
// {98,70,89,90,75,90,89,90},
// {90,80,100,75,50,20,99,75}
// };
// int sum = 0 ;
// for (int i = 0 ; i < test.length ; i++) {
// sum = 0 ;
// for(int j = 0 ;j < test[i].length; j++ ) { //test[i]length 就是test二維陣列的第i個元素
// sum += test[i][j];
// }
// System.out.println("第"+ i + "列的加總:" + sum );
// }
// System.out.println("===========================================");
// for (int x = 0 ; x < test[0].length ; x++) { //length 8
// sum= 0 ;
// for(int y = 0; y < test.length ; y++) {
// sum += test[y][x];
// }
//
// System.out.println("第"+ x + "欄的加總為" + sum );
//
//
// }


