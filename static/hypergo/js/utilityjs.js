/**
 * Created by Sin on 11/22/2016.
 */
function isAdmin(){
    var isAdmin = document.getElementsById("isAdmin").value();
    var management_link = document.getElementsById("management_link");
    if (isAdmin === "True") {
        management_link.class = "";
    } else {
        management_link.class = "hidden";
    }
}