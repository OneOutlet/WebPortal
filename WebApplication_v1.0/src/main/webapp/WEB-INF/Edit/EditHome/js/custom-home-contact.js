function contactValid(){

    var name = document.forms["contactFrm"]["Customer_Name"].value;
    
    var mobile = document.forms["contactFrm"]["mobile"].value;
    
    var email = document.forms["contactFrm"]["email"].value;
    
    var issue = document.forms["contactFrm"]["issue"].value;
    
    var mailformat = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    
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
      else if(!mailformat.test(email)){
         
         document.getElementById("tuitionEmail").innerHTML="Please Enter Valid Email";
       return false;
      }
     if(issue==""){
         document.getElementById("contactIssue").innerHTML="Please Enter Your Problem";
       return false;
    }
}