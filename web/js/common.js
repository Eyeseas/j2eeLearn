//console.log($("#bookList"));

//console.log($("#bookList .odd a"))



$(document).ready(function () {
    $("#bookList .odd a").each(function () {
        //截取pathname /xxxxx/
        this.href = "ParseBookServlet?bookid="+this.pathname.substring(1,this.pathname.length-1);
    })
});
