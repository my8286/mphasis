import { Component} from '@angular/core';

@Component({
  selector: 'app-twowaybinding', 
  templateUrl: './twowaybinding.component.html',
  styleUrls: ['./twowaybinding.component.css']
})
export class TwowaybindingComponent 
{  
 public name = 'Samsung TV';
 public city = 'Delhi';
 public inStock = true;
 public product = {
   Name: '',
   City: '',
   InStock: false
 };
 public UpdateClick() {
   this.product = {
     Name: this.name,
     City: this.city,
     InStock: this.inStock
   };
 }
}