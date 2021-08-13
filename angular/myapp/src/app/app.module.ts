import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { Example1Component } from './example1/example1.component';
import { ContactComponent } from './contact/contact.component';
import { FeedbackComponent } from './feedback/feedback.component';
import { RouterModule,Routes } from '@angular/router';

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
    FeedbackComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(appRoutes),
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
