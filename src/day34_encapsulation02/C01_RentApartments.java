package day34_encapsulation02;

public class C01_RentApartments {
	private String name;
	private int roomCount;
	private boolean balconyOrNo;
	private int kira = 0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoomCount() {
		return roomCount;
	}

	public void setRoomCount(int roomCount) {
		this.roomCount = roomCount;
	}

	public boolean isBalconyOrNo() {
		return balconyOrNo;
	}

	public void setBalconyOrNo(boolean balconyOrNo) {
		this.balconyOrNo = balconyOrNo;
	}

	public int getKira() {
		return kira;
	}

	public void setKira(int kira) {
		this.kira = kira;
	}

	public int kiraHesapla(int roomCount) {
		if (roomCount == 0) {
			this.kira = 1400;
		} else if (roomCount == 1) {
			this.kira = 1700;
		} else if (roomCount == 2) {
			this.kira = 2200;
		} else if (roomCount == 3) {
			this.kira = 2700;
		} else {
			System.out.println("hata var");
		}

		return this.kira;
	}
	public int balconyOrNo(boolean balconyOrNo) {
		if (balconyOrNo == true) {
			this.kira += 200;
		}
		return this.kira;	
	}
}
