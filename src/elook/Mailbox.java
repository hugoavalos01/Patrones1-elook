package elook;

import java.util.ArrayList;
import java.util.List;

public class Mailbox {

	private List<Email> email;
	private Criterio c;

	public Mailbox() {
		email = new ArrayList<Email>();
	}

	private void sort() {
		for (int i = 2; i <= email.size(); i++)
			for (int j = email.size(); j >= i; j--)
				if (before(email.get(j), email.get(j - 1))) {
					// intercambiar los mensajes j y j-1
				}

	}

	private boolean before(Email m1, Email m2) {
		return c.before(m1, m2);
	}

	public void setCriterio(Criterio c) {
		this.c = c;
	}

	public void show() {

	}
}
