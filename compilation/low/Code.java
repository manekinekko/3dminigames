
import java.util.*;

public interface Code {
	public void append(Inst i);
	public void append(Code c);
	public String getCode();
	public Iterator<Inst> getIterator();
}
