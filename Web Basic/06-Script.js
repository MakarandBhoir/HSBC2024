function loadData() {
    let data = [
        { "studentId": 1001, "studentName": "Pallav" },
        { "studentId": 1002, "studentName": "Siddhart" },
        { "studentId": 1003, "studentName": "Janavi" },
        { "studentId": 1004, "studentName": "Tanmay" },
        { "studentId": 1005, "studentName": "Achyuta" }
    ];

    document.getElementById("student1").innerHTML = "Student ID: " + data[0].studentId + " Student Name: " + data[0].studentName;
    document.getElementById("student2").innerHTML = "Student ID: " + data[1].studentId + " Student Name: " + data[1].studentName;
}