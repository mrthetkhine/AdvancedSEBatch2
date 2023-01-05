import { of,from } from "rxjs";
const observable = of(1);
const subscription = observable.subscribe(
    (value) => console.log(value),
    (error: any) => console.log(error),
    () => console.log("Done!")
);
//subscription.unsubscribe();

const observable2 = from([1,2,3,4]);
const subscription2 = observable2.subscribe(
    (value) => console.log('Sub2 ',value),
    (error: any) => console.log(error),
    () => console.log("Done!")
);