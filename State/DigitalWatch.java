package ex1.solution;

public class DigitalWatch {

	private Mode mode;
	
	public DigitalWatch() {
		this.setMode(new Hour(this));
	}
	
	public void press(boolean longpress) {
		this.mode.press(longpress);
	}

	public void plus() {
		this.mode.plus();
	}	
	
	public void minus() {
		this.mode.minus();
	}
	
	void setMode(Mode mode) {this.mode = mode;}
	Mode getMode() {return this.mode;}
	void incrementMinute() {}
	void incrementHour() {}	
	void decrementMinute() {}
	void decrementHour() {}	
	void stop() {}
	void start() {}
}
