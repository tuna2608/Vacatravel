<%-- 
    Document   : header
    Created on : Jul 5, 2023, 11:02:17 PM
    Author     : tuna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="style/css/header.css"/>
        <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css"
            integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw=="
            crossorigin="anonymous"
            referrerpolicy="no-referrer"
            />
    </head>
    <body>
        <header>
            <div class="header__cont">
                <div class="header__cont-logo title">Traveland</div>
                <nav class="header__cont-nav">
                    <a href="home.jsp" class="nav-item">Home</a>
                    <a href="search.jsp" class="nav-item">Search</a>
                    <a href="hotels" class="nav-item">List</a>
                    <c:if test="${role=='owner'}">
                        <a href="add.jsp" class="nav-item">Add</a>
                    </c:if>
                    
                </nav>
                <div class="header__cont-user">
                    <i class="fa-solid fa-bars"></i>
                    <img src="style/icon/user.svg" alt="" />
                    <div class="user-info">
                        <a href="#" class="user-info-item">My hotels</a>
                        <a href="login" class="user-info-item">Log out</a>
                        <c:if test="${logined==null}">
                            <a href="addAccount" class="user-info-item">Registed</a>
                            <a href="login" class="user-info-item">Log in</a>
                        </c:if> 
                            
                    </div>
                </div>
            </div>
        </header>
    </body>
</html>
