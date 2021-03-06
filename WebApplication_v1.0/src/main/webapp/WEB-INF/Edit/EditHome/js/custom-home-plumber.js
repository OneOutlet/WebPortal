function plumberValid(){

    var name = document.forms["plumberFrm"]["Customer_Name"].value;
    
    var mobile = document.forms["plumberFrm"]["mobile"].value;
    
    var email = document.forms["plumberFrm"]["email"].value;
    
    var add = document.forms["plumberFrm"]["Address"].value;
    
    var mailformat = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    
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
     else if(!mailformat.test(email)){
         
         document.getElementById("plumberEmail").innerHTML="Please Enter Valid Email";
       return false;
      }
    
     if(add==""){
         document.getElementById("plumberAddress").innerHTML="Please Enter Your Address";
       return false;
    }
}