package workbook;

public class Otab extends Mobile{
	public Otab() {
		
	}
	
	public Otab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}
	// ���
	public int operate(int time) {
		setBatterySize(getBatterySize()-12*time);
		return getBatterySize();
	}
	// ����
	public int charge(int time) {
		setBatterySize(getBatterySize()+8*time);
		return getBatterySize();
	}
}
