package ex05_enum;

public enum Weekday {
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,
	SUNDAY;
	
	String day;
	
	private Weekday(String day) {
		this.day = day;
	}
}
