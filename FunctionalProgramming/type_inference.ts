let data = 3;
//data = "Hello";

let str = "Hello";
//str = 3;

type NumberOrString = number | string;
let k : NumberOrString = 3;
k = "300";

type Leaf = {
    data:string
};
type Tree = Leaf | {
    children : Array<Tree>
};
let treeData:Tree = {
    children : [
        {
            data : "Child One",
        },
        {
            children: [
                {
                   data : "Child Two"
                },
                {
                    data : "Child Three"
                 },
            ]
        }
    ]
}