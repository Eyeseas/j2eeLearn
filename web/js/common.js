//console.log($("#bookList"));

//console.log($("#bookList .odd a"))



$(document).ready(function () {
    $("#bookList .odd a").each(function () {
        this.href = "bookDetialServlet?bookid="+this.pathname.substring(1,this.pathname.length-1);
    })
});
