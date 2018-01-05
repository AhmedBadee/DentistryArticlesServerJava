<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta charset="utf-8">
    <title>
        Add New Article
    </title>
    <link href="css/addarticle-stylesheet.css" rel="stylesheet">
</head>
<body>
<div id="add_div">
    <form id="add_form">
        <h1>Add New Article</h1>

        <input class="box" type="text" id="title" placeholder="Title" required /><br>

        <textarea class="box" id="brief" cols="40" rows="4" placeholder="Brief" required></textarea><br>

        <textarea class="box" id="body" cols="40" rows="10" placeholder="Body" required></textarea><br>

        <label><input type="checkbox" id="com_pro"> Community Article</label><br>

        <textarea class="box" id="images_urls" cols="40" rows="2" placeholder="Images URLs"></textarea><br>

        <input type="button" id="submit" value="Submit">
    </form>
</div>
<span id="result"></span>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript" src="js/addarticle-ajax.js"></script>
</body>
</html>

<!-- <!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Add New Article</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
<div id="article">
<h1>Add New Article</h1>
<form>
<input class="box titleWidth text-all title" type="text" id="title" placeholder="Title" required/>
<textarea class="box" id="brief" cols="40" rows="4" placeholder="Brief" required></textarea>
<textarea class="box" id="body" cols="40" rows="10" placeholder="Article Body" required></textarea>

<fieldset class="box">
<label><input type="checkbox" id="com_pro"> Community</label><br>
<!-- <label for="com_pro">Community</label>
</fieldset>

<fieldset class="box">
<legend>Upload Article Images</legend>
<div id="files">
<div>
<!-- <input id="fileField" type="file" name="images[]" />
<input class="image-box text-all urls" type="text" id="images" name="images[]" placeholder="Image URL"/>
</div>
</div>
<div id="action-buttons">
<input type="button" id="add" value="+"/>
</div>
</fieldset>

<input class="box" type="submit" id="submit" value="Save Article"/>
</form>
</div>
<span id="result"></span>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript" src="js/addarticle-ajax.js"></script>
<script src="js/add-entries.js"></script>
</body>
</html> -->