package workbook2;

public class Ltab extends Mobile{
	
	public Ltab() {
		
	}

	public Ltab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}

	@Override
	public int operate(int time) {
		setBatterySize(getBatterySize()-time*10);
		return getBatterySize();
	}

	@Override
	public int charge(int time) {
		setBatterySize(getBatterySize()+time*10);
		return getBatterySize();
	}
	
	
	
}
