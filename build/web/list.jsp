<%-- 
    Document   : search
    Created on : Jul 6, 2023, 12:30:00 AM
    Author     : tuna
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Traveland</title>
        <link rel="stylesheet" href="style/css/list.css"/>
        <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css"
            integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw=="
            crossorigin="anonymous"
            referrerpolicy="no-referrer"
            />
    </head>
    <body>
        <%@ include file="/include/header.jsp" %>
        <section class="body">
            <div class="proper__cont">
                <div class="proper__cont-header">
                    <ul class="type-chose">
                        <li class="type">Apartments</li>
                        <li class="type">Houses</li>
                        <li class="type">Villas</li>
                        <li class="type">Homestays</li>
                        <li class="type">Villas</li>
                        <li class="type">More</li>
                    </ul>
                    <div class="type-filter">
                        <i class="fa-solid fa-filter"></i>
                        <p>Filter</p>
                    </div>
                </div>
                <div class="proper__cont-content">
                    <c:forEach items="${hList}" var="h">
                        <div class="card-info">
                            <div class="card-img" style="background-image: url(style/img/${h.HID}/background.jpg)">
                                <div class="card-price">${h.pricemin} $ - ${h.pricemax} $</div>
                            </div>
                            <div class="card-desc">
                                <p class="card-title">${h.name}</p>
                                <p class="card-adr">${h.address}</p>
                                <a type="submit" href="detail?hID=${h.HID}">More info</a>
                            </div>

                        </div>
                    </c:forEach>
                </div>
            </div>
            <%@ include file="/include/footer.jsp" %>
        </section>
    </body>
</html>
