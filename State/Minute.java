package ex1.solution;

public class Minute extends Mode {

	public Minute(DigitalWatch digitalWatch) {
		super(digitalWatch);
	}

	@Override
	public void press(boolean longpress) {
		if (longpress) {
			this.getDigitalWatch().setMode(new StopWatch(this.getDigitalWatch()));
		}else {
			this.getDigitalWatch().setMode(new Hour(this.getDigitalWatch()));
		}
	}

	@Override
	public void plus() {
		this.getDigitalWatch().incrementMinute();
	}

	@Override
	public void minus() {
		this.getDigitalWatch().decrementMinute();
	}
}
