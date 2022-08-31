
            var V=["venezuela"];
            var O=["ottawa"];
            var L=["luchemburgo"];
            var T=["tailandia"];
            var A=["africa"];
            var  palavras=[V,O,L,T,A];
            let index=0;
            let erros=0;
            let acertos=0;
            function jogar(){
            // let str=prompt("digite para qual lugar eu posso ir: ");
            let str=document.getElementById("in").value;
        
            // a array  palavra esta com o idex que a posição atual dela ou seja posição do index =0 ela 
            // esta na palavra V  
            if(str.toLowerCase().startsWith("v") && palavras[index]=== V||
               str.toLowerCase().startsWith("o") && palavras[index]=== O||
               str.toLowerCase().startsWith("l") && palavras[index]=== L||
               str.toLowerCase().startsWith("t") && palavras[index]=== T||
               str.toLowerCase().startsWith("a") && palavras[index]=== A){
   
                if(!palavras[index].includes(str)){
                    palavras[index].push(str);
                }
                alert(`acertou, você poderá ir para ${str}`);
                index+=1;
                erros=0;
           
            }else {
                erros+=1;
                if (erros === 3){
                    let ramdom = Math.floor(Math.random() * (palavras[index].length));
                    alert(`Dica: você poderia ir para ${palavras[index][ramdom]}`);
                    // RAMDOM =aleatorio
                    index=0;
                    erros=0;
                }else{
                    alert(`voce não podera  ir para  ${str}`);
                }
            }

            if(index === 5){
                index = 0;
            }
            console.log(palavras);
        }
        
        document.onreadystatechange =  () =>  { //no lugar da => poderia ser uma function
            if(document.readyState === 'complete'){
                document.getElementById("in")
                    .addEventListener("keydown", function(e) { 
                         if(e.key ===  "Enter" || e.keyValue === 13){
                            jogar() ;
            }   
        });
            }
        }