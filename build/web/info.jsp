<%-- 
    Document   : info
    Created on : Jul 17, 2023, 10:32:37 AM
    Author     : tuna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="style/css/feedback.css" />
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
            <div class="body">
                <div class="container">
                    <div class="container__form" style="max-width: 800px; width: 100%;">
                        <div class="form-header">
                            ${mes}
                        </div>
                        
                    </div>
                </div>
                <%@ include file="/include/footer.jsp" %>
            </div>
        </section>
    </body>
</html>
