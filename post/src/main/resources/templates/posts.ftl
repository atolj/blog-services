<!DOCTYPE html>

<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <link rel="stylesheet" href="/css/bootstrap.min.css" />
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script src="/js/bootstrap.min.js"></script>
    <title>Blog Posts</title>
</head>
<body>
    <nav class="navbar navbar-light bg-faded">
        <a class="navbar-brand" href="#">My Docker</a>
        <ul class="nav navbar-nav">
            <li class="nav-item active">
                <a class="nav-link" href="#">Blog<span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Contact</a>
            </li>

        </ul>
    </nav>
    <#--<div id="accordion" role="tablist" aria-multiselectable="true">-->
        <#--<div class="card">-->
            <#--<div class="card-header" role="tab" id="headingOne">-->
                <#--<h5 class="mb-0">-->
                    <#--<a data-toggle="collapse" data-parent="#accordion" href="#collapseOne" aria-expanded="true" aria-controls="collapseOne">-->
                        <#--Collapsible Group Item #1-->
                    <#--</a>-->
                <#--</h5>-->
            <#--</div>-->

            <#--<div id="collapseOne" class="collapse in" role="tabpanel" aria-labelledby="headingOne">-->
                <#--<div class="card-block">-->
                    <#--Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus labore sustainable VHS.-->
                <#--</div>-->
            <#--</div>-->
        <#--</div>-->

        <#--<div class="card">-->
            <#--<div class="card-header" role="tab" id="headingTwo">-->
                <#--<h5 class="mb-0">-->
                    <#--<a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">-->
                        <#--Collapsible Group Item #2-->
                    <#--</a>-->
                <#--</h5>-->
            <#--</div>-->
            <#--<div id="collapseTwo" class="collapse" role="tabpanel" aria-labelledby="headingTwo">-->
                <#--<div class="card-block">-->
                    <#--Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus labore sustainable VHS.-->
                <#--</div>-->
            <#--</div>-->
        <#--</div>-->
    <#--</div>-->
    <div id="accordion" role="tablist" aria-multiselectable="true">
        <#list posts as post>
            <div class="card">
                <div class="card-header" role="tab" id="heading-${post?counter}">
                    <h5 class="mb-0">
                        <a <#if post?counter != 1>class="collapsed"</#if> data-toggle="collapse" data-parent="#accordion" href="#collapse-${post?counter}" aria-expanded="true" aria-controls="collapseOne">
                            ${post.headline}
                        </a>
                    </h5>
                </div>

                <div id="collapse-${post?counter}" class="collapse <#if post?counter == 1>in</#if>" role="tabpanel" aria-labelledby="headingOne">
                    <div class="card-block">
                        ${post.content}
                        <br>
                        <b>Author:</b> ${post.author.name} ${post.author.surname} <b>Date:</b> ${post.postedOn}
                    </div>
                </div>
            </div>

        </#list>
    </div>
	<#--<div class="container">-->
        <#--<div class="control-group">-->
            <#--<h2 class="muted">Blogs</h2>-->
                <#--Date: ${posts}-->
            <#--<br>-->
                <#--Time: ${posts}-->
            <#--<br>-->
                <#--Message: ${message}-->
        <#--<div>-->
	<#--</div>-->
</body>

</html>