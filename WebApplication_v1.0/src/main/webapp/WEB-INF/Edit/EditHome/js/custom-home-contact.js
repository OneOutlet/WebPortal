function contactValid(){

    var name = document.forms["carpenterFrm"]["Customer_Name"].value;
    
    var mobile = document.forms["carpenterFrm"]["mobile"].value;
    
    var email = document.forms["carpenterFrm"]["email"].value;
    
    var issue = document.forms["carpenterFrm"]["issue"].value;
    
    if(name==""){
         document.getElementById("contactName").innerHTML="Please Enter Your Name";
       return false;
    }

     if(mobile==""){
       document.getElementById("contactMobile").innerHTML="Please Enter Your Mobile Number";
       return false;
     }
     else if(isNaN(mobile)){
       document.getElementById("contactMobile").innerHTML="Please Enter Your Correct Mobile Number";
       return false;
     }
     else if(mobile.length>12 || mobile.length<10){
       document.getElementById("contactMobile").innerHTML="Mobile Number can not more less 10 and not more than 11";
       return false;
     }
     
      if(email==""){
         document.getElementById("contactEmail").innerHTML="Please Enter Your Email";
       return false;
    }
    
     if(issue==""){
         document.getElementById("contactIssue").innerHTML="Please Enter Your Problem";
       return false;
    }
}