package musichub.business;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.Exception;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class NoElementFoundException extends Exception {

	public static final String DIR = System.getProperty("user.dir");
	public static final String LOG = DIR + "\\files\\log.txt";

	public NoElementFoundException (String msg) {
		super(msg);

		try {
			FileWriter myWriter = new FileWriter(LOG,true);
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
			LocalDateTime now = LocalDateTime.now();
			myWriter.write(dtf.format(now) + " " +msg);
			myWriter.close();
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();


		}

	}
}