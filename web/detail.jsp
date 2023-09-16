<%-- 
    Document   : detail
    Created on : Jul 6, 2023, 12:20:25 PM
    Author     : tuna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="DAO.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Traveland - Detail</title>
        <link rel="stylesheet" href="style/css/detail.css"/>
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
            <div class="detail__cont">
                <div class="detail__cont-galary">
                    <div class="galary-main" style="background-image: url(style/img/${hInfo.HID}/background.jpg)">
                        <div class="host-info">
                            <div class="host-img">
                                <img src="style/icon/user.svg" alt="" />
                            </div>
                            <div class="host-desc">
                                <p style="color: white" class="host-desc-tile">Listed By:</p>
                                <p style="color: white" class="host-desc-name">${oHotel.name}</p>
                                <p style="color: white" class="host-desc-price">For: $ ${hInfo.pricemin} - $ ${hInfo.pricemax}</p>
                            </div>
                        </div>
                    </div>
                    <div class="galary-more">
                        <img src="style/img/${hInfo.HID}/image1.jpg" alt="" />
                        <img src="style/img/${hInfo.HID}/image2.jpg" alt="" />
                        <img src="style/img/${hInfo.HID}/image3.jpg" alt="" />
                        <img src="style/img/${hInfo.HID}/image4.jpg" alt="" />
                    </div>
                </div>
                <div class="detail__cont-info">
                    <div class="detail__cont-content">
                        <div class="content-header">
                            <div class="header-tile">
                                <div class="tile-name">${hInfo.name}</div>
                                <div class="tile-desc">${hInfo.address}</div>
                            </div>
                            <div class="header-icon">
                                <i class="fa-regular fa-heart"></i>
                                <i class="fa-solid fa-share-nodes"></i>
                            </div>
                        </div>
                        <div class="content-detail">
                            <c:if test="${hInfo.pool=='y'}">
                                <div class="detail-card">
                                    <i class="fa-solid fa-water-ladder"></i>
                                    <p>Pool</p>
                                </div>
                            </c:if>
                            <c:if test="${hInfo.restaurant=='y'}">
                                <div class="detail-card">
                                    <i class="fa-solid fa-utensils"></i>
                                    <p>Restaurant</p>
                                </div>
                            </c:if>
                            <c:if test="${hInfo.gym=='y'}">
                                <div class="detail-card">
                                    <i class="fa-solid fa-dumbbell"></i>
                                    <p>Gym</p>
                                </div>
                            </c:if>
                            <c:if test="${hInfo.pet=='y'}">
                                <div class="detail-card">
                                    <i class="fa-solid fa-paw"></i>
                                    <p>Pets allowed</p>
                                </div>
                            </c:if>
                            <c:if test="${hInfo.sauna=='y'}">
                                <div class="detail-card">
                                    <i class="fa-solid fa-soap"></i>
                                    <p>Sauna</p>
                                </div>
                            </c:if>
                            <c:if test="${hInfo.bar=='y'}">
                                <div class="detail-card">
                                    <i class="fa-solid fa-martini-glass"></i>
                                    <p>Bar</p>
                                </div>
                            </c:if>
                        </div>
                        <div class="content-desc">
                            <p class="desc-tile">Apartment Description</p>
                            <div class="desc-content">
                                ${hInfo.describe}
                            </div>
                        </div>
                        <div class="content-offer">
                            <div class="offer-tile">Offered Amenities</div>
                            <div class="row">
                                <div class="offer-item">
                                    <i class="fa-solid fa-utensils"></i>
                                    <p>Kitchen</p>
                                </div>
                                <div class="offer-item">
                                    <i class="fa-solid fa-utensils"></i>
                                    <p>Kitchen</p>
                                </div>
                            </div>
                            <div class="row">
                                <div class="offer-item">
                                    <i class="fa-solid fa-utensils"></i>
                                    <p>Kitchen</p>
                                </div>
                                <div class="offer-item">
                                    <i class="fa-solid fa-utensils"></i>
                                    <p>Kitchen</p>
                                </div>
                            </div>
                            <div class="row">
                                <div class="offer-item">
                                    <i class="fa-solid fa-utensils"></i>
                                    <p>Kitchen</p>
                                </div>
                                <div class="offer-item">
                                    <i class="fa-solid fa-utensils"></i>
                                    <p>Kitchen</p>
                                </div>
                            </div>
                        </div>
                        <div class="content-offer">
                            <div class="offer-tile">Safety and Hygiene</div>
                            <div class="row">
                                <div class="offer-item">
                                    <i class="fa-regular fa-clipboard"></i>
                                    <p>Daily Cleaning</p>
                                </div>
                                <div class="offer-item">
                                    <i class="fa-regular fa-clipboard"></i>
                                    <p>Daily Cleaning</p>
                                </div>
                            </div>
                            <div class="row">
                                <div class="offer-item">
                                    <i class="fa-regular fa-clipboard"></i>
                                    <p>Daily Cleaning</p>
                                </div>
                                <div class="offer-item">
                                    <i class="fa-regular fa-clipboard"></i>
                                    <p>Daily Cleaning</p>
                                </div>
                            </div>
                        </div>
                        <div class="content-nearby">
                            <div class="nearby-tile">Nearby Services</div>
                            <div class="nearby-content">
                                <c:forEach var="item" items="${fList}" varStatus="status">
                                    <div class="nearby-card">
                                        <div class="nearby-name">${VisitorDB.findVById(item.VID).name}</div>
                                        <div class="nearby-adr">${item.content}</div>
                                        <div class="nearby-star">
                                            <c:forEach var="starCount" begin="1" end="${item.star}">
                                                <i class="fa-solid fa-star"></i>
                                            </c:forEach>
                                        </div>
                                    </div>
                                </c:forEach>

                            </div>
                        </div>
                        <div class="flex">
                            <c:if test="${(role=='visitor')||(hInfo.OID==logined.OID)}">
                                <a href="addComment">
                                    <div class="bef-item">
                                        <i class="fa-regular fa-comment"></i>
                                        <p> Add Comment</p>
                                    </div> 
                                </a>
                            </c:if>

                            <c:if  test="${role=='visitor'}">
                                <a href="addFeedback">
                                    <div class="bef-item">
                                        <i class="fa-regular fa-flag"></i>
                                        <p> Add Feedback</p>
                                    </div> 
                                </a>
                            </c:if>

                        </div>
                        <div class="content-feedback">
                            <div class="feedback-header">
                                <h1 class="feedback-tile">Feedback</h1>
                                <div class="feedback-rate">
                                    <i class="fa-solid fa-star"></i>
                                    <p>5.0</p>
                                </div>
                            </div>
                            <div class="feedback-content">
                                <c:if test="${not empty cList}">
                                    <c:forEach var="i" begin="0" end="${cList.size()-1}">
                                        <c:choose>
                                            <c:when test="${cList[i].UID>=100}">
                                                <div class="feedback-card">
                                                    <div class="feedback-card-header">
                                                        <div class="feedback-user-img">
                                                            <img src="style/icon/user.svg" alt="" />
                                                        </div>
                                                        <div class="feedback-user-info">
                                                            <p class="userName">${VisitorDB.findVById(cList[i].UID).name}</p>
                                                            <p class="date">${cList[i].doc}</p>
                                                        </div>
                                                    </div>
                                                    <div class="feedback-card-cont">
                                                        ${cList[i].content}
                                                    </div>
                                                </div> 
                                            </c:when>
                                            <c:otherwise>
                                                <div class="feedback-card">
                                                    <div class="feedback-card-header">
                                                        <div class="feedback-user-img">
                                                            <img src="style/icon/user.svg" alt="" />
                                                        </div>
                                                        <div class="feedback-user-info">
                                                            <div>
                                                                <p class="userName">${OwnerDB.findOById(cList[i].UID).name}</p>
                                                                <i class="fa-solid fa-star"></i>
                                                            </div>
                                                            <p class="date">${cList[i].doc}</p>
                                                        </div>
                                                    </div>
                                                    <div class="feedback-card-cont">
                                                        ${cList[i].content}
                                                    </div>
                                                </div>
                                            </c:otherwise>
                                        </c:choose>
                                    </c:forEach>
                                </c:if>

                            </div>
                        </div>
                    </div>
                    <div class="detail__cont-table">
                        <div class="table-price"> $ ${hInfo.pricemin} - $ ${hInfo.pricemax}</div>
                        <div class="table-info">
                            <div class="table-info-perprice">
                                <p>Short Period: $ ${hInfo.pricemin}</p>
                                <p>Medium Period: $ ${hInfo.pricemax}</p>
                                <p>Long Period: $ ${hInfo.pricemax}</p>
                            </div>
                        </div>
                        <div class="table-btn">Reserve now</div>
                        <div class="table-bef">
                            <div class="bef-item">
                                <i class="fa-regular fa-building"></i>
                                <p>Property Inquiry</p>
                            </div>
                            <div class="bef-item">
                                <i class="fa-solid fa-phone"></i>
                                <p>Contact Host</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <%@ include file="/include/footer.jsp" %>
        </section>
    </body>
</html>
