function painterValid(){

    var name = document.forms["painterFrm"]["Customer_Name"].value;
    
    var mobile = document.forms["painterFrm"]["mobile"].value;
    
    var email = document.forms["painterFrm"]["email"].value;
    
    var add = document.forms["painterFrm"]["Address"].value;
    
    if(name==""){
         document.getElementById("painterName").innerHTML="Please Enter Your Name";
       return false;
    }

     if(mobile==""){
       document.getElementById("painterMobile").innerHTML="Please Enter Your Mobile Number";
       return false;
     }
     else if(isNaN(mobile)){
       document.getElementById("painterMobile").innerHTML="Please Enter Your Correct Mobile Number";
       return false;
     }
     else if(mobile.length>12 || mobile.length<10){
       document.getElementById("painterMobile").innerHTML="Mobile Number can not more less 10 and not more than 11";
       return false;
     }
     
      if(email==""){
         document.getElementById("painterEmail").innerHTML="Please Enter Your Email";
       return false;
    }
    
     if(add==""){
         document.getElementById("painterAddress").innerHTML="Please Enter Your Address";
       return false;
    }
}