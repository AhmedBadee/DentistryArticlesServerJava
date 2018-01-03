$(document).ready(function() {

    $('#submit').click(function() {
        var title      = $('#title').val();
        var brief      = $('#brief').val();
        var body       = $('#body').val();
        var com_pro    = document.getElementById("com_pro").checked;
        var image_urls = $('#image_urls').val();

        $.ajax({
            type: 'POST',
            contentType: 'application/json',
            data: JSON.stringify({
                articleTitle: title,
                articleBrief: brief,
                articleBody : body,
                community_professional : com_pro,
                image_urls  : image_urls
            }),
            url : 'REST/AddArticle',
            success: function(result) {
                $('#result').html(result);
            }
        });
    });
});
