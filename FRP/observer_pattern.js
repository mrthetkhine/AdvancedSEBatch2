class Observable{
    
    constructor(name)
    {
        this.name = name;
    }
    subscribers = [];

    addSubscriber(sub)
    {
        this.subscribers.push(sub);
    }
    change(data)
    {
        console.log('Observable '+this.name+' change ',data);
        for(let sub of this.subscribers)
        {
            sub.notify(data);
        }
    }
}
class Observer
{
    constructor(name)
    {
        this.name = name;
    }
    notify(data)
    {
        console.log('Observer '+this.name+' notify ',data);
    }
}
let model = new Observable('Model');
let view1 = new Observer("View 1");
let view2 = new Observer("View 2");
let view3 = new Observer("View 3");

model.addSubscriber(view1);
model.addSubscriber(view2);
model.addSubscriber(view3);

model.change("new update");