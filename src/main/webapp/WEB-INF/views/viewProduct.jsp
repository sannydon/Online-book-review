<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@include file="/WEB-INF/views/template/header.jsp"%>


<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Product Detail</h1>

            <p class="lead">Here is the detail information of the product!
            </p>
        </div>

        <div class="container" ng-app = "cartApp" ng-init="productId='${product.productId}'">
            <div class="row">
                <div class="col-md-5">
                    <img src="<c:url value="/resources/images/${product.productId}.png" /> " alt="image"
                             style="width:100%"/>
                </div>

                <div class="col-md-5">
                    <h3>${product.productName}</h3>
                    <p>${product.productDescription}</p>
                    <p>
                        <strong>Category</strong> : ${product.productCategory}
                    </p>
                    <p>
                        <strong>Condition</strong> : ${product.productCondition}
                    </p>
                    <h4>${product.productPrice} USD</h4>

                    <br>

                    <c:set var="role" scope="page" value="${param.role}" />
                    <c:set var="url" scope="page" value="/product/productList" />
                  
 
                    <p >
                        <form class="form-inline" role="form" ng-controller="cartCtrl" >
            <h3>Reviews:</h3>
                <!--<div class="input-group input-group-lg" ng-repeat="rule in rules">
                 <span class="input-group-addon" id="sizing-addon1">R</span>
                 <input type="text" class="form-control" value="{{ rule.comment }}" disabled="disabled" aria-describedby="sizing-addon1">
                 </div>-->
                 <div class="well well-sm" ng-repeat="rule in rules">
                 {{ rule.comment }}
                 </div>
                <br>
                <c:if test="${pageContext.request.userPrincipal.name != null}">
            <div class="form-group">
                <input class="form-control" name="comment" ng-model="newRule" type="text" placeholder="Your comments" />
            </div>
             <a  ng-click="addRule('${product.productId}')" class="btn btn-primary">Add</a>
              </c:if>
        </form>
                    </p>
                </div>
            </div>
            
            
        </div>
 

        <script src="<c:url value="/resources/js/controller.js" /> "></script>
        <%@include file="/WEB-INF/views/template/footer.jsp" %>
