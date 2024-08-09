
function populateData() {
    //alert("Hello");
    let xhr = new XMLHttpRequest();
    xhr.open("GET", "08-data.json", true);
    xhr.onreadystatechange = function () {
        if (xhr.readyState === 4 && xhr.status === 200) {
            let data = JSON.parse(xhr.responseText);

            for (let i = 0; i < data.length; i++) {
                let selectedId = document.getElementById("studentId").value;
                if (selectedId == data[i].studentId) {
                    document.getElementById("studentName").value = data[i].studentName;
                    break;
                }
            }
        }
    }
    xhr.send();
}