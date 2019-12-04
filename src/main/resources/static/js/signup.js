function isSame(){
    
    var password = document.getElementById('password').value;
    var flag = true;
    
    if(password.length < 6 && password.length >= 1){
        var str=new String("Password must be at least 6 characters long");
        document.getElementById('lengthCheck').innerHTML=(str.fontcolor("red"));
        flag = true;
    }
    else{
        document.getElementById('lengthCheck').innerHTML=""; 
        flag = false;
    }
    if(document.getElementById('password').value != document.getElementById('password2').value && flag == false){
        var str=new String("Password does not match");
        document.getElementById('same').innerHTML=(str.fontcolor("red"));
    }
    else{
        document.getElementById('same').innerHTML="";
        flag = false;
    }

}

function emailValidation(email){
    var email = document.getElementById('email').value;
    var re = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@cpp.edu/;
    if(re.test(email) || email.length==0){
        document.getElementById('emailValidation').innerHTML="";
    }
    else{
        var str= new String("Please enter CPP email");
        document.getElementById('emailValidation').innerHTML=(str.fontcolor("red"));
    }



}