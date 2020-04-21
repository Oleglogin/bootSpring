<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="tmp/header.jsp"%>
<div class="main-content space-60">
    <div class="container">
        <div class="contact-form check-out space-50">
            <div class="col-md-6 padding-left-0">
                <div class="title-product">
                    <h3>Add Product</h3>
                </div>
                <!-- End title-product -->
                <c:url value="/product/add" var="addProduct"/>
                <form:form action="${addProduct}" modelAttribute="emptyProduct" enctype="multipart/form-data" class="form-horizontal">
                    <div class="form-group col-md-6">
                        <label class=" control-label" for="inputfname">Brand</label>
                        <form:input path="productBrand" type="text" class="form-control" id="inputfname" placeholder="Enter Brand"/>
                    </div>
                    <div class="form-group col-md-6">
                        <label class=" control-label" for="inputlname">Model</label>
                        <form:input path="productModel" type="text" class="form-control" id="inputlname" placeholder="Enter Model"/>
                    </div>
                    <div class="form-group col-md-6">
                        <input type="file" name="productImg" class="promo-code-form" formenctype="multipart/form-data" id="exampleformControlFile1">
                    </div>
                    <%--<div class="form-group col-md-6">--%>
                        <%--<label class=" control-label" for="inputcompany">Company Name</label>--%>
                        <%--<input type="text" class="form-control" id="inputcompany" placeholder="Enter your company name...">--%>
                    <%--</div>--%>
                    <%--<div class="form-group">--%>
                        <%--<label class=" control-label" for="inputstreet">Adress*</label>--%>
                        <%--<input type="text" class="form-control space-20" id="inputstreet" placeholder="Enter your street address...">--%>
                        <%--<input type="text" class="form-control" id="inputapartment" placeholder="Enter the apartment, floor, suite, etc...">--%>
                    <%--</div>--%>
                    <%--<div class="form-group">--%>
                        <%--<label class=" control-label" for="inputcountry">Country*</label>--%>
                        <%--<input type="text" class="form-control space-20" id="inputcountry" placeholder="Enter your country...">--%>
                    <%--</div>--%>
                    <div class="form-group col-md-6">
                        <label class=" control-label" for="inputfState">Price</label>
                        <form:input path="price" type="text" class="form-control" id="inputfState" placeholder="Price"/>
                    </div>
                    <%--<div class="form-group col-md-6">--%>
                        <%--<label class=" control-label" for="inputmail">Zip code *</label>--%>
                        <%--<input type="text" class="form-control" id="inputmail" placeholder="Enter your Zip or postal cade...">--%>
                    <%--</div>--%>
                    <div class="form-group">
                        <label  class=" control-label" for="dmessage">Description</label>
                        <form:textarea path="description" class="form-control" id="message" name="message"/>
                    </div>
                    <div class="promo-group">
                        <form:select class="js-select2" name="time" path="category">
                            <option>men</option>
                            <option>women</option>
                            <option>kid</option>
                            <option>accessories</option>
                        </form:select>

                        <form:select class="js-select2" name="time" path="subCategory">
                            <option>hardTail</option>
                            <option>roadBike</option>
                            <option>CityBike</option>
                            <option>Enduro</option>
                        </form:select>
                        <form:select path="available" class="s-select2" name="available">
                            <option>true</option>
                            <option>false</option>
                        </form:select>
                            <button class="btn link-button link-button-v2" href="#" title="REgister now">Add</button>
                    </div>
                </form:form>
            </div>
            <!-- End col-md-6 -->
            <div class="col-md-6 padding-right-0">
                <div class="title-product">
                    <h3>Product List</h3>
                </div>
                <!-- End title-product -->
                    <table class="table space-80">
                        <thead>
                            <tr>
                                <th class="product-photo">Product Photo</th>
                                <th class="produc-name">Product Brand</th>
                                <th class="description">Model</th>
                                <th class="product-price">Price</th>
                                <th class="product-quantity">available</th>
                                <th class="product-quantity">Like</th>
                                <th class="product-remove"></th>
                            </tr>
                        </thead>
                        <c:forEach items="${productList}" var="product">
                            <tbody>
                                <tr class="item_cart">
                                    <td class="product-photo">
                                        <a href="${product.id}"><img src="${product.productImg}"></a>
                                    </td>
                                    <td class="produc-name"><a href="${product.productBrand}" title=""></a></td>
                                    <td class="description">${product.productModel}</td>
                                    <td class="product-price">${product.price}</td>
                                    <td class="product-price">${product.available}</td>
                                    <td class="product-price">${product.toLike}</td>
                                    <td class="product-remove"><a href="#" title="">x</a></td>
                                </tr>
                            </tbody>
                        </c:forEach>
                    </table>
                <!-- End shipping-total -->
            </div>
            <!-- End col-md-6 -->
        </div>
    </div>
</div>
        <!-- End contact-form -->
<%@include file="tmp/footer.jsp"%>
