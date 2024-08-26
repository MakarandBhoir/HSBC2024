var colors = ["red", "green", "blue"];

function capitalize(val) {
  return val.toUpperCase();
}

// var capitalizedColors = colors.map(capitalize);

let capitalizedColors = colors.map((val) => val.toUpperCase())

console.log(capitalizedColors);
