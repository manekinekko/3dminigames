import java.util.*;

public class ConcreteCode implements Code {

	protected Vector<Inst> vjs;
	
	public ConcreteCode(){
		vjs = new Vector<Inst>();
	}
	
	public void append(Inst i){
		this.vjs.add(i);
	}
	
	public void append(Code c){
		for(Iterator<Inst> i = c.getIterator(); i.hasNext() ; ){
			this.vjs.add(i.next());
		}
	}
	
	public String getCode(){
		String tmp = new String();
		for(Iterator<Inst> i = vjs.iterator(); i.hasNext() ; ){
			tmp += i.next().getCode();
		}
		return tmp;
	}
	
	public Iterator<Inst> getIterator(){
		return vjs.iterator();
	}
}
