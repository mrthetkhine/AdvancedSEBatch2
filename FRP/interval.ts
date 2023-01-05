import { interval } from "rxjs";
const observable = interval(1000);
const subscription = observable.subscribe(
    (value) => console.log(value),
    (error: any) => console.log(error),
    () => console.log("Done!")
);