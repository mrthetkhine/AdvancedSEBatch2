function rectangleDraw()
{
    console.log('Rectangle draw');
}
function circleDaw()
{
    console.log('Circle draw');
}
function draw(type)
{
    funs[type]();
}
let funs = {
    'rectangle': rectangleDraw,
    'circle':circleDaw
}
draw('circle');