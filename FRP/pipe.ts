import { from } from "rxjs";
import { every, find,filter,map,max } from "rxjs/operators";
const observable = from([2, 30, 22, 5, 60, 1]); 
const observable2 = observable.pipe(find(x=>x >10));


const subscription = observable2.subscribe( 
    (value) => console.log('Find ',value)
);

const isOdd = (x:number)=>x%2 !=0;
const observable3 = observable.pipe(find(isOdd),filter((x:any)=>x >10),max());
observable3.subscribe( 
    (value) => console.log('Filter ',value)
);

