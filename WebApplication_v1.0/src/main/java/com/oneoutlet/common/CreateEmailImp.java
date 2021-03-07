package com.oneoutlet.common;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class CreateEmailImp implements CreateEmail {

	@Override
	public String generateCustomerEmail(String name, String reqNum) {
		String email = null;

	email = "<link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css\" rel=\"stylesheet\" />"
			 + "<link href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap\" rel=\"stylesheet\" />"
			 + "<link href=\"https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.3.0/mdb.min.css\" rel=\"stylesheet\" />"
			 + "<div class=\"container\">"
			 + "<div class=\"row\"><h3 class=\"text-justify\"> Hi "+name+"</h3>"
			 + "<p class=\"text-jutify\" >Thank You for Choosing OneOutlet. Your Service is Confirmed.</p>"
			 + "<br><p class=\"text-jutify\" >Your Request Number is <span style=\"color: chartreuse;\">"+reqNum+"</span></p>"
			 + "<p class=\"text-jutify\">Apply Coupon Code"
			 + " <span style=\"color: darkorange;\">"+reqNum+"</span> to get discount on your next order</p>"
			 + " <footer class=\"bg-dark text-center text-lg-start\">"
			 + "<div class=\"text-center p-3\" style=\"background-color: rgba(0, 0, 0, 0.2);color:white\"> © "
			 + "2020 Copyright: <a style=\"color:white\" href=\"www.oneoutlet.online\">OneOutlet.com</a></div> "
			 + "</footer></div>"
			 + "<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.3.0/mdb.min.js\" >"
			 + "</script>";

		return email;
	}

	@Override
	public String generateAdminEmail(String requesterName, String requestName, String reqNum, String mobileNum,
			LocalDateTime time, String address,String couponCode) {
		String email = null;

		email = "<link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css\" rel=\"stylesheet\" />"
				+ "<link href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap\" rel=\"stylesheet\" />"
				+ "<link href=\"https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.3.0/mdb.min.css\" rel=\"stylesheet\" />"
				+ "<div class=\"container\">"
				+ "<div class=\"row\"><h3 class=\"text-justify\"> Hi OneOutlet</h3>"
				+ "<p class=\"text-jutify\" >We Have New Request. Please Check the blow detail</p></div>"
				+ "<div class=\"row\"><table class=\"table\">" + "<tbody><tr><th scope=\"row\">Requester Name</th><td>"
				+ requesterName + "</td></tr>" + "<tr><th scope=\"row\">Request Number</th><td>" + reqNum
				+ "</td></tr>" + "<tr><th scope=\"row\">Request Name</th><td>" + requestName + "</td></tr>"
				+ "<tr><th scope=\"row\">Mobile Number</th><td>" + mobileNum + "</td></tr>"
				+ "<tr><th scope=\"row\">Time</th><td>" + time + "</td></tr>" + "<tr><th scope=\"row\">Address</th><td>"
				+ address + "</td></tr>" + "</tbody></table></div></div>"
				+ "<tr><th scope=\"row\">Coupon Code Applied</th><td>" + couponCode + "</td></tr>" 
				+ " <script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.3.0/mdb.min.js\" ></script>";

		return email;
	}
}