package ex1.solution;

public class StopWatch extends Mode {

	public StopWatch(DigitalWatch digitalWatch) {
		super(digitalWatch);
	}

	@Override
	public void press(boolean longpress) {
		if (longpress) {
			this.getDigitalWatch().setMode(new Hour(this.getDigitalWatch()));
		}
	}

	@Override
	public void plus() {
		this.getDigitalWatch().start();
	}

	@Override
	public void minus() {
		this.getDigitalWatch().stop();
	}

}
