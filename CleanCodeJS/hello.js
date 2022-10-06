var a = 3;
//a = "Hello";
var Bird = /** @class */ (function () {
    function Bird() {
    }
    Bird.prototype.fly = function () {
        console.log("Bird fly");
    };
    return Bird;
}());
var Aeroplane = /** @class */ (function () {
    function Aeroplane() {
    }
    Aeroplane.prototype.fly = function () {
        console.log("Aeroplane fly");
    };
    return Aeroplane;
}());
var f = new Bird();
f.fly();
f = new Aeroplane();
f.fly();
