const target = {
    message1: "hello",
    message2: "everyone",
    display:function()
    {
        console.log('Display ',this.message1);
    }
  };
  
  const handler2 = {
    get(target, propKey, receiver) {
        const origMethod = target[propKey];
        return function (...args) {
            let result = origMethod.apply(this, args);
            console.log(propKey + JSON.stringify(args)
                + ' -> ' + JSON.stringify(result));
            return result;
        };
    }
  };
  
const proxy2 = new Proxy(target, handler2);
proxy2.display();