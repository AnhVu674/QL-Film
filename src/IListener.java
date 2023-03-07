
public interface IListener {

	public void subscribeEvent(IGenerator sender) ;
	public void response(IGenerator from, IEvent e);
	boolean equal(IListener listener);
	Object getId();

}
