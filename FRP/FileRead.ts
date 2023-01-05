import * as fs from "fs";
fs.readFile('./package.json',(err:any,data:any)=>{
    console.log('Data ',data.toString());
});