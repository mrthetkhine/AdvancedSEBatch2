let a = 3;
//a = "Hello";

class Bird
{
    fly()
    {
        console.log("Bird fly");
    }
}
class Aeroplane
{
    fly()
    {
        console.log("Aeroplane fly");
    }
}
let f = new Bird();
f.fly();

f = new Aeroplane();
f.fly();