<%@ page contentType="text/html;charset=UTF-8" %>
<html>
    <head>
        <meta charset="utf-8">
        <title>
            Add Article
        </title>
        <link href="css/addarticle-stylesheet.css" rel="stylesheet">
    </head>
    <body>
        <div id="add_div">
            <form id="add_form">
                <label for="title">Title</label>
                <input type="text" id="title"><br>

                <label for="brief">Brief</label>
                <input type="text" id="brief"><br>

                <label for="body">Body</label>
                <input type="text" id="body"><br>

                <label for="com_pro">Community</label>
                <input type="checkbox" id="com_pro"><br>

                <label for="image_urls">Image Urls</label>
                <input type="text" id="image_urls"><br>

                <input type="button" id="submit" value="Submit">
            </form>
        </div>
        <span id="result"></span>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script type="text/javascript" src="js/addarticle-ajax.js"></script>
    </body>
</html>
