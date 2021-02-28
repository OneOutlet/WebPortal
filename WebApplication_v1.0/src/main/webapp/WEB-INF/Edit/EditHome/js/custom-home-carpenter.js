function carpenterValid(){

    var name = document.forms["carpenterFrm"]["Customer_Name"].value;
    
    var mobile = document.forms["carpenterFrm"]["mobile"].value;
    
    var email = document.forms["carpenterFrm"]["email"].value;
    
    var add = document.forms["carpenterFrm"]["Address"].value;
    
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
    
     if(add==""){
         document.getElementById("carpenterAddress").innerHTML="Please Enter Your Address";
       return false;
    }
}