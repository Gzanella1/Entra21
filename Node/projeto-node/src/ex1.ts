type User ={
name:string,
age:number,
occupation:string
};

const users: User[]=[
    {
        name:"max",
        age:25,
        occupation:"student"
    },
    {
        name:"Kate",
        age:23,
        occupation:"singer"
    }
];
function logPerson(user:User){
    console.log(`- ${user.name}, ${user.age}`)
}
console.log("Useer: ");
users.forEach(logPerson);