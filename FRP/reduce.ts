import { from } from "rxjs";
import { every, find,filter,map,max, reduce } from "rxjs/operators";
const observable = from([2, 30, 22, 5, 60, 1]); 
const observable2 = observable.pipe(reduce((x,y)=>x+y));


const subscription = observable2.subscribe( 
    (value) => console.log('Reduce ',value)
);
