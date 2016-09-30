public class Date{
	private int day;
	private int month;
	private int year;

	public Date(int year, int month, int day){
		setDate(year, month, day);
	}

	public int getYear(){
		return year;
	}

	public int getMonth(){
		return month;
	}

	public int getDay(){
		return day;
	}

	public void setYear(int year){
		if (!(year >= 1000 && year <= 9999)){
			throw new IllegalArgumentException("Invalid Input of Year!");
		}
		this.year = year;
	}

	public void setMonth(int month){
		if (!(month >= 1 && month <= 12)){
			throw new IllegalArgumentException("Invalid Input of Month!");
		}
		this.month = month;
	}

	public void setDay(int day){
		if ((this.month == 2 && this.month % 4 == 0) && !(day >= 1 && day <= 29)){
			throw new IllegalArgumentException("Invalid Input of Day!");
		}
		else if ((this.month == 2)  && !(day >= 1 && day <= 28)){
			throw new IllegalArgumentException("Invalid Input of Day!");
		}
		else if ((this.month != 2) && !(day >=1 && day <= 31)){
			throw new IllegalArgumentException("Invalid Input of Day!");
		}
		else
			this.day = day;
}

	public String toString(){
		return String.format("%02d / %02d / %d", this.day, this.month, this.year);
	}

	public void setDate(int year, int month, int day){
		setYear(year);
		setMonth(month);
		setDay(day);
	}
}