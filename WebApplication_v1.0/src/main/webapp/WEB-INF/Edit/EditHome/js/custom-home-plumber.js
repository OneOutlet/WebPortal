function plumberValid(){

    var name = document.forms["plumberFrm"]["Customer_Name"].value;
    
    var mobile = document.forms["plumberFrm"]["mobile"].value;
    
    var email = document.forms["plumberFrm"]["email"].value;
    
    var add = document.forms["plumberFrm"]["Address"].value;
    
    if(name==""){
         document.getElementById("plumberName").innerHTML="Please Enter Your Name";
       return false;
    }

     if(mobile==""){
       document.getElementById("plumberMobile").innerHTML="Please Enter Your Mobile Number";
       return false;
     }
     else if(isNaN(mobile)){
       document.getElementById("plumberMobile").innerHTML="Please Enter Your Correct Mobile Number";
       return false;
     }
     else if(mobile.length>12 || mobile.length<10){
       document.getElementById("plumberMobile").innerHTML="Mobile Number can not more less 10 and not more than 11";
       return false;
     }
     
      if(email==""){
         document.getElementById("plumberEmail").innerHTML="Please Enter Your Email";
       return false;
    }
    
     if(add==""){
         document.getElementById("plumberAddress").innerHTML="Please Enter Your Address";
       return false;
    }
}