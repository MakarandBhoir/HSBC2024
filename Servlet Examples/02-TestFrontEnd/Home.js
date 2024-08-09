function loadData() {
    //alert("calling...")
    let xhr = new XMLHttpRequest();
    xhr.open("GET", "http://localhost:9090/02-TestWebApi/TestApiServlet", true);
    xhr.onreadystatechange = function () {
        if (xhr.readyState === 4 && xhr.status === 200) {
            let data = JSON.parse(xhr.responseText);
            //alert(data);
            document.getElementById("result").innerHTML = data.message;
        }
    }
    xhr.send();
}