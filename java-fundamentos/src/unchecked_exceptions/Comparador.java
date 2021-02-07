package unchecked_exceptions;

public class Comparador {

	public static boolean comparador(Object o1, Object o2) {
		if (o1 == null) {
			return false;
		}
		return o1.equals(o2);
	}
}
