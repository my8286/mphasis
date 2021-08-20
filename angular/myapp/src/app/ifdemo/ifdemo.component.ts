import { Component} from '@angular/core';

@Component({
  selector: 'app-ifdemo',
  templateUrl: './ifdemo.component.html',
  styleUrls: ['./ifdemo.component.css']
})
export class IfdemoComponent {
   public product = {
     Name: 'Nike Casuals',
     Price: 4500.55,
     Photo: 'assets/shoe.jpeg'
   };
   public showImage = false;
   public btnText = 'Show';
   public TogglePreview() {
      this.showImage = (this.showImage==false)?true:false;
      this.btnText = (this.btnText=='Show')?'Hide':'Show';
   }
}