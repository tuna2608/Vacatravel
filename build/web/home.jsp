<%-- 
    Document   : homePage
    Created on : Jul 5, 2023, 11:09:33 PM
    Author     : tuna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style/css/home.css" />
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
            <div class="banner__cont" style="background-image: url(style/img/background.jpg)">
                <div class="banner__cont-content">
                    <div class="content-row1">
                        <div class="content-row-header">Find</div>
                        <div class="content-row-nav">
                            <p>Rooms</p>
                            <p>Flats</p>
                            <p>Hotels</p>
                            <p>Villas</p>
                        </div>
                    </div>
                    <form class="content-row2" action="search.jsp" method="POST">
                        <div class="search">
                            <label class="search-title">Name</label>
                            <input
                                type="text"
                                class="search-input"
                                placeholder="Add name"
                                ></input>
                        </div>
                        <div class="search">
                            <label class="search-title">Location</label>
                            <input
                                type="text"
                                class="search-input"
                                placeholder="Add city"
                                ></input>
                        </div>
                        <div class="search">
                            <label class="search-title">Price</label>
                            <input
                                type="text"
                                class="search-input"
                                placeholder="0000-0000"
                                ></input>
                        </div>
                        <div class="search">
                            <label class="search-title">Star</label>
                            <input
                                type="text"
                                class="search-input"
                                placeholder="Add Guests"
                                ></input>
                        </div>
                        <button class="search-icon" type="submit">
                            <i class="fa-solid fa-magnifying-glass"></i>
                        </button>
                    </form>
                </div>
            </div>
            <%@ include file="/include/footer.jsp" %>
        </section>
        
    </body>
</html>
