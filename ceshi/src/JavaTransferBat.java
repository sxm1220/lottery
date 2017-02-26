import java.io.IOException;


public class JavaTransferBat {

	public static void main(String[] args) {
		try {
			Process pr = Runtime.getRuntime().exec("sqlplus azc2013/azc2013@bendi @ c:/ceshi.sql commit on");
		} catch (IOException e) {
			e.printStackTrace();
	}

}
}
