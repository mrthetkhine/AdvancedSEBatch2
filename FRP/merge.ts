import { from ,interval} from "rxjs";
import { merge } from "rxjs/operators";
const observableA = interval(100);
const observableB = from([1, 10]);
const observableC = observableA.pipe(merge(observableB));
const subscription = observableC.subscribe(
    (value) => console.log(value)
);