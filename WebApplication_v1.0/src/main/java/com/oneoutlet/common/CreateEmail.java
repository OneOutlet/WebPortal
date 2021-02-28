package com.oneoutlet.common;

import org.springframework.stereotype.Service;

@Service
public class CreateEmail {

	public String generateEmail(String name,String reqNum) {
		String email = null;

		email = "<linkhref=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css"
				+ "\"rel=\"stylesheet\"/><linkhref=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap\"rel=\"stylesheet\"/>"
				+ "<linkhref=\"https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.2.0/mdb.min.css\"rel=\"stylesheet\"/><footer class=\"footer bg-dark text-center text-lg-start\">"
				+ " <div class=\"text-center p-3\"> <a style=\"color:white\">OneOutlet</a> "
				+ "</div></footer> <div class=\"container\"> <div class=\"row\"> "
				+ "<div class=\"card\"> <div class=\"card-body\"> <blockquote class=\"blockquote mb-0 text-center\"> "
				+ "<p> <h3>Hi "+name+"</h3> <br>"
				+ " Thank You for Choosing OneOutlet. Your Service is Confirmed.<br>"
				+ " <p>Request Number is <h3 style=\"color: brown;\">"+reqNum+"</h3></p> </p> </blockquote> "
				+ ""
				+ "</div> </div> </div> </div> <footer class=\"footer bg-dark text-center text-lg-start\">"
				+ " <!-- Copyright --> <div class=\"text-center p-3\" style=\"background-color: rgba(0, 0, 0, 0.2);color:white\"> © 2020 Copyright: <a style=\"color:white\" href=\"./\">OneOutlet.com</a>"
				+ " </div> <!-- Copyright --> </footer><script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.2.0/mdb.min.js\"></script>";

		return email;
	}

}
