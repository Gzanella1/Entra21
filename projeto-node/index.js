const express = require("express")//pegando a dependencia 
const app= express(); //criando um app 
const port =3000 //criando uma porta

app.get("/",(req,res) => {
    res.send("ola");
})

app.listen(port,()=>{
console.log(``);
})






