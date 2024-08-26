var colors = ["red", "green", "blue"];

function print(val) {
  console.log(val);
}

//colors.forEach(print);

colors.forEach((value, index) => {
  console.log(value + " : " + index)
  console.log(`${value} : ${index}`)
})

// console.log(colors[0]);
// console.log(colors[42]);