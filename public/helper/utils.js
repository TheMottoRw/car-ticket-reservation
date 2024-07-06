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
function getLastRoute(){
    var url = document.location.pathname.split("/")
    if (!isNaN(url[url.length - 1])) url.pop();
    return url[url.length - 1];
}
function routeGuard() {
    var adminUnique = ["/mis/users", "/mis/user", "/mis/accomodations","/mis/accomodation", "/mis/tours","/mis/tour", "/mis/settings", "/mis/setting", "/mis/dashboard"];
    var ownerUnique = ["/mis/properties", "/mis/property", "/mis/profile","/mis/properties/pending","/mis/properties/completed","/mis/properties/success","/mis/owdashboard"];
    var client = ["/mis/profile","/mis/properties/pending","/mis/properties/completed","/mis/properties/success","/mis/accomodations/booking/pending","/mis/accomodations/booking/completed","/mis/tours/booking/pending","/mis/tours/booking/completed","/mis/accomodation/0/bookings","/mis/tour/0/bookings"];
    var url = window.location.pathname.split("/")
    if (!isNaN(url[url.length - 1])) url.pop();
    var lastRoute = url.join('/');

    if (localStorage.hasOwnProperty("user_type")) {
        if(localStorage.getItem("is_verified")=="false"){
            localStorage.clear();
            alert("Account should be verified");
            window.location = '/login';
        }
        switch (localStorage.getItem("user_type")) {
            case "client":
                if (client.indexOf(lastRoute) === -1) {
                    localStorage.clear();
                    window.location = '/login';
                }

                document.getElementById("menu-client-accomodation-bookings").style.display="block";
                document.getElementById("menu-client-tour-bookings").style.display="block";
                break;
            case "owner":
                if (ownerUnique.indexOf(lastRoute) === -1) {
                    localStorage.clear();
                    window.location = '/login';
                }
                document.getElementById("menu-properties").style.display="block";
                document.getElementById("menu-owner-dashboard").style.display="block";
                break;
            default://admin
                document.getElementById("menu-admin-dashboard").style.display="block";
                document.getElementById("menu-users").style.display="block";
                document.getElementById("menu-properties").style.display="block";
                document.getElementById("menu-accomodations").style.display="block";
                document.getElementById("menu-tours").style.display="block";
                // document.getElementById("menu-accomodation-bookings").style.display="block";
                // document.getElementById("menu-tour-bookings").style.display="block";
                document.getElementById("menu-settings").style.display="block";
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