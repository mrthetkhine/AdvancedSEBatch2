function logger(obj)
{
    for(let p in obj)
    {
        if(typeof obj[p] =='function')
        {
            let oldFunc = obj[p];
            obj[p] = function()
            {
                console.log("Logger>> method ", p, " called");
                oldFunc.apply(null,arguments);
            }
        }
    }
}