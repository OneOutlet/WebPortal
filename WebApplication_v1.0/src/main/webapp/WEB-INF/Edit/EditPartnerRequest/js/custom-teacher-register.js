function teacherRegisterValid(){


    var name = document.forms["teacherRegisterFrm"]["name"].value;
    
    var mobile = document.forms["teacherRegisterFrm"]["mobile"].value;
    
    var email = document.forms["teacherRegisterFrm"]["email"].value;
    
    var qualification = document.forms["teacherRegisterFrm"]["qualification"].value;
    
    var experience = document.forms["teacherRegisterFrm"]["experience"].value;
    
    var add = document.forms["teacherRegisterFrm"]["Address"].value;
 
    
    var mailformat = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    
    if(name==""){
         document.getElementById("teacherName").innerHTML="Please Enter Your Name";
       return false;
    }

     if(mobile==""){
       document.getElementById("teacherMobile").innerHTML="Please Enter Your Mobile Number";
       return false;
     }
     else if(isNaN(mobile)){
       document.getElementById("teacherMobile").innerHTML="Please Enter Your Correct Mobile Number";
       return false;
     }
     else if(mobile.length>12 || mobile.length<10){
       document.getElementById("teacherMobile").innerHTML="Mobile Number can not more less 10 and not more than 11";
       return false;
     }
     
      if(email==""){
         document.getElementById("teacherEmail").innerHTML="Please Enter Your Email";
       return false;
    }
      else if(!mailformat.test(email)){
         
         document.getElementById("teacherEmail").innerHTML="Please Enter Valid Email";
       return false;
      }
      
       if(qualification==""){
         document.getElementById("teacherQualification").innerHTML="Please Enter Your Qualification";
       return false;
    }
      if(isNaN(experience)){
       document.getElementById("teacherExp").innerHTML="Please Enter Experience In Digit Only";
       return false;
     }
    
     if(add==""){
         document.getElementById("teacherAddress").innerHTML="Please Enter Your Address";
       return false;
    }
}