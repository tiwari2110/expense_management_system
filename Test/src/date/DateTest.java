package date;

import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d = new Date(2017, 10, 20);
		
		System.out.println(d.toString());
		Calendar c = Calendar.getInstance();
		
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
	}

}
