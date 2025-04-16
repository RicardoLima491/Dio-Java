package Clock;

public non-sealed class USClock extends Clock{
	
	@Override 
	Clock convert (final Clock clock) {
		this.second = clock.getSecond();
		this.minute = clock.getMinute();
		
		switch (clock) {
			case USClock USClock ->{
				this.hour= USClock.getHour();
				this.periodIndicator = USClock.getPeriodIndicator();	
		}
			case BRLClock brlClock -> this.setHour(brlClock.getHour());
		}
		return this;
	}
	private String periodIndicator;
	
	public void setHour(int hour) {
		if ((hour > 12) && (hour<=23)){
			this.hour = hour - 12;
			this.periodIndicator = "PM";
		}
		else {
			this.hour = hour;
			this.periodIndicator = "AM";
		}
		
	}

	public String getPeriodIndicator() {
		return periodIndicator;
	}

	public void setPeriodIndicator(String periodIndicator) {
		this.periodIndicator = periodIndicator;
	}
	public String getTime() {
		return super.getTime()+ " "+ this.periodIndicator;
	}
}
