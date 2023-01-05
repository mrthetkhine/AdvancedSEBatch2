const fs = require("fs");
console.log("Before file read");
fs.readFile('./hello2.txt',(err,data)=>{
    console.log('Data ',data.toString().length);
});
console.log("After file read");