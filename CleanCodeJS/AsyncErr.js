function doSomething()
{
    setTimeout(()=>{
        console.log("Now doSomething");
        throw Error("Got some error");
    },1000);
    
}
try
{
    doSomething();
    console.log("After do someting");
}
catch(e)
{
    console.log("Error=>> ",e);
}
console.log("Done");