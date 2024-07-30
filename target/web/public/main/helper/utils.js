var baseUrl = document.location.origin;
var apiUrl = `${baseUrl}/api`;
var mediaUrl = baseUrl.startsWith("https")?`/media/`:`/static/assets/uploads/`;

function getUrlParams() {
    return document.URL.split("/");
}
function paymentRequestMessageChecker(){
    const urlParams = getUrlParams();
    if(urlParams[urlParams.length-1].indexOf("message=")!==-1){
        const message = urlParams[urlParams.length-1].split("&")[1].split("=")[1];
        alert(decodeURIComponent(message.replace(/\+/g, ' ')));
    }
}

// Function to calculate number of days between two dates
function daysBetweenDates(date1, date2) {
    if(typeof date1=="string") date1 = new Date(date1);
    if(typeof date2=="string") date2 = new Date(date2);
    // Convert both dates to milliseconds
    var date1_ms = date1.getTime();
    var date2_ms = date2.getTime();

    // Calculate the difference in milliseconds
    var difference_ms = Math.abs(date2_ms - date1_ms);

    // Convert the difference from milliseconds to days
    return Math.floor(difference_ms / (1000 * 60 * 60 * 24));
}
function monthsBetweenDates(date1, date2) {
    if(typeof date1=="string") date1 = new Date(date1);
    if(typeof date2=="string") date2 = new Date(date2);    // Convert both dates to milliseconds
    var date1_ms = date1.getTime();
    var date2_ms = date2.getTime();

    // Calculate the difference in milliseconds
    var difference_ms = Math.abs(date2_ms - date1_ms);

    // Convert the difference in milliseconds to days
    var difference_days = Math.floor(difference_ms / (1000 * 60 * 60 * 24));

    // Calculate number of months and remaining days
    var months = Math.floor(difference_days / 30);
    var years = Math.floor(months/12);
    var remaining_months = months % 12;
    var remaining_days = Math.floor(difference_days % 30.4);

    return { years: years,remaining_months: remaining_months,months: months, remaining_days: remaining_days,total_days:difference_days };
}

function longToDate(d){
    var timestampMillis = d*1000;
    var dateUTC = new Date(timestampMillis);
    return dateUTC;
}
function getDate(d){
    let date = longToDate(d);
    var year = date.getFullYear();
    var month = String(date.getMonth() + 1).padStart(2, '0'); // Months are zero-based
    var day = String(date.getDate()).padStart(2, '0');
    var hours = String(date.getHours()).padStart(2, '0');
    var minutes = String(date.getMinutes()).padStart(2, '0');

// Concatenate the components to form the desired format
    var formattedDate = year + '-' + month + '-' + day + ' ' + hours + ':' + minutes;

    return formattedDate;
}
function requiresLogin(){
    var token = localStorage.getItem('token');
    if(token==null){
        window.location.href = baseUrl;
    }
}
function enforceRouteGuard(allowed,route){
    if (allowed.indexOf(route) === -1) {
        localStorage.clear();
        window.location = '/login';
    }
}

function getLastRoute(){
    var url = document.location.pathname.split("/")
    if (!isNaN(url[url.length - 1])) url.pop();
    return url[url.length - 1];
}

function routeGuard() {
    requiresLogin();
    var adminUnique = ["/companies", "/company"];
    var companyUnique = ["/drivers","/driver","/destinations","/destination","/stations","/station","/schedules","/schedule","/reservations","/reservation",];
    var driverUnique = [];
    var url = window.location.pathname.split("/")
    if (!isNaN(url[url.length - 1])) url.pop();
    var lastRoute = url.join('/');

    if (localStorage.hasOwnProperty("user_type")) {
        switch (localStorage.getItem("user_type")) {
            case "admin":
                enforceRouteGuard(adminUnique,lastRoute);
                document.getElementById("menu-companies").style.display="block";

                break;
            case "company":
                enforceRouteGuard(companyUnique,lastRoute);
                document.getElementById("menu-drivers").style.display="block";
                document.getElementById("menu-destinations").style.display="block";
                document.getElementById("menu-stations").style.display="block";
                document.getElementById("menu-schedules").style.display="block";
                break;
            default://admin
                localStorage.clear();
                window.location = '/login';
        }
    }
}
var timeoutId = "";
function clearResponse(){
    clearTimeout(timeoutId);
    timeoutId = setTimeout(function (){
        document.getElementById("responseSuccess").style="display:none";
        document.getElementById("responseSuccess").innerHTML="";
        document.getElementById("responseFail").style="display:none";
        document.getElementById("responseFail").innerHTML="";

    },7000)
}