$(document).ready(function() {

    $.ajax({
        type: 'GET',
        url : 'REST/Articles',
        dataType: 'json',
        success : function(result) {
            // $('#result').html(JSON.stringify(result));
            var articles = JSON.parse(JSON.stringify(result));
            for (i = 0; i < articles.length; i++) {
                $('#articles').append('<div id="article">'
                                  + '<h2>' + articles[i].articleTitle + '</h2>'
                                  + '<h3>' + articles[i].articleBrief + '</h3>'
                                  + '<a href=/REST/Article/id/' + articles[i].articleId + '>Read Full Article</a>'
                                  + '</div>');
            }
        }
    });
});
