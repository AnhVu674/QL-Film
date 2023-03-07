
public interface IGenerator {

	public void onEvent(Object from, IEvent e);
	public boolean find(IListener listener);
	public void add(IListener listener);

}
