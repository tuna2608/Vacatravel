<%-- 
    Document   : comment
    Created on : Jul 17, 2023, 10:12:52 PM
    Author     : tuna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style/css/comment.css" />
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
                            <h1 class="title">Add new comment</h1>
                        </div>
                        <form style="margin-bottom: 40px;" action="addComment" method="post" class="form-group">
                            <div class="form-group">
                                <label class="label">Name user: ${logined.name}</label>
                            </div>
                            <div class="form-group">
                                <label class="label">Hotel name: ${hInfo.name} </label>
                            </div>
                            <div class="form-group">
                                <label class="label">Content</label>
                                <input class="input" type="text" name="content">
                            </div>
                            <div class="button-group">
                                <button class="button" type="submit">Add new comment</button>
                            </div>
                        </form>
                    </div>
                </div>
                <%@ include file="/include/footer.jsp" %>
            </div>
        </section>
    </body>
</html>
