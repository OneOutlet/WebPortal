function eventValid(){

    var name = document.forms["eventFrm"]["Customer_Name"].value;
    
    var mobile = document.forms["eventFrm"]["mobile"].value;
    
    var email = document.forms["eventFrm"]["email"].value;
    
    var event = document.forms["eventFrm"]["event"].value;
    
    var add = document.forms["eventFrm"]["Address"].value;
    
    if(name==""){
         document.getElementById("eventName").innerHTML="Please Enter Your Name";
       return false;
    }

     if(mobile==""){
       document.getElementById("eventMobile").innerHTML="Please Enter Your Mobile Number";
       return false;
     }
     else if(isNaN(mobile)){
       document.getElementById("eventMobile").innerHTML="Please Enter Your Correct Mobile Number";
       return false;
     }
     else if(mobile.length>12 || mobile.length<10){
       document.getElementById("eventMobile").innerHTML="Mobile Number can not more less 10 and not more than 11";
       return false;
     }
     
      if(email==""){
         document.getElementById("eventEmail").innerHTML="Please Enter Your Email";
       return false;
    }
    
     if(event==""){
         document.getElementById("eventEvent").innerHTML="Please Enter Your Event Name";
       return false;
    }
    
     if(add==""){
         document.getElementById("eventAddress").innerHTML="Please Enter Your Address";
       return false;
    }
}