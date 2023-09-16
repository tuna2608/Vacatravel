<%-- 
    Document   : search
    Created on : Jul 7, 2023, 12:35:31 AM
    Author     : tuna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="style/css/search.css"/>
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
            <form name="search" action="searching">
                <div class="proper__cont">
                    <div class="proper__cont-search">
                        <div class="search">Find your best place</div>
                        <input
                            class="search-input"
                            type="text"
                            placeholder="Search a place"
                            name ="key"
                            />
                        <select class="search-criteria" name="search">
                            <option value="1" >Name</option>
                            <option value="2"> Price Min</option>
                            <option value="3">Price Max</option>
                        </select>
                        
                        <button class="search-btn" type="submit">Search</button>
                    </div>
                </div>
            </form>
            <%@ include file="/include/footer.jsp" %>
        </section>
    </body>
</html>
