import { of,fromEvent } from 'rxjs';

const observable = fromEvent(document, "click");
const subscription = observable.subscribe(
    (value) => console.log(value)
);