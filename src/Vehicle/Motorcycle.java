package Vehicle;

public class Motorcycle extends Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String JenisTipeKendaraan[] = {"Automatic","Manual"};
		
		int[] JumlahHelm;
		int[] Wheel;
		
		public boolean checkwheel(String Wheel) {
			if(Wheel < 2 || Wheel > 3) {
				return false;
			}
		}
		public boolean checkjumlahhelm(String JumlahHelm) {
			if(JumlahHelm < 1) {
				return false;
			}
		}
	}

}
