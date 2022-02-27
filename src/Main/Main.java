package Main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
		
		public boolean checkbrand(String Brand) {
			if(Brand.lenght() < 5) {
				return false;
			}
		}
		public boolean checkname(String Name) {
			if(Name.lenght() < 5) {
				return false;
			}
		}
		
		public boolean checklicensenumber(String LicenseNumber) {
			if(LicenseNumber[0].isalpha()) {
				if(StringUtils.containsWhitespace(LicenseNumber[1])) {
					if(LicenseNumber[2].isnumeric()) {
						if(LicenseNumber[3].isnumeric()) {
							if(LicenseNumber[4].isnumeric()) {
								if(LicenseNumber[5].isnumeric()) {
									if(StringUtils.containsWhitespace(LicenseNumber[6])) {
										if(LicenseNumber[7].isalpha()) {
											if(LicenseNumber[8].isalpha()) {
												return true;
											}
											else {
												return false;
											}
										}
										else {
											return false;
										}
									}
									else {
										return false;
									}
								}
								else {
									return false;
								}
							}
							else {
								return false;
							}
						}
						else {
							return false;
						}
					}
					else {
						return false;
					}
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
		}
		
		public boolean checktopspeed(Int TopSpeed) {
			if(TopSpeed < 100 || TopSpeed>250) {
				return false;
			}
		}
		public boolean checkgascap(Int GasCap) {
			if(GasCap < 30 || GasCap > 60) {
				return false;
			}
		}
		Int[] number;
		
		System.out.println("|-----|---------------|---------------|");
		System.out.println("|No---|Type-----------|Name-----------|");
		System.out.println("|-----|---------------|---------------|");
		System.out.println("|" + number + "|" + JenisTipeKendaraan + "|" + Nama + "|");
		System.out.println("|-----|---------------|---------------|");
		System.out.println("|-----|---------------|---------------|");

}
