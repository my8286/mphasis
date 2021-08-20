
public class Contact {
	String name,gmail,phone,subject,message;

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contact(String name, String gmail, String phone, String subject, String message) {
		super();
		this.name = name;
		this.gmail = gmail;
		this.phone = phone;
		this.subject = subject;
		this.message = message;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
