package com.aquarius;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSearch {
	public static void main(String args[]) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("물병자리", 1234));
		list.add(new Student("사수자리", 5678));
		list.add(new Student("행복이", 9112));
		
		Scanner scanner = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("계속 검색을 하겠습니까? y / 종료하고 싶으면 n");

			String inputYorN = scanner.next();
			if(inputYorN.equals("y")) {
				System.out.println("검색을 시작합니다.");
				System.out.println("검색하고 싶은 학생 이름을 입력하세요");
				String inputName = scanner.next();
				
				boolean flag = false;
				
				for(Student student : list){
					if(student.getName().equals(inputName)){
						System.out.println(student.getName() + " 학생의 학번은" + student.getNo());
						flag = true;
					}
				}
				
				System.out.println("flag" + flag);
				if(!flag) {
					System.out.println(inputName + "학생이름이 없습니다");
				}			
			} else if(inputYorN.equals("n")) {
				System.out.println("종료되었습니다");
				break;
			}
		}
		
		
	}	
}


