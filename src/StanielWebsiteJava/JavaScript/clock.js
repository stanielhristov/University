function displayClock() {
    let now = new Date();
    let hours = now.getHours();
    let minutes = now.getMinutes();
    let seconds = now.getSeconds();

    if (hours < 10) {
        hours = "0" + hours;
    }
    if (minutes < 10) {
        minutes = "0" + minutes;
    }
    if (seconds < 10) {
        seconds = "0" + seconds;
    }

    let months = ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"];
    let month = months[now.getMonth()];
    let day = now.getDate();
    let year = now.getFullYear();
    let date = month + " " + day + ", " + year;

    let days = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"];
    let dayOfWeek = days[now.getDay()];

    document.getElementById("clock").innerHTML = hours + ":" + minutes + ":" + seconds;
    document.getElementById("date").innerHTML = date;
    document.getElementById("day").innerHTML = dayOfWeek;
}

setInterval(displayClock, 1000);