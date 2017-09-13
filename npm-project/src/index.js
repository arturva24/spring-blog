const $ = require("jquery");

const data = require("./data");

const math = require("./math");

console.log(math.add(10, 98));


const  hello = () => console.log("hello redwood from webpack!");

hello();

console.log(data.whichSideOfTheForce);

$("body")
    .html("<h1>Hello from jQuery</h1>")
    .css("background-color", "gray");