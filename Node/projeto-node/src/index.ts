// let rect ={
//     with:20,
//     height:30
// };

// let numeros:number | String | boolean;        Definindo um TIPI para a variavel numero
//se nao tiver nada, a variavel aceita qualquer coisa

// let numeros;
// numeros= 2,"";

// let a : (String | Number) [];
// a =[];

// let f =(x: number, y: number) : number =>{
//     return x + y;
// } 

// let numeros:number;
// numeros=f(2,6);

// type Rect= {
//     width?(o sinal de interogação significa que nao é obrigatorio):number,
//     heigth:number 
// }



type Rect= {
    width?:number,
    heigth?:number 
}

type Triangle={
    angle:number,
    type:"isosceles" | "scalene" |"obtuse"
}
type Circle ={
    radius: number
}

type GeometricFigure = Rect | Triangle| Circle;

let rect : Rect={
    width:20,
};

let t: GeometricFigure  ={
    angle:45,
    type:"isosceles"
}
t={
radius:9,
}































