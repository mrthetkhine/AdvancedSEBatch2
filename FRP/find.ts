import { from } from "rxjs";
import { every, find,filter,map } from "rxjs/operators";
const observable = from([2, 30, 22, 5, 60, 1]); 
const observable2 = observable.pipe(find(x=>x >10));


const subscription = observable2.subscribe( 
    (value) => console.log('Find ',value)
);

const observable3 = observable.pipe(filter(x=>x >10));
observable3.subscribe( 
    (value) => console.log('Filter ',value)
);

const observable4 = observable.pipe(map(x=>x *2));
observable4.subscribe( 
    (value) => console.log('Map ',value)
);
