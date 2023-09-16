<%-- 
    Document   : registed
    Created on : Jul 6, 2023, 12:21:42 AM
    Author     : tuna
--%>

<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="style/css/registed.css" />
    </head>
    <body>
        <div class="registerForm">
            <form action="addAccount" method="POST" class="form" accept-charset="UTF-8>
                <p class="title">Register</p>
                <p class="message">Sign up now and get full access to our app.</p>
                <div class="flex">
                    <label>
                        <input required="" placeholder="" type="text" class="input" name="name"/>
                        <span>Name</span>
                    </label>

                    <label>
                        <input required="" placeholder="" type="text" class="input" name="age"/>
                        <span>Age</span>
                    </label>
                </div>
                <label style="width: 100%">
                    Gender: 
                    <input required="" type="radio" name="gender" value="M"/>Male
                    <input required="" type="radio" name="gender" value="F"/>Female
                    <br> 
                </label>
                <label style="width: 100%">
                    <input required="" placeholder="" type="email" class="input" name="email"/>
                    <span>Email</span>
                </label>
                <label style="width: 100%">
                    <input required="" placeholder="" type="password" class="input" name="password"/>
                    <span>Password</span>
                </label>
                
                <label style="width: 100%">
                    <input required="" placeholder="" type="password" class="input" />
                    <span>Confirm password</span>
                </label>
                <label style="width: 100%">
                    <input required="" placeholder="" type="text" class="input" name="address"/>
                    <span>Address</span>
                </label>
                <label style="width: 100%">
                    Role: 
                    <input required="" type="radio" name="role" value="visitor"/>Visitor
                    <input required="" type="radio" name="role" value="owner"/>Owner
                    <br> 
                </label>
                <button class="submit">Submit</button>
                <p class="signin">Already have an account ? <a href="login">Login</a></p>
                <p style="color: red" class="message">${MSG}</p>
            </form>
            
        </div>
    </body>
</html>
