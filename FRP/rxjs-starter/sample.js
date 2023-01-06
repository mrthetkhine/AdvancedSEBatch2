import { of,fromEvent,interval } from 'rxjs';
import { throttle, mapTo, scan } from "rxjs/operators";
const observable = fromEvent(document, "click");
const observable2 = observable.pipe(mapTo(1))
.pipe(throttle(x => interval(1000)))
.pipe(scan((acc, one) => acc + one, 0));
const subscription = observable2.subscribe(
    (value) => console.log(value)
);