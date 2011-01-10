import java.util.*;

public class ConcreteCode implements Code {

	protected Vector<InstJS> vjs;
	
	public ConcreteCode(){
		vjs = new Vector<InstJS>();
	}
	
	public void append(InstJS i){
		this.vjs.add(i);
	}
	
	public void append(Code c){
		for(Iterator<InstJS> i = c.getIterator(); i.hasNext() ; ){
			this.vjs.add(i.next());
		}
	}
	
	public Iterator<InstJS> getIterator(){
		return vjs.iterator();
	}
}
