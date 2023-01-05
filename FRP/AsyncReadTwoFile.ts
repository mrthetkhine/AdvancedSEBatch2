import { bindNodeCallback,combineLatest } from "rxjs";
import * as fs from "fs";
const observableFactory = bindNodeCallback(fs.readFile);
const observable1 = observableFactory("./package.json");
const observable2  = observableFactory("./hello.js");

const observable3 = combineLatest(observable1,observable2);
const subscription = observable3.subscribe(
    (value) => console.log(value.toString())
);
