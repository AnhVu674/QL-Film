import java.util.ArrayList;
import java.util.List;

public class Galaxy implements IGenerator {
	static private List<IListener> cuonSo = null;
	private String ten;
	private String diaChi;

	public Galaxy(String ten, String diaChi) {
		this.ten = ten;
		this.diaChi = diaChi;
		this.cuonSo = new ArrayList<IListener>();
	}

	@Override
	public String toString() {
		return "Galaxy [ten=" + ten + ", diaChi=" + diaChi + "]";
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@Override
	public void onEvent(Object from, IEvent e) {
		for (var k : this.cuonSo)
			k.response(this, e);
	}

	@Override
	public boolean find(IListener listener) {
		for (IListener k : this.cuonSo)
			if (k.equal(listener))
				return true;
		return false;
	}

	@Override
	public void add(IListener listener) {
		synchronized (this.cuonSo) {
			if (!this.find(listener))
				this.cuonSo.add(listener);
		}
	}

}
