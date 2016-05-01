<%@include file="/WEB-INF/views/template/header.jsp" %>



<!-- Carousel
================================================== -->
<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>
    <div class="carousel-inner" role="listbox">
        <div class="item active">
            <img class="first-slide home-image"
                 src="<c:url value="/resources/images/carasol1.jpg" />"
                 alt="First slide">

            <div class="container">
                <div class="carousel-caption">
                    <h1>Welcome to Online book review system</h1>

                    <p>Before buying anything you see its reviews online to make sure we are buying the right thing. </p>

                </div>
            </div>
        </div>
        <div class="item">
            <img class="second-slide home-image"
                 src="<c:url value="/resources/images/carasol2.jpg" />"
                 alt="Second slide">

            <div class="container">
                <div class="carousel-caption">
                    <h1>Facts You Should Know About Information Technology</h1>

                    <p>Information technology (IT) is the application of computers to store, retrieve, transmit and manipulate data, often in the context of a business or other enterprise.</p>

                </div>
            </div>
        </div>
        <div class="item">
            <img class="third-slide home-image"
                 src="<c:url value="/resources/images/carasol3.jpg" />"
                 alt="Third slide">

            <div class="container">
                <div class="carousel-caption">
                    <h1>It's A Jazz Affair</h1>

                    <p>Through ups and downs, Somehow I manage to survive in life.</p>

                </div>
            </div>
        </div>
    </div>
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
    </a>
</div>
<!-- /.carousel -->


<!-- Marketing messaging and featurettes
================================================== -->
<!-- Wrap the rest of the page in another container to center all the content. -->

<div class="container marketing">

    <!-- Three columns of text below the carousel -->
    <div class="row">
        <div class="col-lg-4">
            <a class="btn btn-default" href="<c:url value="/product/productList?searchCondition=Database" />"
               role="button">
                <img class="img-circle" src="<c:url value="/resources/images/databaseManagement.jpg" />" alt="Instrument
                Image" width="140" height="140"></a>

            <h2>Database</h2>
            <p>Checkout all database related book here</p>

        </div><!-- /.col-lg-4 -->



    <div class="row">
        <div class="col-lg-4">
            <a class="btn btn-default" href="<c:url value="/product/productList?searchCondition=Programming" />"
               role="button">
                <img class="img-circle" src="<c:url value="/resources/images/programming.png" />" alt="Instrument
                Image" width="140" height="140"></a>

            <h2>Programming</h2>
            <p>Checkout all programming related books here</p>

        </div><!-- /.col-lg-4 -->

    <div class="row">
        <div class="col-lg-4">
            <a class="btn btn-default" href="<c:url value="/product/productList?searchCondition=MobileComputing" />"
               role="button">
                <img class="img-circle" src="<c:url value="/resources/images/mobilecomputing.jpg" />" alt="Instrument
                Image" width="140" height="140"></a>

            <h2>Mobile Computing</h2>
            <p>Checkout all Mobile application development books here</p>

        </div><!-- /.col-lg-4 -->


    </div><!-- /.row -->
<div id="fb-root"></div>
<script>(function(d, s, id) {
  var js, fjs = d.getElementsByTagName(s)[0];
  if (d.getElementById(id)) return;
  js = d.createElement(s); js.id = id;
  js.src = "//connect.facebook.net/en_US/sdk.js#xfbml=1&version=v2.6";
  fjs.parentNode.insertBefore(js, fjs);
}(document, 'script', 'facebook-jssdk'));</script>
<div class="fb-like" style="float: right;" data-href="https://www.facebook.com/search/top/?q=edureka" data-width="100" data-layout="standard" data-action="like" data-show-faces="true" data-share="true"></div>
 <br><br>  
    <%@include file="/WEB-INF/views/template/footer.jsp" %>

