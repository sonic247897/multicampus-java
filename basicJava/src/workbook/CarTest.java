package workbook;

public class CarTest {
	public static void main(String[] args) {
		Car[] arr = new Car[2];
		arr[0] = new L3("L3", "1500", 50, 25, 0);
		arr[1] = new L5("L5", "2000", 75, 35, 0);
		System.out.println("VehicleName\tengineSize\toilTank\toilSize\tdistance\ttemperature\t");
		System.out.println("---------------------------------------------------------------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].getName()+"\t\t"
				+arr[i].getEngine()+"\t\t"
				+arr[i].getOilTank()+"\t"
				+arr[i].getOilSize()+"\t"
				+arr[i].getDistance()+"\t\t");
			if(arr[i] instanceof L3) {
				System.out.println(((L3)arr[i]).getTempGage());
			}
			else {
				System.out.println(((L5)arr[i]).getTempGage());
			}
		}
		System.out.println();
		System.out.println("25 주유");
		System.out.println("VehicleName\tengineSize\toilTank\toilSize\tdistance\ttemperature\t");
		System.out.println("---------------------------------------------------------------------");
		for (int i = 0; i < arr.length; i++) {
			arr[i].setOil(25);
			
			System.out.print(arr[i].getName()+"\t\t"
				+arr[i].getEngine()+"\t\t"
				+arr[i].getOilTank()+"\t"
				+arr[i].getOilSize()+"\t"
				+arr[i].getDistance()+"\t\t");
			if(arr[i] instanceof L3) {
				System.out.println(((L3)arr[i]).getTempGage());
			}
			else {
				System.out.println(((L5)arr[i]).getTempGage());
			}
		}
		
		System.out.println();
		System.out.println("80 주행");
		System.out.println("VehicleName\tengineSize\toilTank\toilSize\tdistance\ttemperature\t");
		System.out.println("---------------------------------------------------------------------");
		for (int i = 0; i < arr.length; i++) {
			arr[i].go(80);
			arr[i].setDistance(80);
		
			System.out.print(arr[i].getName()+"\t\t"
				+arr[i].getEngine()+"\t\t"
				+arr[i].getOilTank()+"\t"
				+arr[i].getOilSize()+"\t"
				+arr[i].getDistance()+"\t\t");
			if(arr[i] instanceof L3) {
				System.out.println(((L3)arr[i]).getTempGage());
			}
			else {
				System.out.println(((L5)arr[i]).getTempGage());
			}
		}
	}
		
	
}
