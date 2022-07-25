import com.email.durgesh.Email;

public class EmailSender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hi this is working");
		try {
			
			Email email = new Email("shivamraiias@gmail.com","Shivamrai714@");
			
			//from
			email.setFrom("shivamraiias@gmail.com", "IAS At Indian Goverment");
			email.setSubject("This is first tessing mail");
			email.setContent("<h1>Nice experiecne to share the details with your</h1>","text/html");
			email.addRecipient("vedanshrai586@gmail.com");
			
			email.send();
			
			
		} catch (Exception e) {
		
			e.printStackTrace();
			
			
		}
		
		
	}

}
