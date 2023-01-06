import { from ,interval} from "rxjs";
import { merge ,zip} from "rxjs/operators";
const observableA = from([1, 2, 3, 3, 4, 5]); 
const observableB = from(["A", "B", "C", "D"]);
const observableC = observableA.pipe(zip(observableB));
const subscription = observableC.subscribe( (value) => console.log(value)
);
