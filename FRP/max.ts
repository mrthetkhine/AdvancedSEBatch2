import { from } from "rxjs";
import { every, max } from "rxjs/operators";
const observable = from([2, 30, 22, 5, 60, 1]); 
const observable2 = observable.pipe(max());

const observableEvery = observable.pipe(every(x => x < 10));
const subscription = observable2.subscribe( 
    (value) => console.log('Max ',value)
);

observable.subscribe( 
    (value) => console.log(value)
);
observableEvery.subscribe( 
    (value) => console.log('Every ',value)
);
