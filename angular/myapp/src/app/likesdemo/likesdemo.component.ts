import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-likesdemo',
  templateUrl: './likesdemo.component.html',
  styleUrls: ['./likesdemo.component.css']
})
export class LikesdemoComponent{
   public products = [
     {Name: 'JBL Speaker', Photo: 'assets/jblspeaker.webp', Likes: 0, Dislikes: 0},
     {Name: 'Nike Casuals', Photo: 'assets/shoe.jpeg', Likes: 0, Dislikes: 0},
     {Name: 'Shirt', Photo: 'assets/shirt.jpg', Likes: 0, Dislikes: 0}
   ];
   public LikesCounter(item:any){
       item.Likes++;
   }
   public DislikesCounter(item:any){
        item.Dislikes++;
   }
}