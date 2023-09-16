<%-- 
    Document   : feedback
    Created on : Jul 12, 2023, 5:51:41 PM
    Author     : tuna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
                            <h1 class="title">Add new feedback</h1>
                        </div>
                        <form style="margin-bottom: 40px;" action="addFeedback" method="post" class="form-group">
                            <div class="form-group">
                                <label class="label">Name visitor: ${logined.name}</label>
                            </div>
                            <div class="form-group">
                                <label class="label">Hotel name: ${hInfo.name} </label>
                            </div>
                            <div class="form-group">
                                <label class="label">Star</label>
                                <input class="input" type="text" name="star">
                            </div>
                            <div class="form-group">
                                <label class="label">Content</label>
                                <input class="input" type="text" name="content">
                            </div>
                            <div class="button-group">
                                <button class="button" type="submit">Add new feedback</button>
                            </div>
                        </form>
                    </div>
                </div>
                <%@ include file="/include/footer.jsp" %>
            </div>
        </section>
    </body>
</html>
