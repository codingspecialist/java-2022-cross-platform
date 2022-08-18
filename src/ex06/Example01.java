package ex06;

public class Example01 {
	public static void main(String[] args) {
		int year = 2022;
		int month = 12;
		int day = 25;
		
		// (1) 1900.1.1 ~ 내가 원하는 날짜까지의 총 일수
		// - 윤달
		// 1년 365, 윤달이 있는 1년은 366일
		
		// (2) 일수 % 7 = 0(일), 1(월), 2(화), 3(수), 4(목), 5(금), 6(토)
		
		int totalDays;
		
		totalDays = (year - 1900) * 365; // 2021년까지의 일수 (윤달미포함)
		totalDays = totalDays + (year-1900)/4; // 2021까지의 일수 + 만약 2022년이 윤달이면 +1이 되어있는 상태
		// System.out.println((year-1)+"년까지의 총 일수 : "+totalDays);
		
		// 2022 - 1900 = 122 % 4 = 2
		if((year-1900)%4 == 0 && month < 3) {
			totalDays = totalDays - 1;
		}
		
		// 2022.2.25 -----> 2021년까지의 일수 + 2022년이 윤달이고 3월 이상이면 + 1
		
		// 2월 25일까지의 일수만 구하면 됨.
		
		// 31(1월), 28(2월), 31(3월), 30(4월), 31(5월), 30(6월), 31(7월), 31(8월), 30(9월)
		// 31(10월), 30(11월), 31(12월)
		
		if(month == 1) {
			totalDays = totalDays + day;
		}
		
		if(month == 2) {
			totalDays = totalDays + day + 31;
		}
		
		if(month == 3) {
			totalDays = totalDays + day + 31 + 28;
		}
		
		if(month == 4) {
			totalDays = totalDays + day + 31 + 28 + 31;
		}
		
		if(month == 5) {
			totalDays = totalDays + day + 31 + 28 + 31 + 30;
		}
		
		if(month == 6) {
			totalDays = totalDays + day + 31 + 28 + 31 + 30 + 31;
		}
		
		if(month == 7) {
			totalDays = totalDays + day + 31 + 28 + 31 + 30 + 31 + 30;
		}
		
		if(month == 8) {
			totalDays = totalDays + day + 31 + 28 + 31 + 30 + 31 + 30 + 31;
		}
		
		if(month == 9) {
			totalDays = totalDays + day + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
		}
		
		if(month == 10) {
			totalDays = totalDays + day + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
		}
		
		if(month == 11) {
			totalDays = totalDays + day + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
		}
		
		if(month == 12) {
			totalDays = totalDays + day + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
		}
		
		int dow = totalDays % 7;
		// System.out.println(dow);
		
		if(dow == 0) {
			System.out.println(year+"년 "+month+"월 "+day+"일은 일요일입니다.");
		}
		
		if(dow == 1) {
			System.out.println(year+"년 "+month+"월 "+day+"일은 일요일입니다.");
		}
		
		if(dow == 2) {
			System.out.println(year+"년 "+month+"월 "+day+"일은 월요일입니다.");
		}
		
		if(dow == 3) {
			System.out.println(year+"년 "+month+"월 "+day+"일은 화요일입니다.");
		}
		
		if(dow == 4) {
			System.out.println(year+"년 "+month+"월 "+day+"일은 수요일입니다.");
		}
		
		if(dow == 5) {
			System.out.println(year+"년 "+month+"월 "+day+"일은 목요일입니다.");
		}
		
		if(dow == 6) {
			System.out.println(year+"년 "+month+"월 "+day+"일은 금요일입니다.");
		}
		
	} // main 종료
}

















