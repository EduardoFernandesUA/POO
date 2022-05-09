package Aula07.Ex2;

abstract class Date {
    public static boolean validMonth(int month) {
		return month>=1 && month <=12;
	}

	public static int monthDays(int month, int year) {
		if( month == 2 ) {
			return 28 + (leapYear(year) ? 1 : 0);
		} else if( month==1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			return 31;
		} else {
			return 30;
		}
	}

	public static boolean leapYear(int year) {
		return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
	}

	public static boolean valid(int day, int month, int year) {
		if( month < 1 || month > 12 ) return false;
		int maxMonthDays = monthDays(month, year);
		if( day < 1 || day > maxMonthDays ) return false;
		return true;
	}
}
