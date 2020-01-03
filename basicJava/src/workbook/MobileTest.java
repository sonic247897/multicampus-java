package workbook;

public class MobileTest {
	public static void main(String[] args) {
		Ltab lt = new Ltab("Ltab", 500, "AP-01");
		Otab ot = new Otab("Otab",1000, "AND-20");
		print(lt,ot);
		
		lt.charge(10); 
		ot.charge(10);
		System.out.println("10분 충전");
		print(lt,ot);

		lt.operate(5); 
		ot.operate(5); 
		System.out.println("5분 통화");
		print(lt,ot);
		
	}
	
	public static void print(Ltab lt, Otab ot) {
		System.out.println("Mobile\tBattery\tOS\t");
		System.out.println("-----------------------");
		System.out.println(lt.getMobileName() + "\t" 
		+lt.getBatterySize() + "\t"
		+lt.getOsType() + "\t");
		System.out.println(ot.getMobileName() + "\t" 
				+ot.getBatterySize() + "\t"
				+ot.getOsType() + "\t");
	}

}

