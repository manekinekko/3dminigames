
import java.util.*;

public interface Code {
	public void append(InstJS i);
	public void append(Code c);
	public Iterator<InstJS> getIterator();
}
