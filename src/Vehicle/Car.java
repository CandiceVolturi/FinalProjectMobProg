package Vehicle;

public class Car extends Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String JenisTipeKendaraan[] = {"SUV","Supercar","Minivan"};
		
		int[] JumlahEntertainmentSystem;
		int[] Wheel;
		
		public boolean checkwheel(String Wheel) {
			if(Wheel < 4 || Wheel > 6) {
				return false;
			}
		}
		public boolean checkjumlahentertainmentsystem(String JumlahEntertainmentSystem) {
			if(JumlahEntertainmentSystem < 1) {
				return false;
			}
		}
	}
}
