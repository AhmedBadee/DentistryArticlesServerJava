$(document).ready(function() {
    var rootURL = '/DentistryArticlesMaven/REST/';

    $.ajax({
        type: 'GET',
        url : rootURL + 'Articles/',
        dataType: 'json',
        success : function(result) {
            // $('#result').html(JSON.stringify(result));
            var articles = JSON.parse(JSON.stringify(result));
            for (i = 0; i < articles.length; i++) {
                $('#articles').append('<div id="article">'
                                  + '<h2>' + articles[i].articleTitle + '</h2>'
                                  + '<h3>' + articles[i].articleBrief + '</h3>'
                                  + '<a href="'+ rootURL + 'Articles/' + articles[i].articleId + '" >Read Full Article</a>'
                                  + '</div>');
            }
        }
    });
});
