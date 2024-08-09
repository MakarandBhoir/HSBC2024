function addStudent() {
    //alert("function called.");
    let studentId = document.getElementById("id").value;
    let studentName = document.getElementById("name").value;
    let studentScore = document.getElementById("score").value;

    let data = "studentId=" + studentId + "&studentName=" + studentName + "&studentScore=" + studentScore;

    let xhr = new XMLHttpRequest();
    xhr.open("POST", "http://localhost:9090/StudentApi/StudentApiServlet", true);
    xhr.onreadystatechange = function () {
        if (xhr.readyState == 4 && xhr.status == 200) {
            alert(xhr.responseText);
            let response = JSON.parse(xhr.responseText);
            // add this to ui
            getStudents();
        }
    }
    xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    xhr.send(data);
}

function getStudents() {
    let xhr = new XMLHttpRequest();
    xhr.open("GET", "http://localhost:9090/StudentApi/StudentApiServlet", true);
    xhr.onreadystatechange = function () {
        if (xhr.readyState === 4 && xhr.status === 200) {
            alert(xhr.responseText);
        }
    }
    xhr.send();
}