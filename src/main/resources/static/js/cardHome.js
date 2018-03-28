$(document ).ready(function(){
    $("#playButtonId").click(function(){
        alert("Play button clicked ");
        //TO DO
    });    
    $("#buyButtonId").click(function(){
    	window.location.href="/cardBuy.html";
    });    
    $("#sellButtonId").click(function(){
    	window.location.href="/cardList.html";
    });    
});


