<%-- 
    Document   : addhotel
    Created on : Jul 7, 2023, 5:09:37 PM
    Author     : tuna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style/css/add.css"/>
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
                            <h1 class="title">Add new hotel</h1>
                        </div>
                        <form style="margin-bottom: 40px;" action="addhotel" method="post" class="form-group" enctype="multipart/form-data">
                            <div class="form-group">
                                <label class="label">Name</label>
                                <input class="input" type="text" name="name">
                            </div>
                            <div class="form-group">
                                <label class="label">Describle</label>
                                <input class="input" type="text" name="describe">
                            </div>
                            <div class="form-group">
                                <label class="label">Address</label>
                                <input class="input" type="text" name="address">
                            </div>
                            <div class="form-group">
                                <label class="label" >Phone number</label>
                                <input class="input" type="text" name="phone">
                            </div>
                            <div class="form-group">
                                <label class="label">Price Max</label>
                                <input class="input"type="text" name="pricemax">
                            </div>
                            <div class="form-group">
                                <label class="label">Price Min</label>
                                <input class="input"type="text" name="pricemin">
                            </div>

                            <div class="form-header">
                                <h1 class="title">Services</h1>
                            </div>
                            <div class="form-list">
                                <div class="form-group">
                                    <div class="form-group row">
                                        <input class="input-checkbox" type="checkbox" name="restaurant">
                                        <label  class="label">Restaurant</label>
                                    </div>
                                    <div class="form-group row">
                                        <input class="input-checkbox" type="checkbox" name="pool">
                                        <label  class="label">Pool</label>
                                    </div> 
                                    <div class="form-group row">
                                        <input class="input-checkbox" type="checkbox" name="gym">
                                        <label  class="label">Gym</label>
                                    </div> 
                                    <div class="form-group row">
                                        <input class="input-checkbox" type="checkbox" name="pet">
                                        <label  class="label">Pet allow</label>
                                    </div>   
                                    <div class="form-group row">
                                        <input class="input-checkbox" type="checkbox" name="bar">
                                        <label  class="label">Bar</label>
                                    </div>
                                    <div class="form-group row">
                                        <input class="input-checkbox" type="checkbox" name="sauna">
                                        <label  class="label">Sauna</label>
                                    </div>
                                </div>
                            </div>
                            
                              <div class="form-header">
                                <h1 class="title">Images</h1>
                            </div>
                             <div class="form-list">
                                <div class="form-group">
                                    <div class="form-group row">
                                        <input class="input" type="file" name="background">
                                        <label  class="label">Background</label>
                                    </div>
                                    <div class="form-group row">
                                        <input class="input" type="file" name="image1">
                                        <label  class="label">Image 1</label>
                                    </div> 
                                    <div class="form-group row">
                                        <input class="input" type="file" name="image2">
                                        <label  class="label">Image 2</label>
                                    </div> 
                                    <div class="form-group row">
                                        <input class="input" type="file" name="image3">
                                        <label  class="label">Image 3</label>
                                    </div>   
                                    <div class="form-group row">
                                        <input class="input" type="file" name="image4">
                                        <label  class="label">Image 4</label>
                                    </div>
                                </div>
                            </div>
                            <div class="button-group">
                                <button class="button" type="submit">Add new place</button>
                            </div>
                        </form>
                    </div>
                </div>
                <%@ include file="/include/footer.jsp" %>
            </div>
        </section>
    </body>
</html>
