import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-example1',
  templateUrl: './example1.component.html',
  styleUrls: ['./example1.component.css']
})
export class Example1Component{

  name:string;
  email:string;
  address:address;
  hobbies:string[];
  foods:string[];
  showHobbies: boolean;
  constructor()
  {
    this.name="vinit";
    this.email="vinit@gmail.com";
    this.address=
    {
      street:'M G ROAD',
      loc:'chennei central',
      state:'tamilnadu',
      city:'chennei'
    }
    this.hobbies=['music','cricket','football','movies','sports'];
    this.foods=['rice and dal','Biryani','noodles','sweet','ice-cream'];
    this.showHobbies=false;
  }
  sayName()
  {
    console.log("my name is ",this.name);
    console.log("my email is ",this.email);
    console.log("my address is ",this.address);
  }
  Details()
  {
    this.sayName();
  } 
  toggleHobbies()
  {
   if(this.showHobbies == true)
   {
   this.showHobbies = false;
  } else  {
this.showHobbies = true;
  }
  }
  deleteFood(i:number)
  {
    this.foods.splice(i, 1);
  }
}

interface address
{
  street:string;
  loc:string;
  state:string;
  city:string;
}
