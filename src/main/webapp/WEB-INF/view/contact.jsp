<%@include file="tmp/header.jsp"%>

<div class="main-content">
    <div class="container">
        <ul class="breadcrumb">
            <li><a href="#">Home</a></li>
            <li class="active">Contact us </li>
        </ul>
        <div class="space-padding-tb-60 row">
            <div class="col-md-4">
                <div class="feature-box feature-box-v3 feature-box-center space-30">
                    <div class="fbox-icon">
                        <a href="#"><i class="icons fa fa-map-marker"></i></a>
                    </div>
                    <div class="fbox-body">
                        <h4>Our Address</h4>
                        <p>C4 Building - My Dinh - Hanoi</p>
                    </div>
                </div>
            </div>
            <!-- End col-md-4 -->
            <div class="col-md-4">
                <div class="feature-box feature-box-v3 feature-box-center space-30">
                    <div class="fbox-icon">
                        <a href="#"><i class="icons fa fa-envelope-o"></i></a>
                    </div>
                    <div class="fbox-body">
                        <h4>Our Email</h4>
                        <p>engotheme@gmail.com</p>
                    </div>
                </div>
            </div>
            <!-- End col-md-4 -->
            <div class="col-md-4">
                <div class="feature-box feature-box-v3 feature-box-center space-30">
                    <div class="fbox-icon">
                        <a href="#"><i class="icons fa fa-phone"></i></a>
                    </div>
                    <div class="fbox-body">
                        <h4>Our Phone</h4>
                        <p>Make your phone order to:</p>
                        <p>(+84) 988 992 085</p>
                    </div>
                </div>
            </div>
            <!-- End col-md-4 -->
        </div>
        <!-- End padding-tb-60 -->
    </div>
    <!-- End container -->
    <div class="contact-content">
        <div id="googleMap" class="col-md-6"></div>
        <div class="col-md-6 space-padding-50 contact-form contact-form-bg">
            <h3 class="space-50">send us a message</h3>
            <form class="form-horizontal">
                <div class="form-group col-md-6">
                    <label class=" control-label" for="inputName">Name</label>
                    <input type="text" class="form-control" id="inputName" placeholder="Name">
                </div>
                <div class="form-group col-md-6">
                    <label class=" control-label" for="inputEmail">Email</label>
                    <input type="text" class="form-control" id="inputEmail" placeholder="Email">
                </div>
                <div class="form-group col-md-12">
                    <label class=" control-label" for="message">Message</label>
                    <textarea class="form-control" id="message" name="message"></textarea>
                    <div class="checkbox space-10">
                    </div>
                    <button class="btn link-button" type="submit">Send your message</button>
                </div>
            </form>
        </div>
    </div>
    <!-- End contact content -->
</div>
<!-- End MainContent -->
<%@include file="tmp/footer.jsp"%>
