interface Pingable{
    ping():void;
}


class Point{
    private _x:number=0;
    private y:number=0;
    readonly name: string="Thais Point";

    constructor(otherName? : string){
        if(otherName !== undefined){
            this.name = otherName;
        }
    }


    static jump = () => console.log(`jump`);
    
    ping = (): void => console.log("ping");
    
    printPoint=() =>`X: ${this.x}, Y:${this.y}`;
    



    get x(): number{
        return this._x;
    }

    set x(val: number){
        this._x = val;
    }
}


class DPoint extends Point {
    z:number =0;

    printPoint=()=>{
        return super.printPoint() + `X:${this.x}, Y${this.y}, Z: ${this.z}`
    }
}

type TPoint={
    x: number,
    y:number
}

let p =new Point("dsjfi");
p.x=12;
// p.y=6;
console.log(p.printPoint);
p.name

Point.jump();




class CBox<T> {
    _contents : T[] = [];

    addItem = (item :T ) => this._contents.push(item);

    removerItem = () => this._contents.pop();

    get contents(){
        return this._contents;
    }
    set contents(val : T[]){
        this._contents = val;
    }



































