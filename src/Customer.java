
public class Customer implements IListener {

	private int id;
	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public double getTien() {
		return tien;
	}

	public void setTien(double tien) {
		this.tien = tien;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String ten;
	private double tien;

	public Customer(int id, String ten, double tien) {
		this.id = id;
		this.ten = ten;
		this.tien = tien;
	}

	@Override
	public void subscribeEvent(IGenerator sender) {
		sender.add(this);
	}

	@Override
	public void response(IGenerator from, IEvent e) {
		if (((Film) e).getName().toLowerCase().contains("dc") && ((Galaxy) from).getDiaChi().toLowerCase().contains("hcm")
				&& this.tien > 10000.0) {
			System.out.println(this.getTen()+" Di xem ngay");
		}
	}

	@Override
	public boolean equal(IListener listener) {
		return listener.getId() == this.getId();
	}

	@Override
	public Object getId() {
		return this.id;
	}

}
