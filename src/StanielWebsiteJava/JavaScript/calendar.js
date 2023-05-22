function generateCalendar(year, month) {
    let daysInMonth = new Date(year, month + 1, 0).getDate();

    let firstDayOfMonth = new Date(year, month, 1).getDay();

    let table = document.createElement("table");
    let tbody = document.createElement("tbody");
    table.appendChild(tbody);

    let headerRow = document.createElement("tr");
    let daysOfWeek = ["Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"];
    for (let i = 0; i < 7; i++) {
        let th = document.createElement("th");
        th.textContent = daysOfWeek[i];
        headerRow.appendChild(th);
    }
    tbody.appendChild(headerRow);

    let date = 1;
    for (let i = 0; i < 6; i++) {
        let row = document.createElement("tr");
        for (let j = 0; j < 7; j++) {
            let td = document.createElement("td");
            if (i === 0 && j < firstDayOfMonth) {
                td.textContent = "";
            } else if (date > daysInMonth) {
                td.textContent = "";
            } else {
                td.textContent = date;
                if (year === new Date().getFullYear() && month === new Date().getMonth() && date === new Date().getDate()) {
                    td.classList.add("today");
                }
                date++;
            }
            row.appendChild(td);
        }
        tbody.appendChild(row);
    }

    return table;
}

let now = new Date();
let year = now.getFullYear();
let month = now.getMonth();

let calendar = document.getElementById("calendar");
calendar.appendChild(generateCalendar(year, month));
