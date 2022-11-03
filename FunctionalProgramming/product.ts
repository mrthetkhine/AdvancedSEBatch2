type Human = {
    name : string,
};
type Speciality = {
    speciality : string
}
type Doctor = Human & Speciality;
let doctor:Doctor = {
    name : "Some",
    speciality: "General Health"
}