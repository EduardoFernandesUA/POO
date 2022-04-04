package Aula05;

public class Calendar {
	private int year;
	private int weekDay;

	Calendar(int year, int weekDay) {
		assert weekDay>=1 && weekDay<=7;
		this.year = year;
		this.weekDay = weekDay;
	}

	public int year() {
		return this.year;
	}

	public int firstWeekdayOfYear() {
		return this.weekDay;
	}

	public int firstWeekdayOfMonth(int month) {
		assert month>=1 && month<=12;

		int totalDays = 0;
		for (int i = 1; i < month; i++) {
			totalDays += Date.monthDays(i, this.year);
		}
		return (totalDays + this.weekDay-1) % 7 + 1;
	}

	public String printMonth(int month) {
		assert month>=1 && month<=12;
		return makeWeakCalendar(month, firstWeekdayOfMonth(month));
	}

	public String toString() {
		String r = "";
		for (int i = 1; i <= 12; i++) {
			r += printMonth(i);
		}
		return r;
	}

	private String makeWeakCalendar(int month, int weekDay) {
		String[] monthNames = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

		String r = "\n";

		String header = monthNames[month-1] + " " + this.year;
		for(int i = 0; i < (20-header.length())/2 ; i++) {
			r += " ";
		}
		r += header + "\n";

		r += "Su Mo Tu We Th Fr Sa\n";

		// preenche os dias em branco
		for(int i = 1; i < weekDay; i++)
			r += "   ";
		
		int x = weekDay-1;
		for(int i = 1; i <= Date.monthDays(month, this.year); i++) {
			r += String.format("%2d ", i);
			x += 1;
			if( x>=7 ) {
				x = 0;
				r += "\n";
			}
		}

		return r + "\n";
	}
}
