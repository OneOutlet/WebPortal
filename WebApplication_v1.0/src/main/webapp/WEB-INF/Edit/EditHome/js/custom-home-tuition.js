function tuitionValid(){

    var name = document.forms["tuitionFrm"]["Customer_Name"].value;
    
    var mobile = document.forms["tuitionFrm"]["mobile"].value;
    
    var email = document.forms["tuitionFrm"]["email"].value;
    
     var cls = document.forms["tuitionFrm"]["cls"].value;
    
    var add = document.forms["tuitionFrm"]["Address"].value;
    
    var mailformat = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    
    if(name==""){
         document.getElementById("tuitionrName").innerHTML="Please Enter Your Name";
       return false;
    }

     if(mobile==""){
       document.getElementById("tuitionMobile").innerHTML="Please Enter Your Mobile Number";
       return false;
     }
     else if(isNaN(mobile)){
       document.getElementById("tuitionMobile").innerHTML="Please Enter Your Correct Mobile Number";
       return false;
     }
     else if(mobile.length>12 || mobile.length<10){
       document.getElementById("tuitionMobile").innerHTML="Mobile Number can not more less 10 and not more than 11";
       return false;
     }
     
      if(email==""){
         document.getElementById("tuitionEmail").innerHTML="Please Enter Your Email";
       return false;
    }
     else if(!mailformat.test(email)){
         
         document.getElementById("tuitionEmail").innerHTML="Please Enter Valid Email";
       return false;
      }
      
     if(cls==""){
         document.getElementById("tuitionCls").innerHTML="Please Enter Class ";
       return false;
    }
    
     if(add==""){
         document.getElementById("tuitionAddress").innerHTML="Please Enter Your Address";
       return false;
    }
}