function cdRegisterValid(){


    var name = document.forms["cdRegisterFrm"]["name"].value;
    
    var mobile = document.forms["cdRegisterFrm"]["mobile"].value;
    
    var email = document.forms["cdRegisterFrm"]["email"].value;
    
    var test = document.forms["cdRegisterFrm"]["test"].value;
    
    var add = document.forms["cdRegisterFrm"]["Address"].value;
 
    
    var mailformat = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    
    if(name==""){
         document.getElementById("cdName").innerHTML="Please Enter Your Name";
       return false;
    }

     if(mobile==""){
       document.getElementById("cdMobile").innerHTML="Please Enter Your Mobile Number";
       return false;
     }
     else if(isNaN(mobile)){
       document.getElementById("cdMobile").innerHTML="Please Enter Your Correct Mobile Number";
       return false;
     }
     else if(mobile.length>12 || mobile.length<10){
       document.getElementById("cdMobile").innerHTML="Mobile Number can not more less 10 and not more than 11";
       return false;
     }
     
      if(email==""){
         document.getElementById("cdEmail").innerHTML="Please Enter Your Email";
       return false;
    }
      else if(!mailformat.test(email)){
         
         document.getElementById("cdEmail").innerHTML="Please Enter Valid Email";
       return false;
      }
      
       if(test==""){
         document.getElementById("cdtest").innerHTML="Please Enter Your Test";
       return false;
    }
      
    
     if(add==""){
         document.getElementById("cdAddress").innerHTML="Please Enter Your Address";
       return false;
    }
}