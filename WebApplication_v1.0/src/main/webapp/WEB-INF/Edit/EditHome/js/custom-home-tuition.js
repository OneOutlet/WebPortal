function tuitionValid(){

    var name = document.forms["tuitionFrm"]["Customer_Name"].value;
    
    var mobile = document.forms["tuitionFrm"]["mobile"].value;
    
    var email = document.forms["tuitionFrm"]["email"].value;
    
     var cls = document.forms["tuitionFrm"]["cls"].value;
    
    var add = document.forms["tuitionFrm"]["Address"].value;
    
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
    
     if(cls==""){
         document.getElementById("tuitionCls").innerHTML="Please Enter Class ";
       return false;
    }
    
     if(add==""){
         document.getElementById("tuitionAddress").innerHTML="Please Enter Your Address";
       return false;
    }
}