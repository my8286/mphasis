import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-switchdemo',
  templateUrl: './switchdemo.component.html',
  styleUrls: ['./switchdemo.component.css']
})
export class SwitchdemoComponent{
   public product = {
     Name: 'Nike Casuals',
     Price: 4500.55,
     Photo: 'assets/shoe.jpg',
     Description: 'Something about Nike Casuals...'
   };
   public selectedView = 'info';
   public views = ['info', 'preview', 'more'];
   public ChangeView(obj:any) {
      this.selectedView = obj.target.name;
   }
 
}