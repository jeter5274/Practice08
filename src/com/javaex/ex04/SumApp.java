package com.javaex.ex04;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요");
		String numLine = sc.nextLine();

		//코드를 작성하세요
		String[] inputNum = numLine.split(" ");	//문자열의 공백을 기준으로, 문자열배열로 나누어줌
		
		for(int i=0; i<inputNum.length; i++) {	//문자열 배열의 길이만큼 반복
			sum += Integer.parseInt(inputNum[i]);	//sum에 sum의 값 + i번방 문자열을 정수로 변환(parseInt)한 값 할당
		}
		
		System.out.println("합:" + sum);
		
		sc.close();
	}

}
