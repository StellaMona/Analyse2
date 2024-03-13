package ex1.solution;

public class Hour extends Mode {

	
	public Hour(DigitalWatch digitalWatch) {
		super(digitalWatch);
	}

	@Override
	public void press(boolean longpress) {
		if (longpress) {
			this.getDigitalWatch().setMode(new StopWatch(this.getDigitalWatch()));
		}else {
			this.getDigitalWatch().setMode(new Minute(this.getDigitalWatch()));
		}
	}

	@Override
	public void plus() {
		this.getDigitalWatch().incrementHour();
	}

	@Override
	public void minus() {
		this.getDigitalWatch().decrementHour();

	}
}
