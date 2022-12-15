let obj = {
    name : "Tk",
    age : 28,
    address: "Somewhere"
};
function print({name,age})
{
    console.log("Name ",name, ' Age ',age);
}
print(obj);