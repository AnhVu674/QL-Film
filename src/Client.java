
public class Client {
public static void main(String[] args) {
	IGenerator r = new Galaxy("Trung Canh","hcm");
	IListener l = new Customer(1,"Vu",50000.0);
	IListener l2 = new Customer(2,"Quy",10000.0);
	IListener l3 = new Customer(3,"Dien",60000.0);
	IEvent e = new Film("dc");
	l.subscribeEvent(r);
	l2.subscribeEvent(r);
	l3.subscribeEvent(r);
	r.onEvent(l2, e);
	
	
}
}
