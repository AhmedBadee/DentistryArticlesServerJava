$(document).ready(function () {
    var rootURL = '/DentistryArticles/REST/';

    $.ajax({
        type: 'GET',
        url : rootURL + 'Articles/',
        dataType: 'json',
        success : function(result) {
            $('#result').html(result);
        }
    });
});
