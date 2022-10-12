type Box<type = any>={
    contents?: any [],
    contentLength?:()=>number;
}

let box: Box<string>={
    contents:[],
    contentLength:()=> box.contents?.length ?? 0
};

box.contents?.push("conteudo");


let box2 :Box<number>={
    contents :[]
}
box2.contents?.push(12);


let box3 :Box<number>={
    contents :[]
}
box2.contents?.push("teste");
box3.contents?.push(123);


function tes<T>(arg : T): T{
    return arg;
}

let n: string = tes("123");






