const $ = require("jquery");


const  hello = () => console.log("hello redwood from webpack!");

hello();

$("body")
    .html("<h1>Hello from jQuery</h1>")
    .css("background-color", "gray");