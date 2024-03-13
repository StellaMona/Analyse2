package ex1.solution;

public abstract class Mode {

	private DigitalWatch digitalWatch;

	public Mode(DigitalWatch digitalWatch) {
		this.digitalWatch = digitalWatch;
	}
	
	public DigitalWatch getDigitalWatch() {
		return this.digitalWatch;
	}
	
	public abstract void press(boolean longpress);
	public abstract void plus();
	public abstract void minus();
}
