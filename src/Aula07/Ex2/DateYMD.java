package Aula07.Ex2;

public class DateYMD extends Date {
    private int day;
	private int month;
	private int year;

	public DateYMD(int day, int month, int year) {
		this.set(day, month, year);
	}

	public void set(int day, int month, int year) {
		if( valid(day, month, year) ) {
			this.day = day;
			this.month = month;
			this.year = year;
		}
	}

	public void increment(int days) {
		while( days > 0 ) {
			if( this.day == monthDays(this.month, this.year) ) {
				this.day = 1;
				if( this.month == 12 ) {
					this.month = 1;
					this.year++; 
				} else {
					this.month++;
				}
			} else {
				this.day++;
			}
			days--;
		}
	}

	public void decrement(int days) {
		while( days > 0 ) {
			if( this.day == 1 ) {
				if( this.month == 1 ) {
					this.month = 12;
					this.year--; 
				} else {
					this.month--;
				}
				this.day = monthDays(this.month, this.year);
			} else {
				this.day--;
			}
			days--;
		}
	}

	public int getDay() { return this.day; }
	public int getMonth() { return this.month; }
	public int getYear() { return this.year; }

	public String toString() {
		return String.format("%04d-%02d-%02d", this.year, this.month, this.day);
	}
}
