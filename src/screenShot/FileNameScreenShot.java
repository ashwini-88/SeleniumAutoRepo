package screenShot;

import java.time.LocalDateTime;

public class FileNameScreenShot {
	public static void main(String[] args) {
	LocalDateTime dateAndTime = LocalDateTime.now();
	System.out.println(dateAndTime);
	String updatedLocalDateTimeFormat = dateAndTime.toString().replace(':', '-');
System.out.println(updatedLocalDateTimeFormat);
System.out.println(LocalDateTime.now().toString().replace(':', '-'));
}
}
