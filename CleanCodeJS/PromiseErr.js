function div(a,b)
{
    if(b==0)
    {
        return Promise.reject("Divisior is zero");
    }
    else
    {
        return Promise.resolve(a/b);
    }
}
div(10,0).then(data=>console.log("Data is ",data)
                ,err=>console.error("Error ",err));