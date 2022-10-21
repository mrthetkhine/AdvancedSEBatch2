function Event()
{
    let handler = [];

    function addHandler(func)
    {
        handler.push(func);
    }
    function trigger(msg)
    {
        console.log('Trigger Event',msg);
        handler.forEach(h=>h(msg));
    }
    return {
        addHandler,
        trigger,
    }
}
let e1 = Event();
e1.addHandler((eve)=>console.log('Handler one ',eve));
e1.addHandler((eve)=>console.log('Handler two ',eve));

e1.trigger('Msg1');
e1.trigger('Msg2');