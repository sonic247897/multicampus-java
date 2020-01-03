package workbook;

public class Mobile {
	private String mobileName;
	private int batterySize;
	private String osType;
	
	public Mobile() {
		
	}

	public Mobile(String mobileName, int batterySize, String osType) {
		super();
		this.mobileName = mobileName;
		this.batterySize = batterySize;
		this.osType = osType;
	}
	
	
	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public int getBatterySize() {
		return batterySize;
	}

	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}

	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}

	//사용
	public int operate(int time) {
		batterySize-=10*time;
		return batterySize;
	}
	//충전
	public int charge(int time) {
		batterySize+=10*time;
		return batterySize;
	}
	
	
}
