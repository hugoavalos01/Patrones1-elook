package elook;

import java.util.Date;

public class Email {
	
	public String from, subject, text;
	public Date date;
	public Priority priority;
	
	public Email(String f, String s, Date d, Priority p, String t) {
		from = f;
		subject = s;
		date = d;
		priority = p;
		text = t;
	}
	
}
