<%-- 
    Document   : login
    Created on : Jul 5, 2023, 11:30:02 PM
    Author     : tuna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style/css/login.css" />
    </head>
    <body>
        <div class="registerForm">
            <c:set var="cookie" value="${pageContext.request.cookies}"/>
            <form action="login" method="POST" class="form">
                <p class="title">Login</p>
                <p class="message">Login before go to app.</p>
                
                <label style="width: 100%">
                    <input required="" placeholder="${cookie.cEmail.value}" type="email" class="input" name="email" 
                           value="${cookie.cEmail.value}"/>
                    <span>Email</span>
                </label>

                <label style="width: 100%">
                    <input required="" placeholder="${cookie.cEmail.value}" type="password" class="input" name="pass"
                           value="${cookie.cPass.value}"/>
                    <span>Password</span>
                </label>
                <label style="width: 100%">
                    <input required="" type="radio" name="role" value="visitor"/>Visitor
                    <input required="" type="radio" name="role" value="owner"/>Owner
                    <br> 
                </label>
                <div>
                    <input type="checkbox" ${(cookie.cRem!=null)?"checked":""} name="remember" value="on"> Remember me
                </div>
                <button class="submit" type="submit">Submit</button>
                <p class="signin">Don't have account <a href="registed.jsp">Registed</a></p>
                <p style="color: red" class="message">${message}</p>
            </form>
        </div>
    </body>
</html>
