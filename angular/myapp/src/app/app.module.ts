import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { Example1Component } from './example1/example1.component';
import { ContactComponent } from './contact/contact.component';
import { FeedbackComponent } from './feedback/feedback.component';
import { RouterModule,Routes } from '@angular/router';
import { IfdemoComponent } from './ifdemo/ifdemo.component';
import { TwowaybindingComponent } from './twowaybinding/twowaybinding.component';
import { ShoppingcartComponent } from './shoppingcart/shoppingcart.component';
import { FordemoComponent } from './fordemo/fordemo.component';
import { SwitchdemoComponent } from './switchdemo/switchdemo.component';
import { LikesdemoComponent } from './likesdemo/likesdemo.component';

const appRoutes: Routes=[
  {path:'Login', component: LoginComponent},
  {path:'Register',component: RegisterComponent},
  {path:'Contact',component: ContactComponent},
  {path:'Feedback',component: FeedbackComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    Example1Component,
    ContactComponent,
    FeedbackComponent,
    IfdemoComponent,
    TwowaybindingComponent,
    ShoppingcartComponent,
    FordemoComponent,
    SwitchdemoComponent,
    LikesdemoComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(appRoutes),
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
