<!DOCTYPE html>

<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <link rel="stylesheet" href="/css/bootstrap.min.css" />
	<script src="/js/bootstrap.min.js"></script>
    <title>Blog Posts</title>
</head>
<body>
	<div class="container">
        <div class="control-group">
            <h2 class="muted">Blogs</h2>
            Date: ${time?date}
            <br>
            Time: ${time?time}
            <br>
            Message: ${message}
        <div>
	</div>
</body>

</html>