<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <link rel="stylesheet" href="/css/bootstrap.min.css" />
        <!-- Custom styles for this template -->
        <link rel="stylesheet" href="/css/blog.css">
        <title>Blog Posts</title>
    </head>
    <body>
        <div class="blog-masthead">
            <div class="container">
                <nav class="nav blog-nav">
                    <a class="nav-link active" href="#">Home</a>
                    <a class="nav-link" href="#">Contact</a>
                    <a class="nav-link" href="#">About</a>
                </nav>
            </div>
        </div>
        <div class="blog-header">
            <div class="container">
                <h1 class="blog-title">The Docker Blog</h1>
                <p class="lead blog-description">An example blog shipped in containers.</p>
            </div>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-sm-8 blog-main">
                    <div id="accordion" role="tablist" aria-multiselectable="true">
                        <#list posts as post>
                            <div class="card">
                                <div class="card-header" role="tab" id="heading-${post?counter}">
                                    <h6 class="mb-0">
                                        <a <#if post?counter != 1>class="collapsed"</#if> data-toggle="collapse" data-parent="#accordion" href="#collapse-${post?counter}" aria-expanded="true" aria-controls="collapseOne">
                                            ${post.headline}
                                        </a>
                                    </h6>
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
                </div>
            </div>
        </div>
        <footer class="blog-footer">
            <p><a href="#">Back to top</a></p>
        </footer>
        <!-- Bootstrap core JavaScript
  ==================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.0.0/jquery.min.js" integrity="sha384-THPy051/pYDQGanwU6poAc/hOdQxjnOEXzbT+OuUAFqNqFjL+4IGLBgCJC3ZOShY" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.2.0/js/tether.min.js" integrity="sha384-Plbmg8JY28KFelvJVai01l8WyZzrYWG825m+cZ0eDDS1f7d/js6ikvy1+X+guPIB" crossorigin="anonymous"></script>
        <script src="/js/bootstrap.min.js"></script>
    </body>
</html>