class CariNilaiMax {
	public static void main (String[] args) {
		int nomer1 = 45;
		int nomer2 = 20;
		int nomer3 = 67;

		int maks = 0;

		maks = nomer1 >= maks ?  nomer1 : maks;
		maks = nomer2 >= maks ? nomer2 : maks;
		maks = nomer3 >= maks ? nomer3 : maks;
		
		System.out.println("Nilai terbesar adalah "+maks);
	}
}