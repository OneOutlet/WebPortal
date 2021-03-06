function carpenterValid(){

    var name = document.forms["carpenterFrm"]["Customer_Name"].value;
    
    var mobile = document.forms["carpenterFrm"]["mobile"].value;
    
    var email = document.forms["carpenterFrm"]["email"].value;
    
    var add = document.forms["carpenterFrm"]["Address"].value;
    
    var mailformat = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    
    if(name==""){
         document.getElementById("carpenterName").innerHTML="Please Enter Your Name";
       return false;
    }

     if(mobile==""){
       document.getElementById("carpenterMobile").innerHTML="Please Enter Your Mobile Number";
       return false;
     }
     else if(isNaN(mobile)){
       document.getElementById("carpenterMobile").innerHTML="Please Enter Your Correct Mobile Number";
       return false;
     }
     else if(mobile.length>12 || mobile.length<10){
       document.getElementById("carpenterMobile").innerHTML="Mobile Number can not more less 10 and not more than 11";
       return false;
     }
     
      if(email==""){
         document.getElementById("carpenterEmail").innerHTML="Please Enter Your Email";
       return false;
    }
      else if(!mailformat.test(email)){
         
         document.getElementById("carpenterEmail").innerHTML="Please Enter Valid Email";
       return false;
      }
    
     if(add==""){
         document.getElementById("carpenterAddress").innerHTML="Please Enter Your Address";
       return false;
    }
}